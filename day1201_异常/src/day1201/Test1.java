package day1201;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while(true){
			try {
				f();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("����������");
			} catch (ArithmeticException e){
				System.out.println("���ܳ�0");			
			} catch (Exception e){
				System.out.println("���������ԣ�");
			} finally {
				//���ܳ�������ִ��
				System.out.println("---------");
			}
		}
	}

	private static void f() {
		/**
		 * ����������
		 */
		System.out.println("���붺�Ÿ�������������");
		String s = new Scanner(System.in).nextLine();

		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		int r = n1/n2;
		System.out.println(r);
	}
}
