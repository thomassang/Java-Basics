package day0601;

import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//�½�car����
		//�ɶ�����ڴ��ַ�����浽����c1
		car c1 = new car("����", "��ɫ", new Random().nextInt(150));
		car c2 = new car("����", "��ɫ", new Random().nextInt(230));
		
		/*Ϊc1������������Ը�ֵ��
		c1.brand = "����";
		c1.color = "��ɫ";
		c1.speed = new Random().nextInt(150);
		*/
//		c1.brand = "����";
//		c1.color = "��ɫ";
//		c1.speed = new Random().nextInt(230);
//		
//		//����c1ִ��go������������stop��������
		c1.go();
		c2.go();

		c1.stop();
		c2.stop();
	}

}
