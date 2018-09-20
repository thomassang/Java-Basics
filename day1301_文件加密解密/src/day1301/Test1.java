package day1301;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("�����ļ���");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if(! file.isFile()){
			System.out.println("�����ļ�");
			return;
		}
		
		System.out.println("KEY(��λ����������):");
		int key = new Scanner(System.in).nextInt();
		
		try {
			encrypt(file,key);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();
		}
	}

	private static void encrypt(File file, int key) throws Exception{
		/**
		 * ���ļ���ȡһ���ֽ�ֵ
		 * ��key������д�ص��ļ�
		 */
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		/*
		//���ֽڶ�ȡ��׼��ʽ
		int b;
		while((b=raf.read()) != -1){
			b ^= key;
			//�±���ǰһ��λ��
			raf.seek(raf.getFilePointer()-1);
			raf.write(b);
		}
		*/
		
		//һ����8k  8192
		byte[] buff = new byte[8192];
		int n;//����ÿһ��������
		while((n = raf.read(buff)) != -1){
			for(int i=0;i<n;i++){
				buff[i] ^= key;
			}
			//�±�ǰ��n��λ��
			raf.seek(raf.getFilePointer()-n);
			//������ǰn���ֽڣ�һ��д���ļ�
			raf.write(buff,0,n);
		}
		
		raf.close();
	}
}
