package day0102;
/**
 * ������
 * ָ��һ���������·����
 * �ں�������У����Լ�д����
 */

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("��������a��");//ȥ��ln��������ݾ������������֮�󣬲����Զ�����
		//�õ������ֵ�����浽����a
		//scanner��jdk����е���
		//������java.util����
		int a = new Scanner(System.in).nextInt();
		
		System.out.print("��������b��");
		int b = new Scanner(System.in).nextInt();
		
		int c = a ;
		a = b;
		b = c;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
