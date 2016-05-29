package kelas;

public class ClassMember
{
	int i=2;
	
	ClassMember(){ 
		System.out.println("di kontruktor..");
	}
	void showI(){
		System.out.println(i);
	}
	public static void main(String[] args){ 
		ClassMember cm = new ClassMember();
		cm.showI();
	}
}
