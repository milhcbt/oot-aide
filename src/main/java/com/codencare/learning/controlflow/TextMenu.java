package main.java.com.codencare.learning.controlflow;
import java.io.*;

public class TextMenu
{
	static int printMenu(){
		int jawaban=0;
		System.out.println("---------Pilih Menu----------");
		System.out.println("1. Ayam Goreng");
		System.out.println("2. Sate Kambing");
		System.out.println("3. Steak Sapi");
		System.out.println("x. Lagi Diet");
		try{
			jawaban = System.in.read();
		}catch(IOException e){e.printStackTrace();}
		return jawaban;
	}
	
	public static void main(String[] args){
		int jawaban = 0;
		while (jawaban != 'x'){
			jawaban = printMenu();
			switch jawaban
			case '1': System.out.println("ayam goreng");end;
			case '2':
		}
	}
}
