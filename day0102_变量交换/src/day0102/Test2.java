package day0102;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * Ĭдtest1������������
		 */
		
		System.out.print("��������a:");
		int a = new Scanner(System.in).nextInt();
		
		System.out.print("��������b��");
		int b = new Scanner(System.in).nextInt();
		
		int c = a;
		a = b; 
		b = c;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
	}

}
