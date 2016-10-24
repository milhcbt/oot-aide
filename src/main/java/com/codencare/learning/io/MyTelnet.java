package com.codencare.learning.io;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class MyTelnet
{
	static private PrintWriter out;
    static private BufferedReader ic;
    static private Scanner in;
    
    static private String read(boolean conn){
        if(conn){
            return in.nextLine();
        }
        else{
            StringBuilder sb = new StringBuilder();
            while(in.hasNextLine()){
                sb.append(in.nextLine()+"\n");
            }
            return sb.toString();
        }
    }
    static private void write(boolean conn,String s){
        if(conn)
            out.println(s);
        else
            out.println(s+"\n");
            
    }
    public static void main(String[] args) 
        throws IOException,NumberFormatException{
		Socket client;
		boolean persistent;
		if(args.length == 0){
            client= new Socket("localhost",23);
			persistent = false;
		}
        else if (args.length == 3){
			client = new Socket(args[0], Integer.parseInt(args[1]));
			in = new Scanner(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(),true);
			ic = new BufferedReader(new InputStreamReader(System.in));
			String message ="";
			persistent = Boolean.parseBoolean(args[2]);
            if(persistent){
                System.out.println(read(persistent));
            }
			do{
				message = ic.readLine();
				System.out.println("writing: "+message.length()+" chars");
				
                write(persistent,message);
				System.out.println("sent:\n"+message);
				System.out.println("respond:\n"+read(persistent));
			}while(!message.equalsIgnoreCase("BYE") && persistent);
			out.flush();
			in.close();
			out.close();
			client.close();
		}
		else{
			System.out.println("BAD Parameters");
			System.out.println("use: java MyTelnet");
			System.out.println("or");
			System.out.println("use: java MyTelnet <server>"+
				" <port> <persisten:true|false>");
		}
	}
}