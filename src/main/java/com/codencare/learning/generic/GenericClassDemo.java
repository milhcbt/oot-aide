package com.codencare.learning.generic;

public class GenericClassDemo {

    public static void main(String[] args) {
        GBucket<String> strBucket = new GBucket<String>("Hello");
        GBucket<Float> floatBucket = new GBucket<Float>(5.2F);
        GNumberBucket<Integer> intBucket = new GNumberBucket<>(1, "Hello");
        GNumberBucket<Double> douBucket = new GNumberBucket<>(5.2, "Aloha");
//        GNumberBucket<String> strNumBucket = new GNumberBucket<>("Yeah","Aloha");// inferred type does not conform to upper bound(s)

        System.out.println("strBucket field type:" + strBucket.getFieldType());
        System.out.println("floatBucket field type:" + floatBucket.getFieldType());
        System.out.println("intBucket field type:" + intBucket.getFieldType());
        System.out.println("douBucket field type:" + douBucket.getFieldType());
        System.out.println("intBucket num type:" + intBucket.getNumType());
        System.out.println("douBucket num type:" + douBucket.getNumType());

        System.out.println(strBucket.field.toUpperCase());
        System.out.println("Not a Number? " + floatBucket.field.isNaN());
    }
}

class GBucket<T> {

    public T field;

    public GBucket(T field) {
        this.field = field;
    }

    public String getFieldType() {
        return field.getClass().getName();
    }
}

class GNumberBucket<N extends Number> extends GBucket<String> {

    public N num;

    public GNumberBucket(N num, String field) {
        super(field);
        this.num = num;
    }

    public String getNumType() {
        return num.getClass().getName();
    }
}
