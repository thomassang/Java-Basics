package day0801;

import java.util.Random;

/**
 * ��װ��
 * 		��ʿ����ص��������ݣ���������
 * 		��װ��һ��������������ࣩ
 */
public class Soldier {
	//�������ݣ���Ա����
	int id;	//Ĭ��Ϊ��
	int blood = 100;
	
	//��̬������ʿ������
	static int count;
	
	//day06�¼����ݣ����췽��
	public Soldier(){
		System.out.println("�½�soldier������ִ��");
		
		//ͬһ�����У���������ʡ��
		Soldier.count++;
	}
	
	
	//��Ա����
	public void go(){
		System.out.println(id + "��ʿ��ǰ��");
	}
	
	public void attact(){
		System.out.println(id + "��ʿ������");
		//����ļ�Ѫ��
		int d =  new Random().nextInt(10);
		blood -= d;
		
		//���Ѫ����ɸ������ó�0 
		if(blood < 0){
			blood = 0;			
		}
		
		System.out.println("Ѫ���� " + blood );
		
		if(blood == 0){
			System.out.println(id + "��ʿ������");
		
			Soldier.count--; 
			
			return;
		}
	}
}
