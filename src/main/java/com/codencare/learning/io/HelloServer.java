package com.codencare.learning.io;

import java.io.*;
import java.net.*;
public class HelloServer 
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket server = new ServerSocket(9999);
        System.out.println("Server Ready");
        Socket clientSocket = server.accept();
         BufferedReader is = new BufferedReader (new InputStreamReader(
            clientSocket.getInputStream()));
        DataOutputStream os = new DataOutputStream(clientSocket.getOutputStream());
        String line = is.readLine();
        System.out.print("we received: "+line);
        os.writeBytes("Hello too Client!!!\n");
        os.close();
        is.close();
        clientSocket.close();
	}
}
