package day0301;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		f1();
		f2();
		f3();
		f4();
	}

	private static void f4() {
		/* 
		 * i
		 * 1      *
		 * 2     ***
		 * 3    *****
		 * 4   *******
		 * 5  *********
		 * 
		 *    n-i个空格，2*i-1个星号
		 */
		System.out.print("大小：");
		int n = new Scanner(System.in).nextInt();
		
		// 1到n行
		for(int i=1;i<=n;i++) {
			//n-i个空格
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//2*i-1个星号
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();//换行
		}
		
	}

	private static void f3() {
		/*
		 *   i
		 *   1  *
		 *   2  **
		 *   3  ***
		 *   4  ****
		 *   5  *****
		 *      12345 j
		 */
		System.out.print("大小：");
		int n = new Scanner(System.in).nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void f2() {
		/*
		 *  i
		 *  1  *****
		 *  2  *****
		 *  3  *****
		 *  4  *****
		 *  5  *****
		 *     12345 j
		 */
		System.out.print("大小：");
		int n = new Scanner(System.in).nextInt();
		
		//1到n行
		for(int i=1; i<=n; i++) {
			//在一行中打印 1 到 n 个星号
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();//补换行符
		}
		
	}
	
	
	
	
	
	
	
	

	private static void f1() {
		for(int i=1; i<=3; i++) {
			for(int j=9; j>=7; j--) {
				System.out.println(i+", "+j);    
			}
		}
	}
}
