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
public class GanjilThread extends Thread {

    int start;
    int end;

    GanjilThread(int start,int end) {
        if (start % 2 != 0) {
            this.start = start;
        } else {
            this.start = ++start;
        }
        this.end = end;
    }

    public void run() {
        while (start<end) {
            System.out.println(start);
            start += 2;
            KelasLama.prosesYangLama();
        }
    }
}
