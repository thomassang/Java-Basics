package day1402;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test1 {
	public static void main(String[] args) throws Exception{
		/**
		 * abc中文喆镕
		 * 
		 * f6文件，保存GBK编码
		 * f7文件，保存UTF-8编码
		 * 
		 * OSW---FOS---f6
		 * OSW---FOS---f7
		 */
		f("abc中文喆镕","e:/abc/f6","GBK");
		f("abc中文喆镕","e:/abc/f7","UTF-8");
	}

	private static void f(String s, String path, String encoding) throws Exception{
		
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path),encoding);
		
		out.write(s);
		out.close();
	}
}
