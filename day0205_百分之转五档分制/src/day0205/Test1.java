package day0205;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����ٷ�֮������");
		int s = new Scanner(System.in).nextInt();
		
		if(s<0 || s>100){
			return;//�������˽���
		}
		
		//��s��ֵ���ݵ�f��������
		//���嵵���Ʒ���
		//�ĵ������ķ���ֵ�浽����r
		char r = f(s);
		System.out.println(r);
	}

	private static char f(int s) {
		// ת���嵵����ֵ
		char r = 'A';
		
		//�ж�s��ֵ
		switch(s/10){
		case 10:
		case 9:
			r = 'A';
			break;
		case 8:
		case 7:
			r = 'B';
			break;
		case 6:
			r = 'C';
			break;
		case 5:
		case 4:
		case 3:
		case 2:
			r = 'D';
			break;
		case 1:
		case 0:
			r = 'E';
			break;
		}
		
		return r;
	}

}
