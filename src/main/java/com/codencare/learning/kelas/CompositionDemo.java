/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.kelas;

/**
 *
 * @author iman
 */
public class CompositionDemo {

    public static void main(String[] args) {
        Pesawat pesawat = new Pesawat(new Navigasi());
    }
}

class Pesawat {

    Navigasi navigasi;

    public Pesawat(Navigasi navigasi) {
        this.navigasi = navigasi;
    }

}

class Navigasi {
}
