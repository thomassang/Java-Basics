package day0103;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("���뽵��ʱ�䣨�룩��  ");
		//�õ������ֵ�����浽����t
		double t = new Scanner(System.in).nextDouble();
		
		//�׹�ʽ���������룬���浽����d
		double d = 0.5 * 9.8 * t * t;
		
		System.out.println(t + "�뽵����" + d +"��");
	}

}
