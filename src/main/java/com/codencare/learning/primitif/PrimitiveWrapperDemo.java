package com.codencare.learning.primitif;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iman
 */
public class PrimitiveWrapperDemo {
    public static void main (String[] args){
        byte b1Max = Byte.MAX_VALUE;
        Byte b2Max = Byte.MAX_VALUE;
        byte b1Min = Byte.MIN_VALUE;
        Byte b2Min = Byte.MIN_VALUE;
        
        System.out.println("b1Max:"+b1Max);
        System.out.println("b2Max:"+b2Max);
        System.out.println("b1Min:"+b1Min);
        System.out.println("b2Min:"+b2Min);
        
        int intString = Byte.parseByte("A", 16);
        int i1 = new Integer(5);///auto unboxing, unnecessary
        int i2 = 5;//
        Integer i3 =  5;//auto boxing 
        int i4 = i3.intValue();
        long longValue1 = i3.longValue();
    }
}
