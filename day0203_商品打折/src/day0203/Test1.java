package day0203;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����ԭ����");
		
		double p = new Scanner(System.in).nextDouble();
		
		//ԭ��p��ֵ�����ݵ�discount��������
		//�������ۿۼۣ�
		//�õ������ķ���ֵ�����浽����p
		p = discount(p);
		
		System.out.println("���ռ۸� " + p);
	}

	private static double discount(double p) {
		// �����ۿ��ʱ���r
		double r = 1;
		//����ԭ�۲���p�ķ�Χ��
		//��Ϊr����ͬ��ֵ
		if(p > 5000){
			r =0.75;
		}else if(p>=3000){
			r = 0.8;
		}else if(p >= 1000){
			r = 0.9;
		}else if(p>= 500){
			r = 0.95;
		}
		//�����ۿۼۣ�������
		
		return p*r;
	}

}
