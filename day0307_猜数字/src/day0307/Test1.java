package day0307;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// 1+ [0,1000) -->[1, 1001)
		int r = 1 + new Random().nextInt(1000);
		System.out.println(r);
		
		System.out.println("�Ѿ�������һ��[1,1001)��Χ���������");
		System.out.println("���������Ǽ�");
		
		while(true) {
			System.out.print("�£�");
			int c = new Scanner(System.in).nextInt();
			if(c>r) {
				System.out.println("��");
			} else if(c<r) {
				System.out.println("С");
			} else {
				System.out.println("��");
				break;
			}
		}
	}
}





