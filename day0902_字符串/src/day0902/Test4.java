package day0902;

import java.util.Scanner;

/**
 * �жϻ���
 * @author sj154
 *
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.print("������ģ� ");
		String s = new Scanner(System.in).nextLine();
		
		if(huiwen(s)){
			System.out.println("�ǻ���");
		}else{
			System.out.println("���ǻ���");
		}
	}

	private static boolean huiwen(String s) {
		/**
		 *  �ж��ַ����Ƿ��ǻ���
		 *  
		 *  abcdedbaba
		 *  
		 *  1.forѭ��i = 0��j=ĩβ������i��j
		 *  	2.���iλ���ַ���jλ�ò���ȣ�
		 *  			3������false
		 *  4.����true
		 */
		//int j = int[] s;
		for(int i = 0, j = s.length()-1; i<j; i++,j--){
			if(s.charAt(i)!= s.charAt(j))
			return false;
		}
	
		return true;
	}

}
