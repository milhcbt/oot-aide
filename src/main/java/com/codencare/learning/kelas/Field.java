package com.codencare.learning.kelas;

public class Field {
	int i1;
	private int i2;
	private int i3 = 0;
	private static int i4=0;
	
	public static void main(String [] args){ 
	    System.out.println("i1:"+i4); 
		System.out.println("j2:"+FieldJuga.j2);
		//error, j1 gak bisa di akses krn private
		//System.out.println("j1"+FieldJuga.j1);
		/* i2 dan i3 bukan static sehingga
		hanya bisa diakses/digunakan object
		object= class di inisialisasi pakai new
		*/
		Field f = new Field();
		System.out.println("i2:"+f.i2);	
		System.out.println("i3:"+f.i3);
	}
}

class FieldJuga{ 
	private static int j1;
	static int j2;
}
