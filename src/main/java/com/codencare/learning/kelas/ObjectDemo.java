/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.kelas;

import java.util.Objects;

/**
 *
 * @author iman
 */
public class ObjectDemo {

    public static void main(String[] args) {
        {
            Child oc1 = new Child(1, "satu");
            Child oc2 = new Child(1, "satu");
            Child oc3 = new GrandChild(1, "satu", -1);
            Child oc4 = new GrandChild(1, "satu", -2);
            System.out.print(oc1);
            System.out.println(" | hashcode:" + oc1.hashCode());
            System.out.print(oc2);
            System.out.println(" | hashcode:" + oc2.hashCode());
            System.out.println("oc1 == oc2 : " + (oc1 == oc2));
            System.out.println("oc1.equals(oc2) : " + (oc1.equals(oc2)));
            System.out.print(oc3);
            System.out.println(" | hashcode:" + oc3.hashCode());
            System.out.print(oc4);
            System.out.println(" | hashcode:" + oc4.hashCode());
            System.out.println("oc3 == oc2 : " + (oc3 == oc2));
            System.out.println("oc3.equals(oc2) : " + (oc3.equals(oc2)));
            System.out.println("oc3 == oc4 : " + (oc3 == oc4));
            System.out.println("oc3.equals(oc4) : " + (oc3.equals(oc4)));

        }
        System.gc();

    }
}

class Child extends Object {

    int i;
    String text;

    public Child(int i, String text) {
        this.i = i;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Child{" + "i=" + i + ", text=" + text + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.i;
        hash = 83 * hash + Objects.hashCode(this.text);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Child other = (Child) obj;
        if (this.i != other.i) {
            return false;
        }
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        return true;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalized");
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clonned");
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}

class GrandChild extends Child {

    int j;

    public GrandChild(int i, String text, int j) {
        super(i, text);
        this.j = j;
    }

    @Override
    public String toString() {
        return "GrandChild{"+super.toString() + "j=" + j + '}';
    }
}
