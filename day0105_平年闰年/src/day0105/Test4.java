package day0105;

import java.util.Scanner;

/**
 * ƽ������
 * ����������
 * 1���ܱ��������������ܱ�100����
 * 2���ܱ�400����
 */
public class Test4 {
	public static void main(String[] args) {
		
		System.out.print("������ţ�");
		int y = new Scanner(System.in).nextInt();
		
		//�����y���ݵ�һ��������runNIan������������������
		//���жϸ÷����ķ���ֵ���滹�Ǽ١�
		boolean b = runNian(y);
		
		if(b){
			System.out.println("����");
			
		} else {
			System.out.println("ƽ��");
		}
		
	}
	
	static boolean runNian(int y){
		//y�ܱ�4������
		
		//����ע�ͣ����߼��������ʵ��
/*		if(y%4 == 0) {
			//������������£����жϲ��ܱ�100����
			if(y%100 != 0) {
				//�����λ�÷��ؽ��
				//���ص�����λ��ִ��
				return true;
			}
		}
		//�ܱ�400����
		if(y%400 == 0) {
			return true;
		}
		*/
		
		//�������ܱ����������Ҳ��ܱ�100����
		//�����ܱ�400����
		if((y%4 == 0 && y%100 != 0) || y%400 == 0){
			return true;
		}
		
		return false;
	}

}
