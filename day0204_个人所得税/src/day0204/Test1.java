package day0204;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("���ʣ�");
		
		double s = new Scanner(System.in).nextDouble();
		
		//��s���ݵ�grsds��������
		//�������������˰
		//�õ������ķ���ֵ�����浽����tax
		double tax = grsds(s);
		
		System.out.println("Ӧ���ɸ�������˰�� " + tax);
	}

	private static double grsds(double s) {
		// ��������˰����
		if(s <= 3500){
			return 0;
		}
		
		//�����׵�3500
		s -= 3500;	//s = s-3500;
		
		//����˰�ʱ���r������۳�������k
		double r = 0;
		int k = 0;
		
		//����s�ķ�Χ����ȷ��r��k��ֵ
		if(s <= 1500){
			r = 0.03;
			k = 0;
		}else if(s <= 4500){
			r = 0.1;
			k = 105;
		}else if(s <= 9000){
			r = 0.2;
			k = 555;
		}else if(s <= 35000){
			r = 0.25;
			k = 1005;
		}else if(s <= 55000){
			r = 0.3;
			k = 2755;
		}else if(s <= 80000){
			r = 0.35;
			k = 5505;
		}else{
			r = 0.45;
			k = 13505;
		}
				
		return s*r-k;
	}

}
