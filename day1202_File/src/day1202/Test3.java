package day1202;

import java.io.File;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) throws IOException {
		File file = File.createTempFile("abc", ".txt");
		System.out.println(file.getAbsolutePath());
	}
}
