package com.codencare.learning.concurrency;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA. User: Iman Date: Feb 16, 2006 Time: 9:50:40 PM To
 * change this template use File | Settings | File Templates.
 */
public class SimpleWebServer extends Thread {

    public static final int HTTP_PORT = 1099;
    protected ServerSocket listener;

    public SimpleWebServer() {
        try {
            listener = new ServerSocket(HTTP_PORT);
        } catch (IOException e) {
            System.err.println("Gak bisa menjalankan web server karena" + e.getMessage());
        }
        System.out.println("Start vListening at port :" + HTTP_PORT);
        this.start();
    }

    public void run() {
        try {
            while (true) {
                Socket client = listener.accept();
                Connection connection = new Connection(client);
                System.out.println("reading client");
            }
        } catch (IOException e) {
            System.err.println("Gagal menerima koneksi dari client karena: " + e.getMessage());
        }
    }

    public static void main(String[] Args) {
        new SimpleWebServer();
    }
}
