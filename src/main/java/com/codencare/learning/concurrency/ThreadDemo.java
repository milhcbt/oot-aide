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
        GanjilThread gt = new GanjilThread(4);
        gt.start();
        System.out.println("End of Program");
    }
}

class GanjilThread extends Thread {

    int start;

    GanjilThread(int start) {
        if (start % 2 != 0) {
            this.start = ++start;
        } else {
            this.start = start;
        }
    }

    public void run() {
        while (true) {
            System.out.println(start);
            start +=2;
        }
    }
}
