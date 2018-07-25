package day0402;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//�ӷ�������ú����������������������
		int[] r = zbsz(33);
		int[] b = zbsz(16);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));
		
		//�Ӻ����������ѡ��6��������õ�����red
		int[] red = xuanRed(r);
		//�������������ѡ��1�������浽����blue
		int blue = xuanBlue(b);
		
		System.out.println(Arrays.toString(red));
		System.out.println(blue);
	}

	private static int[] xuanRed(int[] r) {
		/*
		 * r
		 * [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33]
		 *                  j                                                                                       
		 * flag
		 * [x,x,x,o,x,x,o,o,x, x, x, x, o, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x]
		 * 
		 * red
		 * [8 13 4 7    ]6
		 *           i
		 */
		//������������
		int[] red = new int[6];
		//�������
		boolean[] flag = new boolean[33];
		//����red���飬����ѡ��ĺ������
		for(int i=0;i<red.length;i++) {
			//�����ѡ��һ��λ��
			//���ж��Ƿ�Ҫ�ظ���ѡ��һ��λ��
			int j;
			do {
				j = new Random().nextInt(33);
			} while(flag[j]);
			//ѡ��jλ�õ�ֵ������������
			red[i] = r[j];
			flag[j] = true;//���jλ����ѡ��
		}
		return red;		
		
		
	}

	private static int xuanBlue(int[] b) {
		return b[new Random().nextInt(16)];
	}

	private static int[] zbsz(int len) {
		/*
		 * 1.�½�len���ȵ�int[]���飬���浽����a
		 * 2.�������飬����1��len
		 * 3.��������a
		 */
		int[] a = new int[len];
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		return a;
	}
}





