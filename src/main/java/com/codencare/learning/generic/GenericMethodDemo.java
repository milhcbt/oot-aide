/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.generic;

/**
 *
 * @author iman
 */
public class GenericMethodDemo {

    public static void main(String[] args) {
        RuangBangun rb = new SegiTiga(2, 5);
        System.out.println("Keliling Segitiga: " + Metrik.jumlahKeliling(rb));
    }
}

class Metrik {

    public static <T extends RuangBangun> Number jumlahKeliling(T x) {
        return x.getKeliling();
    }
}

class SegiTiga implements RuangBangun<Integer> {

    int alas, tinggi;

    public SegiTiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public Integer getKeliling() {
        return alas * tinggi / 2;
    }
}
