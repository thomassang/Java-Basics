package cn.tedu.qr;
/**
 * 这个类用来生成二维码
 */
import org.junit.Test;

public class QR2 {
	
	@Test
	public void create(){
		//定义图片的宽度
		int width=200;
		
		//定义图片的高度
		int height=200;
		
		//定义二维码的内容
		String content="www.baidu.com";
		
		//定义二维码的存放地点
		String path="f:\\QR2.png";
		
		CreateQR.create(width, height, content, path);
	}

}
