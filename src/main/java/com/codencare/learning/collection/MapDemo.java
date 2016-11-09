package com.codencare.learning.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map m = new HashMap();
        for(int i = 0; i<100;i++){
            m.put(i, "nilai "+i);
        }
        
        for (Object o : m.keySet()) {
            System.out.println(m.get(o));
        }
    }
}
