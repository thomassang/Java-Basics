package day0902;

import java.util.Scanner;

/**
 * 判断回文
 * @author sj154
 *
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.print("输入回文： ");
		String s = new Scanner(System.in).nextLine();
		
		if(huiwen(s)){
			System.out.println("是回文");
		}else{
			System.out.println("不是回文");
		}
	}

	private static boolean huiwen(String s) {
		/**
		 *  判断字符串是否是回文
		 *  
		 *  abcdedbaba
		 *  
		 *  1.for循环i = 0，j=末尾：条件i《j
		 *  	2.如果i位置字符和j位置不相等，
		 *  			3，返回false
		 *  4.返回true
		 */
		//int j = int[] s;
		for(int i = 0, j = s.length()-1; i<j; i++,j--){
			if(s.charAt(i)!= s.charAt(j))
			return false;
		}
	
		return true;
	}

}
