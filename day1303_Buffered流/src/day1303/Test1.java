package day1303;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException{
		/**
		 * 文件输出流
		 * 家Buffered
		 */
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("e:/abc/f4"));
		
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		fos.flush();//刷出缓存数据
		/**
		 * 高级流的close
		 * 		1）flush（）
		 * 		2）关闭       
		 */
		
		fos.close();
		
	}
}







