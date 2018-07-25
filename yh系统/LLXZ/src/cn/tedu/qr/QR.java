package cn.tedu.qr;

import org.junit.Test;

/**
 * 这个类用来生成二维码
 */
public class QR {
	
	@Test
	public void create(){
		//设置照宽度
		int height = 250;
		
		//设置照片高度
		int width = 250;
		
		//设置照片内容
		String content = "我爱你";
		
		//设置照片存放位置
		String path = "f:\\llcz.png";
		
		//调用create方法
		CreateQR.create(height, width, content, path);
		
	}

}
