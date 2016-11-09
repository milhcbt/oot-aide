package com.codencare.learning.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("jakarta");
        set.add("bandung");
        for(String s : set){
            
            System.out.println("memiliki hurup a: "+s.contains("a"));
        }
     
        System.out.println("list");
        List list = new ArrayList();
        list.add("jakarta");
        list.add("bandung");
        list.add(null);
        list.add(null);
        for(Object o : list){
            System.out.println(o);
        }
    }
 
    void modifSet( Set s){
        s.add(7);
    }
}
