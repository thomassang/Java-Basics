package day1202;

import java.io.File;

public class Test4 {
	public static void main(String[] args) {
		File dir = new File("E:/学习资料");
		/**
		 * 如果目录不存在，或目录无权访问
		 * 会得到null值，
		 */
		String[] names = dir.list();
		File[] files = dir.listFiles();
		
		for(String n : names){
			System.out.println(n);
		}
		System.out.println("------");
		for(File f : files){
			System.out.println(f.getName() +"--"+ f.length());
		}
	}
}
