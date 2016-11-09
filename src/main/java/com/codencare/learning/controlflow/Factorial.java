/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.controlflow;

/**
 *
 * @author iman
 */
public class Factorial {
    //Print factorial of n
    public static void main(String[] args) {
        //set an initial breakpoint at this statatement
        int n = 20;
        int factorial = 1;
        
        //n! = 1*2*3...*n
        for(int i = 1; i<= n;i++){
            factorial = factorial * i;
        }
        System.out.println("The Factorial of"+n+" is "+ factorial);
    }
    
}
