/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.concurrency;

/**
 *
 * @author iman
 */
public class ThreadDemo {

    public static void main(String[] args) {
        GanjilThread ganjil = new GanjilThread(4,100);
        Thread genap = new Thread(new GenapThread(4,100));
        ganjil.start();
        genap.start();
        System.out.println("End of Program");
    }
}
