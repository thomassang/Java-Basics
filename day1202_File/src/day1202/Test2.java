package day1202;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws IOException {
		/**
		 * 新建e:\abc目录
		 * 新建e:\abc\f1文件
		 * 删除f1文件
		 * 删除abc目录
		 */
		System.out.println("按回车");
		new Scanner(System.in).nextLine();
		
		File dir = new File("e:/abc");
		dir.mkdirs();
		
		File file = new File("e:/abc/f1");
		file.createNewFile();
		
		new Scanner(System.in).nextLine();
		file.delete();
		
		new Scanner(System.in).nextLine();
		dir.delete();
	}	
}
