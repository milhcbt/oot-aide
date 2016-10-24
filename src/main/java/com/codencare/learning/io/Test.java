package com.codencare.learning.io;

import java.io.*;
class  Test
{
	public static void main(String[] args) 
        throws IOException 	{
		Reader in;
        if (args.length == 0)
            in = new InputStreamReader(System.in);
        else
            in = new FileReader(args[0]);
        char input [] = new char[10] ;
        System.out.println("read:"+in.read(input)+" characters here they are: \n");
        for(int i = 0; i<input.length;i++) {
            System.out.print(input[i]);
        }
	}
}
