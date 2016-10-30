package com.codencare.learning.kelas;

public class ConstructorDemo {

    public static void main(String[] args) {
        AClass c = new AClass();
        AClass d = new AClass(4);
        c.showI();
        d.showI();
    }
}

class AClass {
    //ini variable/field, i = 0;

    int i;

    /**
     * Ini default constructor, tanpa parameter
     */
    AClass() {
        i = 2;
    }

    /**
     * Ini constructor dengan parameter
     */
    AClass(int i) {
        this.i = i;
    }

    void showI() {
        System.out.println("i:" + i);
    }
}
