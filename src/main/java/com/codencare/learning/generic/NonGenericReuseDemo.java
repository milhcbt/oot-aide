/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.generic;

/**
 *
 * @author iman
 */
public class NonGenericReuseDemo {

    public static void main(String[] args) {

        Bucket strBucket = new Bucket("Hello");
        Bucket floatBucket = new Bucket(5.2F);
        NumberBucket intBucket = new NumberBucket(1, "Hello");
        NumberBucket douBucket = new NumberBucket(5.2, "Aloha");
        //GNumberBucket<String> strNumBucket = new GNumberBucket<>("Yeah","Aloha");// inferred type does not conform to upper bound(s)

        System.out.println("strBucket field type:" + strBucket.getFieldType());
        System.out.println("floatBucket field type:" + floatBucket.getFieldType());
        System.out.println("intBucket field type:" + intBucket.getFieldType());
        System.out.println("douBucket field type:" + douBucket.getFieldType());
        System.out.println("intBucket num type:" + intBucket.getNumType());
        System.out.println("douBucket num type:" + douBucket.getNumType());
//        System.out.println(strBucket.field.toUpperCase());
//        System.out.println("Not a Number? " + floatBucket.field.isNaN());
    }
}

class Bucket {

    public Object field;

    public Bucket(Object field) {
        this.field = field;
    }

    public String getFieldType() {
        return field.getClass().getName();
    }
}

class NumberBucket extends Bucket {

    public Number num;

    public NumberBucket(Number num, Object field) {
        super(field);
        this.num = num;
    }

    public String getNumType() {
        return num.getClass().getName();
    }
}
