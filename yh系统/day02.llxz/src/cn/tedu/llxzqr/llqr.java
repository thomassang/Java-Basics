package cn.tedu.llxzqr;

import org.junit.Test;

import cn.tedu.qr.CreateQR;

/**
 * 这个类用来生成二维码
 */
public class llqr {
	
	@Test
	public void create(){
		//宽
		int width = 200;
		
		//高
		int height = 200;
		
		//内容
		String content = "兰兰，我爱你！";
		
		//位置
		String path = "f:\\llll.png";
		
		CreateQR.create(width, height, content, path);
	}

}
