package cn.tedu.qr;

import org.junit.Test;

/**
 * 这个类用来生成二维码
 *
 */
public class QR {
	
	/**
	 * 创建create方法
	 * 调用谷歌的方法生成二维码
	 * 
	 * @Test
	 * 单元测试方法，用来测试某一块的代码
	 */
	@Test
	public void create(){
		
		//二维码的宽度
		int width=200;
		
		//二维码的高度
		int height=200;
		
		//二维码的内容
		String content="我爱你";
		
		//二维码的存放位置
		String path="f:\\qr.png";
		
		//利用谷歌的方法调用生成二维码
		CreateQR.create(width, height, content, path);
		
	}

}
