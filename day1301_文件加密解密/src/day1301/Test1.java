package day1301;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入文件：");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if(! file.isFile()){
			System.out.println("不是文件");
			return;
		}
		
		System.out.println("KEY(八位二进制数字):");
		int key = new Scanner(System.in).nextInt();
		
		try {
			encrypt(file,key);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void encrypt(File file, int key) throws Exception{
		/**
		 * 从文件读取一个字节值
		 * 对key异或后，再写回到文件
		 */
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		/*
		//单字节读取标准格式
		int b;
		while((b=raf.read()) != -1){
			b ^= key;
			//下标往前一个位置
			raf.seek(raf.getFilePointer()-1);
			raf.write(b);
		}
		*/
		
		//一般用8k  8192
		byte[] buff = new byte[8192];
		int n;//保存每一批的数量
		while((n = raf.read(buff)) != -1){
			for(int i=0;i<n;i++){
				buff[i] ^= key;
			}
			//下标前移n个位置
			raf.seek(raf.getFilePointer()-n);
			//数组中前n个字节，一批写回文件
			raf.write(buff,0,n);
		}
		
		raf.close();
	}
}
