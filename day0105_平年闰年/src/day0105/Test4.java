package day0105;

import java.util.Scanner;

/**
 * 平年闰年
 * 满足条件：
 * 1：能被四整除，但不能被100整除
 * 2：能被400整除
 */
public class Test4 {
	public static void main(String[] args) {
		
		System.out.print("输入年号：");
		int y = new Scanner(System.in).nextInt();
		
		//把年号y传递到一个方法到runNIan（）方法，进行运算
		//在判断该方法的返回值是真还是假。
		boolean b = runNian(y);
		
		if(b){
			System.out.println("闰年");
			
		} else {
			System.out.println("平年");
		}
		
	}
	
	static boolean runNian(int y){
		//y能被4整除，
		
		//二次注释，用逻辑运算符来实现
/*		if(y%4 == 0) {
			//能整除的情况下，在判断不能被100整除
			if(y%100 != 0) {
				//向调用位置返回结果
				//跳回到调用位置执行
				return true;
			}
		}
		//能被400整除
		if(y%400 == 0) {
			return true;
		}
		*/
		
		//条件：能被四整除并且不能被100整除
		//或者能被400整除
		if((y%4 == 0 && y%100 != 0) || y%400 == 0){
			return true;
		}
		
		return false;
	}

}
