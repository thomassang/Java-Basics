package day0208;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����������׳ˣ�");
		int n = new Scanner(System.in).nextInt();
		
		//n���ݵ�f����������n�Ľ׳�
		//�õ������ķ���ֵ�浽����r
		String r = f(n);
		
		System.out.println(r);
	}

	private static String f(int n) {
		/**
		 * ������5
		 */
		
/*		long r = n;
		
		for(int i = n-1; i>=1;i--){
			r*=i;
		}
		return r;*/
		BigInteger r =BigInteger.valueOf(n);
		for(int i = n-1; i>=1;i--){
			r = r.multiply(BigInteger.valueOf(i));
		}
		
		return r.toString();
		
	}

}
