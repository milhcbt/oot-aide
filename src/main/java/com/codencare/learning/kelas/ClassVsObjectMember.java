package com.codencare.learning.kelas;

public class ClassVsObjectMember
{
	public static void main(String[]args){
		ClassObjectMember.showJ();
		ClassObjectMember com = new 
			ClassObjectMember();
		com.showI();
		com.i++;
		com.j++;
		ClassObjectMember.showJ();
		com.showI();
		com.showJ();
	}
} 

class ClassObjectMember{
	int i=2;
	static int j=4;
	void showI(){
		System.out.println("i: "+i);
	}
	static void showJ(){
		System.out.println("j: "+j);
	}
}
