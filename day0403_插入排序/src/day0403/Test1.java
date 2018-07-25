package day0403;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//�����������
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));
		System.out.println("-------------------");
		sort(a);//����
		System.out.println("-------------------");
		System.out.println(Arrays.toString(a));
	}

	private static int[] suiJi() {             
		/*
		 * 1.�������5+[0,6)���浽����len
		 * 2.�½�len���ȵ�int[]����浽����a
		 * 3.��������100�����ֵ
		 * 4.��������a
		 */
		int len = 5 + new Random().nextInt(6);
		int[] a = new int[len];
		for(int i=0;i<a.length;i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		/*
		 * ��������
		 * 
		 *                      j
		 * [4,6,18,19,19,19,20,22,19,26]
		 *                         i
		 *  
		 * *) ����Ϊ��һ��ֵ��������������
		 * *) �ӵڶ���ֵ��ʼ����ÿ��ֵ��
		 *    ��ǰ���뵽��ȷλ��
		 * 
		 * *) �������
		 *    *) jѭ����i-1��ǰ�ݼ�
		 *    *) ���jλ��ֵ>j+1λ��ֵ 
		 *         *)j��j+1λ�ý���
		 *    *) �����ж�jѭ��
		 */
		for(int i=1; i<a.length; i++) {
			//jѭ�����ã���iλ��ֵ����ǰ�嵽��ȷλ��
			for(int j=i-1; j>=0; j--) {
				//jλ��ֵ>j+1λ��ֵ
				if(a[j]>a[j+1]) {
					swap(a, j, j+1);//Сֵ��ǰ��
				} else {
					break;//�Ѿ����,j����
				}
			}
			System.out.println(Arrays.toString(a));  
		}
	}

	private static void swap(int[] a, int i, int j) { 
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}










