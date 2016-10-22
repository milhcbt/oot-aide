/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.primitif;

/**
 *
 * @author iman
 */
public class PrimitivePassingDemo {
    public static void main(String[] args) {
        int z = 10;
        System.out.println("z sebelum doSomething() => " + z);
        doSomething(z);
        System.out.println("z sesudah doSomething() => " + z);
    }
    
    public static void doSomething(int z){
        z++;
    }
}
