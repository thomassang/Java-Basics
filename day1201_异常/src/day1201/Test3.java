package day1201;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		//
		System.out.println("����������������");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double r = divide(a,b);
			System.out.println(r);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("���ܳ�0.����ѧ�ҵĴ����������");
			e.printStackTrace();
		}
	}

	private static double divide(double a, double b) {
		//
		if(b == 0){
			//�½��쳣����
			
			ArithmeticException e = 
					new ArithmeticException("/ by zero"/*"���ܳ�0.����ѧ�ҵĴ����������"*//*����д������Ա����Ϣ*/);
			//�ֶ��׳��쳣,�׻ص�����λ��
			throw e;
		}
		return a/b;
	}
}
