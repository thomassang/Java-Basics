package day0803;

public class Test1 {
	public static void main(String[] args) {
		new B();
		System.out.println("--------");
		new B(); 
	}

}

class A{
	int v1 = 1;//5.v1分配内存，默认值为0;7.赋值
	static int v2 = 2;//1.v2分配内存；3.赋值运算
	static {
		System.out.println("a静态块");//3.静态块
	}
	
	public A(){
		System.out.println("a构造方法");//8、父类构造方法
	}
}  

class B extends A{
	int v3 = 3;//6.v3分配内存，初始化为0；9、赋值
	static int v4 = 4;//2.v4分配内存4、赋值
	static {
		System.out.println("b静态块");//4、静态块
	}
	
	public B(){
		System.out.println("b构造方法");//10、子类构造方法
	}
}  
