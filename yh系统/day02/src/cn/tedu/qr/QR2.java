package cn.tedu.qr;
/**
 * ������������ɶ�ά��
 */
import org.junit.Test;

public class QR2 {
	
	@Test
	public void create(){
		//����ͼƬ�Ŀ��
		int width=200;
		
		//����ͼƬ�ĸ߶�
		int height=200;
		
		//�����ά�������
		String content="www.baidu.com";
		
		//�����ά��Ĵ�ŵص�
		String path="f:\\QR2.png";
		
		CreateQR.create(width, height, content, path);
	}

}
