package day0803;

public class Test1 {
	public static void main(String[] args) {
		new B();
		System.out.println("--------");
		new B(); 
	}

}

class A{
	int v1 = 1;//5.v1�����ڴ棬Ĭ��ֵΪ0;7.��ֵ
	static int v2 = 2;//1.v2�����ڴ棻3.��ֵ����
	static {
		System.out.println("a��̬��");//3.��̬��
	}
	
	public A(){
		System.out.println("a���췽��");//8�����๹�췽��
	}
}  

class B extends A{
	int v3 = 3;//6.v3�����ڴ棬��ʼ��Ϊ0��9����ֵ
	static int v4 = 4;//2.v4�����ڴ�4����ֵ
	static {
		System.out.println("b��̬��");//4����̬��
	}
	
	public B(){
		System.out.println("b���췽��");//10�����๹�췽��
	}
}  
