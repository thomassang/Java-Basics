package day1202;
/**
 * ����File
 */
import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		
		path = "E:\\�����ļ�\\����java����.pdf";//���ڵ��ļ�
		
		File file1 = new File(path);
		System.out.println(file1.exists());
		System.out.println(file1.length());
		System.out.println(file1.isFile());
		System.out.println(file1.isDirectory());
		System.out.println("-------------");
		
		path = "E:\\�����ļ�";//���ڵ��ļ���
		
		File file2 = new File(path);
		System.out.println(file2.exists());
		System.out.println(file2.length());
		System.out.println(file2.isFile());
		System.out.println(file2.isDirectory());
		System.out.println("-------------");
		
		path = "I:\\�����ļ�";//�����ڵ�·��
		
		File file3 = new File(path);
		System.out.println(file3.exists());
		System.out.println(file3.length());
		System.out.println(file3.isFile());
		System.out.println(file3.isDirectory());
		System.out.println("-------------");
	}
}
