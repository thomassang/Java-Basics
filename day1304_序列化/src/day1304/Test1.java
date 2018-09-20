package day1304;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/**
		 * Student对象，序列化输出，保存到文件
		 * 
		 * OOS---FOS---f5
		 */
		Student s = new Student(9527,"唐伯虎","男",22);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("e:/abc/f5"));
		
		out.writeObject(s);
		
		out.close();

	}
}
