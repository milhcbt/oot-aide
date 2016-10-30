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
public class BitwiseDemo {

    public static void main(String[] args) {
        int Z = 5;
        System.out.println("Z = " + Z);

        System.out.println("5 | 4 = " + (5 | 4)); // 101 | 100 = 101 (5) // or
        System.out.println("5 ^ 4 = " + (5 ^ 4)); // 101 ^ 100 = 001 (1) // xor
        System.out.println("5 << 4 = " + (4 << 1));// 100 << 1 =1000 (8) // left shift
        System.out.println("5 >> 4 = " + (4 >> 1));// 100 >> 1 = 10 (2) // right shift
        System.out.println("5 >>> 4 = " + (4 >>> 1));// 100 >>>1 = 10 (2) // zero-fill
        // right shift
        System.out.println("~ 4 = " + ~4); // ~00000100 = 11111011 (-5) // invert

        System.out.println("Z &= 5 ==>" + (Z &= 5)); // "and" and assign
        System.out.println("Z |= 5 ==>" + (Z |= 5)); // or and assign
        System.out.println("Z ^= 5 ==>" + (Z ^= 5)); // xor and assign
        System.out.println("Z <<= 5 ==>" + (Z <<= 5)); // left shift and assign
        System.out.println("Z >>= 5 ==>" + (Z >>= 5)); // right shift and assign
        System.out.println("Z >>>= 5 ==>" + (Z >>>= 5)); // right shift and assign (move sign bit)
    }
}
