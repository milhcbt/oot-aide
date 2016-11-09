/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.gofpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iman
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Container con = new Container();
//        con.operation();
        Component lingkaran = new Lingkaran();
        con.add(lingkaran);
        con.add(new Segitiga());
        con.add(new Text("ini text"));
        con.add(new Segiempat());
//        con.operation();
        con.remove(lingkaran);
//        con.operation();
        Wadah wadah = new Wadah();
        con.add(wadah);
        wadah.add(lingkaran);
        wadah.add(new Segitiga());
        con.operation();
    }
}

abstract class Component{
    public abstract void operation();
}
class Container extends 
        Component{
    List<Component> children = new ArrayList<Component>();
    public void add(Component c){
        children.add(c);
    }
    public void remove(Component c){children.remove(c);}
    public void getChild(Component c){/*get component*/}

    @Override
    public void operation() {
        System.out.println("mulai.....");
        for(Component c: children){  
            c.operation(); 
        }
         System.out.println("....selesai");
    }
}

class Segitiga extends Component{
    @Override
    public void operation() {
        System.out.println("menggambar segitiga");
    }   
}
class Lingkaran extends Component{
    @Override
    public void operation() {
        System.out.println("menggambar lingkaran");
    }   
}
class Text extends Component{
    String text;
    public Text(String text){this.text = text;}
    @Override
    public void operation() {
        System.out.println(text);
    }   
}
class Segiempat extends Component{
    @Override
    public void operation() {
        System.out.println("menggambar segiempat");
    }   
}
class Wadah extends Container{
    @Override
    public void operation() {
        System.out.println("wadah----");
        for(Component c : children){
            c.operation();
        }
        System.out.println("----wadah");
    }   
}