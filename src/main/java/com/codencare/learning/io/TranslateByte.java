package com.codencare.learning.io;

import java.io.*;

class TranslateByte {

    public static void main(String[] args)
            throws IOException {
        byte from = (byte) args[0].charAt(0);
        byte to = (byte) args[1].charAt(0);
        int b;
        while ((b = System.in.read()) != -1) {

            if (b == from) {
                System.out.write(to);
            } else {
                System.out.write(b);
            }
        }
    }
}
