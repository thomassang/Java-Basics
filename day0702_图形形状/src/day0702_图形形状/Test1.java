package day0702_图形形状;

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
				System.out.println("抽象类不能新建实例");
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
		
		//调用父类中定义的通用方法
		//执行时，执行子类中实现的方法
		s.draw();
		
		//判断s引用的对象，真实类型是Line类型
		if(s instanceof Line){
			//向下转型成line类型变量
			//强制转型
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
