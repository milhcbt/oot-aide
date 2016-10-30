package com.codencare.learning.controlflow;

public class LoopingDemo {

    public static void main(String[] args) {
        int batasAtas = 10, batasBawah = 0;
        System.out.println("demo for:");
        for (int i = batasBawah; i < batasAtas; i++) {
            System.out.println(i);
        }
        int counter = 0;
        System.out.println("demo while");
        while (counter < batasAtas) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("demo do...while");
        do {
            counter--;
            System.out.println(counter);
        } while (counter > batasBawah);

        //for each in collection module
    }
}
