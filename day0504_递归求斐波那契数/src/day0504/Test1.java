package day0504;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("求第几个斐波那契数：");
		int n = new Scanner(System.in).nextInt();
		
		long r = f(n);
		System.out.println(r);
	}
	private static long f(int n){
		//最简问题，第一个和第二个，已知是一。
		if(n == 1 || n == 2){
			return 1;			
		}
		
		return f(n-1) + f(n-2);
	}

}
