package day1203;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws IOException {
		/**
		 * ����ļ������ڣ����Զ��½��ļ�
		 * ����ļ��в����ڣ������쳣
		 */
		RandomAccessFile raf = new RandomAccessFile("e:/abc/f2", "rw");
		
		raf.write(97);//00 00 00 61  -->61
		raf.write(98);//00 00 00 62  -->62
		raf.write(99);//00 00 00 63  -->63
		raf.write(356);//00 00 01 64  -->64
		
		byte[] a = {
				101,102,103,104,105,106,107,108,109,110
		};
		
		raf.write(a);//ȫ��
		
		raf.write(a,2,4);//�±�2��ʼ��4��
		//�±궨λ�ص�0λ��
		raf.seek(0);
		//���ֽڶ�ȡ
		int b;//�����ȡ���ֽ�ֵ
		
		while((b = raf.read()) != -1){
			System.out.println(b);
		}
		//������ȡ
		raf.seek(0);
		byte[] buff = new byte[5];
		int n ;//����ÿһ��������
		while((n = raf.read(buff)) != -1){
			System.out.println(n+"\t"+ Arrays.toString(buff));
		}
		
		raf.close();//�ͷ�ϵͳ��Դ
	}
}
