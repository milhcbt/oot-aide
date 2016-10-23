/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.operator;

/**
 *
 * @author iman
 */
public class FloatingPointOperatorDemo {
    public static void main (String [] args){
        double X = 2.0, Y = 5.0, Z = 6.0;
        double min = Double.MIN_VALUE, max = Double.MAX_VALUE;
        System.out.println("X + Y = " + X + Y); // Penyambungan String 2.05.0
        System.out.println("X + Y = " + (X + Y));// Penambahan double 7.0
        System.out.println("max = " + max);
        System.out.println("max + 1 = " + (max + 1));
        System.out.println("min = " + min);
        System.out.println("min - 1 = " + (min - 1));

        System.out.println("5 / 2 = " + (Y / X));
        System.out.println("5 % 2 = " + (Y % X));
        System.out.println("6 / 2 = " + (Z / X));
        System.out.println("6 % 2 = " + (Z % X));
        System.out.println("5 x 2 = " + (Y * X));
    }
}
