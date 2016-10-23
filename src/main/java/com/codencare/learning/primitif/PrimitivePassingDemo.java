/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.primitif;

import java.math.BigInteger;

/**
 *
 * @author iman
 */
public class PrimitivePassingDemo {

    public static void main(String[] args) {
        int z = 10;
        System.out.println("z sebelum foo() => " + z);
        foo(z);
        System.out.println("z sesudah foo() => " + z);
        MyInt x = new MyInt(10);
        System.out.println("x sebelum foo() => " + x.i);
        foo(x);
        System.out.println("x sesudah foo() => " + x.i);
        String s = new String("hello ");
        System.out.println("s sebelum foo() => " + s);
        foo(s);
        System.out.println("s sesudah foo() => " + s);
        StringBuilder sb = new StringBuilder("hello ");
        System.out.println("sb sebelum foo() => " + sb);
        foo(sb);
        System.out.println("sb sesudah foo() => " + sb);
    }

    public static void foo(int z) {
        z++;
    }

    public static void foo(MyInt x) {
        x.i +=1;
    }

    public static void foo(String s) {
        s += "world";
    }

    public static void foo(StringBuilder s) {
        s.append("world");
    }
}

class MyInt{
    int i;
    MyInt(int i){
        this.i = i;
    }
}