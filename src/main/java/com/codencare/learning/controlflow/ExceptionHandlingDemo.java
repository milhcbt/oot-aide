/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author iman
 */
public class ExceptionHandlingDemo {

    public static int getInput() {
        int retVal = -1;
        System.out.println("Insert Number:");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            retVal = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException ex) {
            ex.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return retVal;
    }

    public static int bagiRata(int total, int pembagi) throws TidakRataException {
        if (total % pembagi != 0) {
            throw new TidakRataException(total, pembagi);
        }
        return total / pembagi;
    }

    public static int bagiAdil(int total, int pembagi) throws ArithmeticException {
        if (total % pembagi != 0) {
            throw new ArithmeticException("gak adil");
        }
        return total / pembagi;
    }

    public static void main(String[] args) {
        int total = getInput(), pembagi = getInput();
        int value = 0;
        try {
            value = bagiRata(total, pembagi);
        } catch (TidakRataException ex) {
            ex.printStackTrace();
        }
        System.out.println("masing-masing dapat: " + value);

        total = getInput();
        pembagi = getInput();
        int hasil = bagiAdil(total, pembagi);
        System.out.println("masing-masing dapat: " + hasil);
        System.out.println(" 1/0 = " + 1 / 0);

    }

}

class TidakRataException extends Exception {

    public TidakRataException(int total, int pembagi) {
        super(total + " tidak habis dibagi " + pembagi);
    }
}

class TidakAdilException extends RuntimeException {

    public TidakAdilException(int total, int pembagi) {
        super(total + " tidak habis dibagi " + pembagi);
    }
}
