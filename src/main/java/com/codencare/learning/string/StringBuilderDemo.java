/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.string;

/**
 *
 * @author iman
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String [] as = "the quick brown fox jumps over the lazy dog".split(" ");
        long start = System.nanoTime();
        String hasilSalah = gabungSalah(as);
        long duration = System.nanoTime()-start;
        System.out.printf("hasilSalah:%s | %d nano second | usedMem:%d\n",
                hasilSalah,duration,usedMem());
        start = System.nanoTime();
        String hasilCepat = gabungCepat(as);
        duration = System.nanoTime()-start;
        System.out.printf("hasilCepat:%s | %d nano second | usedMem:%d\n",
                hasilCepat,duration,usedMem());
        start = System.nanoTime();
        String hasilAman = gabungAman(as);
        duration = System.nanoTime()-start;
        System.out.printf("hasilAman:%s | %d nano second | usedMem:%d\n",
                hasilAman,duration,usedMem());
    }
    
    static String gabungSalah(String... as){
      String retVal="";
      for (String s : as) {
          retVal += s;
      } 
      return retVal;
    }
    static String gabungAman(String... as){
        StringBuffer sb = new StringBuffer();
        for(String s: as){
            sb.append(s);
        }
        return sb.toString();
    }
    static String gabungCepat(String... as){
        StringBuilder sb = new StringBuilder();
        for(String s: as){
            sb.append(s);
        }
        return sb.toString();
    }
    
    static public long usedMem() {
        return Runtime.getRuntime().totalMemory() 
                - Runtime.getRuntime().freeMemory();
    }
}
