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
public class IntegerOperatorsDemo {

    public static void main(String[] args) {
        int X = 2, Y = 5, Z = 6;
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;

        System.out.println("X + Y = " + (X + Y));
        System.out.println("max = " + max);
        System.out.println("max + 1 = " + (max + 1));
        System.out.println("min = " + min);
        System.out.println("min - 1 = " + (min - 1));

        System.out.println("5 / 2 = " + (Y / X));
        System.out.println("5 % 2 = " + (Y % X));
        System.out.println("6 / 2 = " + (Z / X));
        System.out.println("6 % 2 = " + (Z % X));
        System.out.println("5 x 2 = " + (Y * X));
        System.out.println("Z +=5 ==> Z = " + (Z += 2));
        System.out.println("Z -=5 ==> Z = " + (Z -= 2));
        System.out.println("Z *=5 ==> Z = " + (Z *= 2));
        System.out.println("Z /=2 ==> Z = " + (Z /= 2));
        System.out.println("Z %=2 ==> Z = " + (Z %= 2));

        System.out.println("");
    }
}
