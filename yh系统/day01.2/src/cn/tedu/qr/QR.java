package cn.tedu.qr;

import org.junit.Test;

/**
 * ������������ɶ�ά��
 *
 */
public class QR {
	
	/**
	 * ����create����
	 * ���ùȸ�ķ������ɶ�ά��
	 * 
	 * @Test
	 * ��Ԫ���Է�������������ĳһ��Ĵ���
	 */
	@Test
	public void create(){
		
		//��ά��Ŀ��
		int width=200;
		
		//��ά��ĸ߶�
		int height=200;
		
		//��ά�������
		String content="�Ұ���";
		
		//��ά��Ĵ��λ��
		String path="f:\\qr.png";
		
		//���ùȸ�ķ����������ɶ�ά��
		CreateQR.create(width, height, content, path);
		
	}

}
