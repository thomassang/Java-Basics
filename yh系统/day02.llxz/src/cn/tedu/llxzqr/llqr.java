package cn.tedu.llxzqr;

import org.junit.Test;

import cn.tedu.qr.CreateQR;

/**
 * ������������ɶ�ά��
 */
public class llqr {
	
	@Test
	public void create(){
		//��
		int width = 200;
		
		//��
		int height = 200;
		
		//����
		String content = "�������Ұ��㣡";
		
		//λ��
		String path = "f:\\llll.png";
		
		CreateQR.create(width, height, content, path);
	}

}
