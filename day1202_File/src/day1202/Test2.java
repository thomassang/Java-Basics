package day1202;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws IOException {
		/**
		 * �½�e:\abcĿ¼
		 * �½�e:\abc\f1�ļ�
		 * ɾ��f1�ļ�
		 * ɾ��abcĿ¼
		 */
		System.out.println("���س�");
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
