package day0103;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入降落时间（秒）：  ");
		//得到输入的值。保存到变量t
		double t = new Scanner(System.in).nextDouble();
		
		//套公式求出降落距离，保存到变量d
		double d = 0.5 * 9.8 * t * t;
		
		System.out.println(t + "秒降落了" + d +"米");
	}

}
