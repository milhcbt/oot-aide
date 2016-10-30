package com.codencare.learning.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
