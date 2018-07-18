package day0102;
/**
 * 导包，
 * 指明一个类的完整路径。
 * 在后面代码中，可以简写类名
 */

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数a：");//去掉ln输入的内容就是在输出内容之后，不会自动换行
		//得到输入的值，保存到变量a
		//scanner是jdk类库中的类
		//保存在java.util包下
		int a = new Scanner(System.in).nextInt();
		
		System.out.print("输入整数b：");
		int b = new Scanner(System.in).nextInt();
		
		int c = a ;
		a = b;
		b = c;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
