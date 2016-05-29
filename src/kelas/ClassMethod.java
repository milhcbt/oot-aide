package kelas;
/**
kelas ini mendemokan method
*/
public class ClassMethod
{
	int sum(int x, int y){
		return x + y;
	}
	int sum(int ... a){
		int s=0;
		for(int i:a) s+=i;
		return s;
	}
	
	public static void main(String[] args){
		ClassMethod cm = new ClassMethod();
		System.out.println(cm.sum(2,4));
		System.out.println(cm.sum(1,2,3,4));
	}
}
