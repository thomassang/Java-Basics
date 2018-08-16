package day1201;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		//
		System.out.println("输入两个浮点数：");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double r = divide(a,b);
			System.out.println(r);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("不能除0.是数学家的错，你打死他吧");
			e.printStackTrace();
		}
	}

	private static double divide(double a, double b) {
		//
		if(b == 0){
			//新建异常对象
			
			ArithmeticException e = 
					new ArithmeticException("/ by zero"/*"不能除0.是数学家的错，你打死他吧"*//*这里写给程序员的信息*/);
			//手动抛出异常,抛回到调用位置
			throw e;
		}
		return a/b;
	}
}
