package day1304;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		/**
		 * ��f5�ļ���ȡ���л����ݣ�
		 * �����л��ָ�ѧ������
		 * 
		 * OIS---FIS---f5
		 */
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:/abc/f5"));
		Student s = (Student) in.readObject();
		System.out.println(s);
		in.close();
	}
}
