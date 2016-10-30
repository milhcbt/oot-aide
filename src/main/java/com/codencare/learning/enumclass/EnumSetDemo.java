/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.enumclass;

import java.util.EnumSet;

/**
 *
 * @author iman
 */
public class EnumSetDemo {

    public enum HakAkses {
        CREATE, READ, UPDATE, DELETE
    }

    public static void main(String[] args) {
        final EnumSet<HakAkses> hak = EnumSet.noneOf(HakAkses.class);
        hak.addAll(EnumSet.range(HakAkses.CREATE, HakAkses.DELETE)); // Aktif semua
        hak.removeAll(EnumSet.of(HakAkses.UPDATE, HakAkses.DELETE)); // Dimatikan sebagian
        assert EnumSet.of(HakAkses.CREATE, HakAkses.READ).equals(hak); // cek
        System.out.println(hak);
    }
}
