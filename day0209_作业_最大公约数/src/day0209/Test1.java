package day0209;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����a��");
		int a = new Scanner(System.in).nextInt();
		System.out.println("����b��");
		int b = new Scanner(System.in).nextInt();
		
		int z = zdgys(a,b);
		System.out.println(z);
	}

	private static int zdgys(int a, int b) {
		// ���Լ��
		
		int min = a<b ? a :b;
		
		for(int i = min; i>=1; i--){
			if(a%i==0 && b%i==0){
				return i;
			}
		}
		return 0;//û��
	}



}
