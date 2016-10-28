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
public class ChoicesDemo {

    public static void main(String[] args) {
        boolean benar = true, salah = false;
        if (benar) {
            System.out.println("the truth always win");
        }
        
        if (salah) System.out.println("the truth is out there");
                
        if (salah) {
            System.out.println("jika tidak salah");
        } else {
            System.out.println("maka benar");
        }
        
        int x = 5, y = 6;
        String terbilang;
        if(x == 0) terbilang = "Nol";
        else if (x == 1) terbilang = "Satu";else if (x == 2) terbilang = "Dua";
        else if (x == 3) terbilang = "Tiga";else if (x == 4) terbilang = "Empat";
        else if (x == 5) terbilang = "Lima"; else if (x == 6) terbilang = "Enam";
        else if (x == 7) terbilang = "Tujuh";else if (x == 8) terbilang = "Delapan";
        else if (x == 9) terbilang = "Sembilan";
        else terbilang = "tak dikenal";
        
        System.out.println("terbilang = "+terbilang);
	int bilangTerbesar = x > y? x : y; 
	System.out.println("bilangTerbesar = " +bilangTerbesar);
    }
}
