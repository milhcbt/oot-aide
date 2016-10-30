package com.codencare.learning.concurrency;

import java.net.Socket;
import java.io.*;

/**
 * Created by IntelliJ IDEA. User: Iman Date: Feb 16, 2006 Time: 9:32:56 PM To
 * change this template use File | Settings | File Templates.
 */
public class Connection extends Thread {

    private Socket client;
    private BufferedReader request;
    private DataOutputStream response;

    public Connection(Socket client) {
        this.client = client;
        try {
            request = new BufferedReader(new InputStreamReader(client.getInputStream()));
            response = new DataOutputStream(client.getOutputStream());
            System.out.println("mulai menerima stream dari client");
        } catch (IOException e) {
            System.err.println("Stream dari client gak bisa dibaca karena" + e.getMessage());
            try {
                client.close();
            } catch (IOException ex) {
                System.err.println("Gagal menutup koneksi client karena: " + ex.getMessage());
            }
        }
        this.start();
    }

    public void run() {
        try {
            response.writeBytes("HTTP/1.1 200 OK\r\n");
            //response.writeBytes("Content-Type: text\\html\r\n\r\n");
            response.writeBytes("<html><h1>Request Anda adalah:</h1>");
            response.writeBytes("<h2>Header</h2>");
            String strRequest;
            int size = 0;
            while ((strRequest = request.readLine()).length() > 0) {
                response.writeBytes(strRequest + "<br>");
                if (strRequest.contains("Content-Length")) {
                    int index = strRequest.indexOf(':');
                    String s = strRequest.substring(index + 1).trim();
                    size = Integer.parseInt(s);
                }
            }
            response.writeBytes("<h2>Body</h2>");
            int c;
            for (int i = 0; i < size; i++) {
                c = request.read();
                response.writeChar(c);
            }
            response.writeBytes("</html>");
            client.close();
        } catch (IOException e) {
            System.err.println("Ga bisa baca request karena: " + e.getMessage());

        } catch (Exception ex) {
            System.err.println("Ga bisa baca request karena: " + ex.getMessage());
        }

    }
}
