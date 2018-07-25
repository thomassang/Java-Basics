package day0309;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		//ѡ������
		//����suiJi()���������һ����������
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));  
		System.out.println("---------------");
		sort(a);//���򷽷�
		System.out.println("---------------");
		System.out.println(Arrays.toString(a));
	}
	private static int[] suiJi() {
		/*
		 * 1.������Χ 5+[0,6)��Χ��������ȣ�
		 *   �浽���� len
		 * 2.�½�len���ȵ�int[]���飬
		 *   �浽����a
		 * 3.�������飬����100�����ֵ
		 * 4.��������a
		 */
		int len = 5+new Random().nextInt(6);
		int[] a = new int[len];
		for(int i=0;i<a.length;i++) {
			a[i] = new Random().nextInt(100);        
		}
		return a;
	}
	
	private static void sort(int[] a) {
		/*
		 * [12, 19, 76, 59, 81, 91, 96, 32, 60]
		 *           i
		 */
		
		for(int i=0;i<a.length;i++) {
			//i��ĩβ��Χ��ѡ����Сֵλ��
			int index = min(a, i);
			//indexλ�õ���Сֵ��������iλ��
			swap(a, i, index);
		}
	}
	private static int min(int[] a, int i) {
		/*
		 *                              m
		 * [12, 19, 76, 59, 81, 91, 96, 32, 60]
		 *           i
		 *                                      j
		 */
		int m = i;//����iλ����С
		//����Ҹ�Сֵ
		for(int j=i+1; j<a.length; j++) {
			//�ҵ�jλ�ø�С
			if(a[j]<a[m]) {
				m=j;//��m��λ��jλ��
			}
		}
		return m;
	}
	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;				
	}
}








