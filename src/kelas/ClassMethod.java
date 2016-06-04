package kelas;
/**
kelas ini mendemokan method
*/
public class ClassMethod
{
	public static void main(String[] args){
		Math m = new Math();
		System.out.println(m.sum(2,4));
		System.out.println(m.sum(1,2,3,4));
	}
}

class Math{
	int sum(int x, int y){
		return x + y;
	}
	int sum(int ... a){
		int s=0;
		for(int i:a) s+=i;
		return s;
	}
}
