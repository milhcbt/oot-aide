package com.codencare.learning.kelas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iman
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        Truk truk = new Truk();
        truk.jalan("Bandung");
        truk.parkir("Gasibu");
    }
}


abstract class Mobil implements Kendaraan{
    
    Mobil(){
        System.out.println("Mobil Contructor");
    }

    public void parkir(String tempat){
        System.out.println(this.getClass().getSimpleName()+" kendaraan telah diparkir di "+ tempat);
    }
}

class Truk extends Mobil{

    Truk(){
        System.out.println("Truk Constructor");
    }
    @Override
    public void jalan(String tujuan) {
        System.out.println( this.getClass().getSimpleName()+" jalan menuju "+ tujuan);
    }
    
}