package day1204;

import java.io.File;
import java.util.Scanner;

public class Text_my {
	public static void main(String[] args) {
		System.out.println("请输入想要查找的文件夹：");
		String s = new Scanner(System.in).nextLine();

		File dir = new File(s);

		if(! dir.isDirectory()){
			System.out.println("请输入正确的文件夹");
			return;
		}
		//遍历目录	
		wenjian(dir,0);

	}

	public static void wenjian(File dir, int level) {

		//System.out.println(dir.getName());//输出文件夹名字
		level++; //每调用一次，level加1
		File[] files = dir.listFiles(); //获取指定目录下当前的所有文件夹或者文件对象
		for (File f : files) {
			if (f.isDirectory()) { //如果是文件夹，继续调用wenjian函数
				wenjian(f, level);
			} else { //否则，直接输出文件名
				if(f.getName().endsWith(".jpg") || f.getName().endsWith(".jpeg") || f.getName().endsWith(".png")){
					System.out.println(f.getAbsolutePath());
				}
			}
		}
	}
}
