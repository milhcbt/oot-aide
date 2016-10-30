package com.codencare.learning.io;

import java.io.*;

class PrimitiveEditor {

    public static void main(String[] args)
            throws IOException {
        Reader in;
        in = new InputStreamReader(System.in);
        Writer out;
        if (args.length == 0) {
            out = new FileWriter("File_" + System.currentTimeMillis());
        } else {
            out = new FileWriter(args[0]);
        }
        int ch = in.read();
        while (ch != -1) {
            out.write(ch);
            ch = in.read();
        }
        in.close();
        out.close();
    }
}
