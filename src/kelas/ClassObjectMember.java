package kelas;

public class ClassObjectMember
{
	int i=2;
	static int j=4;
	void showI(){
		System.out.println("i: "+i);
	}
	static void showJ(){
		System.out.println("j: "+j);
	}
	
	public static void main(String[]args){
		ClassObjectMember.showJ();
		ClassObjectMember com = new 
			ClassObjectMember();
		com.showI();
	}
}
