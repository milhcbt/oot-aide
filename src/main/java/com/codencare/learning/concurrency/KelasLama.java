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
public class KelasLama {

    static /*synchronized*/ public void prosesYangLama() {
        try {
            System.out.print("Mulai...");
            Thread.sleep(100);
            System.out.println("...Selesai");
        } catch (InterruptedException ex) {
        }
    }
}
