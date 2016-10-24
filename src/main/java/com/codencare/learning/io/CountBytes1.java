package com.codencare.learning.io;

import java.io.*;

class CountBytes1 {

    public static void main(String[] args)
            throws IOException {
        InputStream in;
        if (args.length == 0) {
            in = System.in;
        } else {
            in = new FileInputStream(args[0]);
        }

        int total = 0;
        int i = 0;
        while (i != -1) {
            i = in.read();
            System.out.print((char) i); //not every byte could be displayed
            total++;
        }

        System.out.println(total + " bytes");
    }
}
