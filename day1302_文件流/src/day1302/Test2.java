package day1302;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream in;
		in = new FileInputStream("e:/abc/f3");
		//���ֽڶ�ȡ
		int b;
		while((b=in.read()) != -1){
			System.out.println(b);
		}
		in.close();
		in = new FileInputStream("e:/abc/f3");
		//������ȡ
		byte[] buff = new byte[8192];
		int n;//����ÿһ��������
		while((n = in.read(buff)) != -1){
			/*for(int i=0;i<n;i++){
				buff[i] ^= key;
			}
			//�±�ǰ��n��λ��
			raf.seek(raf.getFilePointer()-n);
			//������ǰn���ֽڣ�һ��д���ļ�*/
          		in.wait(b, n);
			
		}
		in.close();
	}

}
