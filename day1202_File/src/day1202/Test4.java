package day1202;

import java.io.File;

public class Test4 {
	public static void main(String[] args) {
		File dir = new File("E:/ѧϰ����");
		/**
		 * ���Ŀ¼�����ڣ���Ŀ¼��Ȩ����
		 * ��õ�nullֵ��
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
