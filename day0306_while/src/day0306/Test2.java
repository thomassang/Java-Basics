package day0306;

public class Test2 {
	public static void main(String[] args) {
		int i = 0; 
		double d = 0;
		
		do {
			d = Math.random();
			i++;
		} while(d<=0.999);
		
		System.out.println(i+"�Σ� "+d);     
	}
}
