/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.enumclass;

/**
 *
 * @author iman
 */
public class BitFieldDemo {

    public static final int CREATE = 1 << 0; // 1
    public static final int READ = 1 << 1; // 2
    public static final int UPDATE = 1 << 2; // 4
    public static final int DELETE = 1 << 3; // 8

    public static void main(String[] args) {
        final HakAkses hakAkses  = new HakAkses();
        hakAkses.enableAll(CREATE, READ, UPDATE, DELETE);
        hakAkses.disable(UPDATE);
        hakAkses.toggle(DELETE);
        print(hakAkses);
    }

    private static void print(HakAkses hak) {
        assert hak.isEnabled(CREATE) == true;
        assert hak.isEnabled(READ) == true;
        assert hak.isEnabled(UPDATE) == false;
        assert hak.isEnabled(DELETE) == false;

        System.out.println("CREATE: " + hak.isEnabled(CREATE));
        System.out.println("READ: " + hak.isEnabled(READ));
        System.out.println("UPDATE: " + hak.isEnabled(UPDATE));
        System.out.println("DELETE: " + hak.isEnabled(DELETE));
    }

}

class HakAkses {

    private int hak = 0;

    public boolean isEnabled(final int flag) {
        return (hak & flag) == flag;
    }

    public int current() {
        return hak;
    }

    public void enable(final int flag) {
        hak |= flag;
    }

    public void disable(final int flag) {
        hak &= ~flag;
    }

    public void toggle(final int flag) {
        hak ^= flag;
    }

    public void enableAll(final int... flags) {
        for (final int flag : flags) {
            enable(flag);
        }
    }
}
