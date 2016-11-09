package com.codencare.learning.io;

import java.io.*;

class Mahasiswa implements Serializable {
    static final long serialVersionUID = 42L;
    public String name;//these field public for simplicity  
    public int age;//they are should be covered by accessor&muttator

    public Mahasiswa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

public class ObjectSerialization {

    public static void main(String[] args)
            throws IOException {
        Mahasiswa m = new Mahasiswa("Badu", 21);
        FileOutputStream fileOut = new FileOutputStream(m.name + ".dat");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(m);
        FileInputStream fileIn = new FileInputStream(m.name + ".dat");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        System.out.println(m.toString());
    }
}
