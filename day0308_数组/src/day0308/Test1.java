package day0308;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] a = new int[5];
		char[] b = {'a','b','c'};
		/*
		 * Arrays.toString(a)
		 * �������е�ֵ�����ӳ��ַ���
		 * "[0, 0, 0, 0, 0]"
		 */
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		a = new int[]{2,5,2,67,2,43};
		System.out.println(Arrays.toString(a));
	}
}
