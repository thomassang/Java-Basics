package day0203;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入原件：");
		
		double p = new Scanner(System.in).nextDouble();
		
		//原件p的值，传递到discount（）方法
		//来计算折扣价，
		//得到方法的返回值，保存到变量p
		p = discount(p);
		
		System.out.println("最终价格： " + p);
	}

	private static double discount(double p) {
		// 定义折扣率变量r
		double r = 1;
		//根据原价参数p的范围，
		//来为r赋不同的值
		if(p > 5000){
			r =0.75;
		}else if(p>=3000){
			r = 0.8;
		}else if(p >= 1000){
			r = 0.9;
		}else if(p>= 500){
			r = 0.95;
		}
		//计算折扣价，并返回
		
		return p*r;
	}

}
