package day0204;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("工资：");
		
		double s = new Scanner(System.in).nextDouble();
		
		//吧s传递到grsds（）方法
		//来计算个人所得税
		//得到方法的返回值，保存到变量tax
		double tax = grsds(s);
		
		System.out.println("应缴纳个人所得税： " + tax);
	}

	private static double grsds(double s) {
		// 个人所得税方法
		if(s <= 3500){
			return 0;
		}
		
		//工资抛掉3500
		s -= 3500;	//s = s-3500;
		
		//定义税率变量r和速算扣除数变量k
		double r = 0;
		int k = 0;
		
		//根据s的范围，来确定r和k的值
		if(s <= 1500){
			r = 0.03;
			k = 0;
		}else if(s <= 4500){
			r = 0.1;
			k = 105;
		}else if(s <= 9000){
			r = 0.2;
			k = 555;
		}else if(s <= 35000){
			r = 0.25;
			k = 1005;
		}else if(s <= 55000){
			r = 0.3;
			k = 2755;
		}else if(s <= 80000){
			r = 0.35;
			k = 5505;
		}else{
			r = 0.45;
			k = 13505;
		}
				
		return s*r-k;
	}

}
