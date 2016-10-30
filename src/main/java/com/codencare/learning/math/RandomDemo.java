/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.math;

import java.util.Random;

/**
 *
 * @author iman
 */
public class RandomDemo {

    public static void main(String[] args) {
        Random r1 = new Random(27);
        Random r2 = new Random(27);
        for (int i = 0; i < 10; i++) {
            System.out.print("r1= "+r1.nextInt()+", r2 = "+r2.nextInt()+" \n");
        }
        System.out.println("r1.equals(r2) ==> "+r1.equals(r2));
    }
}
