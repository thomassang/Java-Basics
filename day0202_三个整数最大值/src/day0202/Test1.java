package day0202;
/**
 * 输入三个整数，求最大值
 */
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入三个整数：");
		
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		
		//abc三个整数的值，传递到max（）方法，求最大值，
		//得到方法的返回结果，保存到变量m
		int m = max(a,b,c);
		
		System.out.println("最大值： " + m);
	}

	private static int max(int a, int b, int c) {
		// 最大值判断函数
	//求a，b的最大值保存到变量max
		
/*		int max = a>b ? a : b;
		
		//求max和c的最大值，保存到max
		max = max>c ? max : c;
		*/
		//合并：
		int max = a>b ? (a>c ? a : c) : (b>c ? b : c);
		
		return max;
	}

}
