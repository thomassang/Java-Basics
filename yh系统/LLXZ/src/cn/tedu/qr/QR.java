package cn.tedu.qr;

import org.junit.Test;

/**
 * ������������ɶ�ά��
 */
public class QR {
	
	@Test
	public void create(){
		//�����տ��
		int height = 250;
		
		//������Ƭ�߶�
		int width = 250;
		
		//������Ƭ����
		String content = "�Ұ���";
		
		//������Ƭ���λ��
		String path = "f:\\llcz.png";
		
		//����create����
		CreateQR.create(height, width, content, path);
		
	}

}
