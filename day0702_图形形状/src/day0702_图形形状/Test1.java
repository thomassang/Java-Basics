package day0702_ͼ����״;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while(true){
			int r  = new Random().nextInt(4);
			switch(r){
			case 0:
			/*	Shape s = new Shape();
				f(s);*/
				System.out.println("�����಻���½�ʵ��");
				break;
			case 1:
				Line l = new Line();
				f(l);
				break;
			case 2:
				Square q = new Square();
				f(q);
				break;
			case 3:
				Circle c = new Circle();
				f(c);
				break;
			}
		}
	}

	private static void f(Shape s) {
		// TODO Auto-generated method stub
		new Scanner(System.in).nextLine();
		
		//���ø����ж����ͨ�÷���
		//ִ��ʱ��ִ��������ʵ�ֵķ���
		s.draw();
		
		//�ж�s���õĶ�����ʵ������Line����
		if(s instanceof Line){
			//����ת�ͳ�line���ͱ���
			//ǿ��ת��
			Line line = (Line) s;
			line.length();
		}
		
		new Scanner(System.in).nextLine();
		s.clear();
		
	}
/*
	private static void f(Line l) {
		// TODO Auto-generated method stub
		new Scanner(System.in).nextLine();
		l.draw();
		new Scanner(System.in).nextLine();
		l.clear();
		
	}

	private static void f(Square q) {
		// TODO Auto-generated method stub
		new Scanner(System.in).nextLine();
		q.draw();
		new Scanner(System.in).nextLine();
		q.clear();
		
	}

	private static void f(Circle c) {
		// TODO Auto-generated method stub
		new Scanner(System.in).nextLine();
		c.draw();
		new Scanner(System.in).nextLine();
		c.clear();
	}
*/
}
