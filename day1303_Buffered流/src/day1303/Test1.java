package day1303;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException{
		/**
		 * �ļ������
		 * ��Buffered
		 */
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("e:/abc/f4"));
		
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		fos.flush();//ˢ����������
		/**
		 * �߼�����close
		 * 		1��flush����
		 * 		2���ر�       
		 */
		
		fos.close();
		
	}
}







