package day1202;
/**
 * 测试File
 */
import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		
		path = "E:\\桌面文件\\达内java书上.pdf";//存在的文件
		
		File file1 = new File(path);
		System.out.println(file1.exists());
		System.out.println(file1.length());
		System.out.println(file1.isFile());
		System.out.println(file1.isDirectory());
		System.out.println("-------------");
		
		path = "E:\\桌面文件";//存在的文件夹
		
		File file2 = new File(path);
		System.out.println(file2.exists());
		System.out.println(file2.length());
		System.out.println(file2.isFile());
		System.out.println(file2.isDirectory());
		System.out.println("-------------");
		
		path = "I:\\桌面文件";//不存在的路径
		
		File file3 = new File(path);
		System.out.println(file3.exists());
		System.out.println(file3.length());
		System.out.println(file3.isFile());
		System.out.println(file3.isDirectory());
		System.out.println("-------------");
	}
}
