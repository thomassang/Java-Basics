package day1304;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/**
		 * Student�������л���������浽�ļ�
		 * 
		 * OOS---FOS---f5
		 */
		Student s = new Student(9527,"�Ʋ���","��",22);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("e:/abc/f5"));
		
		out.writeObject(s);
		
		out.close();

	}
}
