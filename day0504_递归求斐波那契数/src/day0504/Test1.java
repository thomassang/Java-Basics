package day0504;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("��ڼ���쳲���������");
		int n = new Scanner(System.in).nextInt();
		
		long r = f(n);
		System.out.println(r);
	}
	private static long f(int n){
		//������⣬��һ���͵ڶ�������֪��һ��
		if(n == 1 || n == 2){
			return 1;			
		}
		
		return f(n-1) + f(n-2);
	}

}
