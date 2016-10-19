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
public class ComparationDemo {

    public static void main(String[] args) {
        boolean x;
        x = (2 == 5.0/2); // false // equal to
        System.out.println("(2 == 5.0/2) = " + x);
        x = (2 != 3); // true // not equal to
        System.out.println("(2 != 3) = " + x);
        x = (2 > 3); // false // greater than
        System.out.println("(2 > 3) = " + x);
        x = (2 < 3); // true // less than
        System.out.println("(2 < 3) = " + x);
        x = (2 >= 3); // false // greater than or equal to
        System.out.println("(2 >= 3) = " + x);
        x = (2 <= 3); // true // less than or equal to
        System.out.println("(2 <= 3) = " + x);
    }
}
