package day0207;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("---1��10��ӡ---");
		f1();
		System.out.println("---10��1��ӡ---");
		f2();
		System.out.println("---2,4,6,8,10---");
		f3();
		System.out.println("---8,88,888,8888,888888������88888---");
		f4();
		System.out.println("---��ѭ��---");
		f5();
	}

	private static void f5() {
		// ��д������������ִ�е���ѭ��
		for(int i= 1; ; i++){
			System.out.println(i);
		}
	}

	private static void f1() {
		//��ӡһ��ʮ
		for(int i = 1; i<=10; i++){
			System.out.println(i);
		}
	}

	private static void f2() {
		// 10��1��ӡ
		for(int i = 10; i>=1; i--){
			System.out.println(i);
		}
			
	}

	private static void f3() {
		// 2,4,6,8,10
		for(int i = 2; i<=100; i+=2){
			System.out.println(i);
		}
	}

	private static void f4() {
		// 8,88,888,8888,888888������88888
		for(long i = 8; i<=888888888; i=i*10+8){
			System.out.println(i);
		}
	}

}
