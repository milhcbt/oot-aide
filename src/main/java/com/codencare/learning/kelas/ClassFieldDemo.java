package com.codencare.learning.kelas;

public class ClassFieldDemo
{
	public static void main(String[] args){ 
		ClassMember cm = new ClassMember();
		System.out.println(cm.i);
                cm.i = 5;
                System.out.println(cm.i);
	}
}

class ClassMember{
	int i=2;

	ClassMember(){ 
		System.out.println("di kontruktor..");
	}
}
