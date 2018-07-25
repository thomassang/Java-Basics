package day0205;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入百分之分数：");
		int s = new Scanner(System.in).nextInt();
		
		if(s<0 || s>100){
			return;//方法到此结束
		}
		
		//把s的值传递到f（）方法
		//求五档分制分数
		//的到方法的返回值存到变量r
		char r = f(s);
		System.out.println(r);
	}

	private static char f(int s) {
		// 转成五档分数值
		char r = 'A';
		
		//判断s的值
		switch(s/10){
		case 10:
		case 9:
			r = 'A';
			break;
		case 8:
		case 7:
			r = 'B';
			break;
		case 6:
			r = 'C';
			break;
		case 5:
		case 4:
		case 3:
		case 2:
			r = 'D';
			break;
		case 1:
		case 0:
			r = 'E';
			break;
		}
		
		return r;
	}

}
