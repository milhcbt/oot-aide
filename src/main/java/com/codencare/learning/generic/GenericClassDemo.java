package com.codencare.learning.generic;

public class GenericClassDemo {

    public static void main(String[] args) {
        Bucket<String> strBucket = new Bucket<String>("Hello");
        Bucket<Float> floatBucket = new Bucket<Float>(5.2F);
        NumberBucket<Integer> intBucket = new NumberBucket<>(1);
        NumberBucket<Double> douBucket = new NumberBucket<>(5.2);
        //NumberBucket<String> strNumBucket = new NumberBucket<>("Aloha");// inferred type does not conform to upper bound(s)

        System.out.println("strBucket field type:" + strBucket.getFieldType());
        System.out.println("floatBucket field type:" + floatBucket.getFieldType());
        System.out.println("intBucket field type:" + intBucket.getFieldType());
        System.out.println("douBucket field type:" + douBucket.getFieldType());

        System.out.println(strBucket.field.toUpperCase());
        System.out.println("Not a Number? " + floatBucket.field.isNaN());
    }
}

class Bucket<T> {

    public T field;

    public Bucket(T field) {
        this.field = field;
    }

    public String getFieldType() {
        return field.getClass().getName();
    }
}

class NumberBucket<T extends Number> {

    public T field;

    public NumberBucket(T field) {
        this.field = field;
    }

    public String getFieldType() {
        return field.getClass().getName();
    }
}
