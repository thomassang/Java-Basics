package day0902;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("输入email：  ");
		String e = new Scanner(System.in).nextLine();
		String n = getName(e);
		System.out.println(n);
	}

	private static String getName(String e) {
		/**
		 * 1.找@符号的位置，存到index
		 * 2.找到不到得到一个特殊值，-1.如果index = -1；返回格式错误
		 * 3.截取【0，index），并返回
		 */
		e = e.trim();		
		int index = e.indexOf("@");
		if(index == -1){
			System.out.println("格式错误");
		}
		
		e.substring(0, index);
		return e.substring(0,index);
	}

}
