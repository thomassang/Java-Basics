package day0308;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		//�½�10�����ȵ�int[]���飬
		//��ַ�浽���� a
		int[] a = new int[10];
		//����������100�����ֵ
		for(int i=0; i<a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		
		System.out.println(Arrays.toString(a)); 
		
		System.out.println("--����3,4λ�õ�ֵ-----------");
		swap(a,3,4);
		System.out.println(Arrays.toString(a)); 
		
		System.out.println("--�����Сֵ��λ���±�----------------");
		int index = min(a);
		System.out.println("��Сֵλ�ã�"+index);
		
		swap(a,0,index);
		System.out.println(Arrays.toString(a));
	}

	private static int min(int[] a) {
		/*
		 *            m=3
		 * [59,18,62,14,64,70,67,25,94,58]
		 *                                 i
		 * 
		 * *)����0λ�þ�����Сֵ
		 * *)��1λ������ұ�mλ�ø�Сֵ
		 * *)�ҵ���Сֵ��m��λ��iλ��
		 * 
		 * 1.�����±�m=0
		 * 2.iѭ����1��<a.length
		 *     3.���iλ��ֵ<mλ��ֵ
		 *          4.��m�޸ĳ�i��ֵ
		 * 
		 * 5.����m��ֵ
		 */
		int m=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[m]) {
				m = i;
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






