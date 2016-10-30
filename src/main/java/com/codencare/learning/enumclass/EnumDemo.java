/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.enumclass;

import java.util.Random;

/**
 *
 * @author iman
 */
public class EnumDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int iHari = r.nextInt(8);
        if(iHari==IHari.RABU){
            System.out.println("Wilujeung sumping ka Bandung");
        }else if (iHari == IHari.KAMIS){
            System.out.println("Welcome to Bandung");
        }else if(iHari == IHari.JUMAT){
            System.out.println("Jangan lupa pakai batik");
        }else{
            System.out.println("just another great day in Bandung");
        }
        //Hari hari = r.nextInt(8);//incompatible types: int cannot be converted to Hari
        //if(hari == 1) {}//incomparable types: Hari and int
        //ingat (type) safety first!
        Hari minggu = Hari.MINGGU;//hari sekarang hanya bisa di isi Hari-2 yang telah ditentukan.
        for(Hari h:Hari.values()){
            System.out.println(h);
        }
        
        Hari hariAcak = Hari.values()[iHari];
         if(hariAcak==Hari.RABU){
            System.out.println("Wilujeung sumping ka Bandung");
        }else if (hariAcak == Hari.KAMIS){
            System.out.println("Welcome to Bandung");
        }else if(hariAcak == Hari.JUMAT){
            System.out.println("Jangan lupa pakai batik");
        }else{
            System.out.println("just another great day in Bandung");
        }
        
        
    }
}

enum Hari{
    MINGGU,SENIN,SELASA,RABU,KAMIS,JUMAT,SABTU;
}
/**
 * Enum yang membutuhkan nilai tambahan
 * @author iman
 */
enum BHari{//
    MINGGU(1),SENIN(2),SELASA(3),RABU(4),KAMIS(5),JUMAT(6),SABTU(7);
    
    private final int value;
    BHari(int value){this.value = value;}
    
    public int getValue() {
        return value;
    }
}