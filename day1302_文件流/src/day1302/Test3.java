package day1302;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test3 {
	public static void main(String[] args) {
		 System.out.println("源文件");
		 String s1 = new Scanner(System.in).nextLine();
		 
		 File from = new File(s1);
		 
		 if(! from.isFile()){
			 System.out.println("不是文件");
			 return;
		 }
		 System.out.println("目标文件");
		 String s2 = new Scanner(System.in).nextLine();
		 
		 File to = new File(s2);
		 if(to.isDirectory()){
			 System.out.println("不能是文件夹");
			 return;
		 }
		 
		 try {
			copy(from,to);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
		 
	}

	private static void copy(File from, File to) throws Exception{
		
		/**
		 * 循环批量读取
		 * 向目标文件批量输出
		 */
		FileInputStream in = new FileInputStream(from);
		FileOutputStream out = new FileOutputStream(to);
		byte[] buff = new byte[8192];
		int n;//保存一批数量
		while((n = in.read(buff)) != -1){
			out.write(buff ,0,n);
		}
		
		in.close();
		out.close();
	}
}
