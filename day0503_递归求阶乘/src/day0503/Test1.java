package day0503;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入一个整数求阶乘：");
		int n = new Scanner(System.in).nextInt();
		
		long r = f(n);
		System.out.println(r);
	}
	
	private static long f(int n){
		//最简问题，n是零，零的阶乘是已知的1
		if(n ==0){
			return 1;			
		}
		
		return n*f(n-1);
	}

}
