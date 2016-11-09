package com.codencare.learning.string;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iman
 */
public class ImmutableDemo {
    public static void main(String[] args) {
        String kota = "Bandung";
        String asal = "Bandung";
        System.out.println(kota.hashCode());
        System.out.println(asal.hashCode());
        asal += " kota";
        System.out.println(kota.hashCode());
        System.out.println(asal.hashCode());
    }
}

class StringUtilities{
    public String sambung (String a, String b){
       return  a += b;
    }
}
