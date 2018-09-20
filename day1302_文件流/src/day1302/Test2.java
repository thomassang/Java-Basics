package day1302;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream in;
		in = new FileInputStream("e:/abc/f3");
		//单字节读取
		int b;
		while((b=in.read()) != -1){
			System.out.println(b);
		}
		in.close();
		in = new FileInputStream("e:/abc/f3");
		//批量读取
		byte[] buff = new byte[8192];
		int n;//保存每一批的数量
		while((n = in.read(buff)) != -1){
			/*for(int i=0;i<n;i++){
				buff[i] ^= key;
			}
			//下标前移n个位置
			raf.seek(raf.getFilePointer()-n);
			//数组中前n个字节，一批写回文件*/
          		in.wait(b, n);
			
		}
		in.close();
	}

}
