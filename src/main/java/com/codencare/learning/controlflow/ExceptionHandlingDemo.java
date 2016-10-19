/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.controlflow;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iman
 */
public class ExceptionHandlingDemo {

    public static int getInput() {
        int retVal = -1;
        try {
            retVal = System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return retVal;
    }

    public static int bagiRata(int total, int pembagi) throws TidakRataException {
        if (total % pembagi != 0) {
            throw new TidakRataException();
        }
        return total / pembagi;
    }

    public static void main(String[] args) {
        System.out.println(getInput());

        try {
            bagiRata(9, 2);
        } catch (TidakRataException ex) {
            ex.printStackTrace();
        }

        System.out.println(" 1/0 = " + 1 / 0);

    }

}

class TidakRataException extends Exception {

    public TidakRataException() {
        super("Total tidak habis dibagi pembagi");
    }
}
