package day0902;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("����email��  ");
		String e = new Scanner(System.in).nextLine();
		String n = getName(e);
		System.out.println(n);
	}

	private static String getName(String e) {
		/**
		 * 1.��@���ŵ�λ�ã��浽index
		 * 2.�ҵ������õ�һ������ֵ��-1.���index = -1�����ظ�ʽ����
		 * 3.��ȡ��0��index����������
		 */
		e = e.trim();		
		int index = e.indexOf("@");
		if(index == -1){
			System.out.println("��ʽ����");
		}
		
		e.substring(0, index);
		return e.substring(0,index);
	}

}
