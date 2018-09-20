package day1402;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test2 {
	public static void main(String[] args) throws Exception{
		/**
		 * 输出所有中文字符
		 * '\u4e00'到'\u9fa5'
		 * 
		 * f8文件保存GBK
		 * f9文件保存UTF-8   
		 */
		f("e:/abc/f8","GBK");
		f("e:/abc/f9","UTF-8");
	}

	private static void f(String path, String encoding) throws Exception{
		// TODO Auto-generated method stub
		OutputStreamWriter ote = new OutputStreamWriter(new FileOutputStream(path),encoding);
		
		//4e00到9fa5
		//计数，每30个，加换行
		for(int i = 1,c=0x4e00; c<=0x9fa5; i++,c++){
			ote.write(c);
			if(i%30 == 0){
				ote.write('\n');
			}
		}
		ote.close();
	}
}
