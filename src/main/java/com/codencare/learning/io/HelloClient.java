package com.codencare.learning.io;

import java.io.*;
import java.net.*;
public class HelloClient 
{
	public static void main(String[] args) 
        throws IOException,NumberFormatException{
        PrintWriter out;
        BufferedReader in;
        Socket client;
		if(args.length == 0)
            client= new Socket("localhost",8189);
        else
            client = new Socket(args[0], Integer.parseInt(args[1]));
        in = new BufferedReader (new InputStreamReader(client.getInputStream()));
        out = new PrintWriter(client.getOutputStream());
        out.println("Hello Server !!!");
        out.flush();
        System.out.print(in.readLine());
        in.close();
        out.close();
        client.close();
	}
}