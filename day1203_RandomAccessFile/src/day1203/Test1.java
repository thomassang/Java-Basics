package day1203;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws IOException {
		/**
		 * 如果文件不存在，会自动新建文件
		 * 如果文件夹不存在，出现异常
		 */
		RandomAccessFile raf = new RandomAccessFile("e:/abc/f2", "rw");
		
		raf.write(97);//00 00 00 61  -->61
		raf.write(98);//00 00 00 62  -->62
		raf.write(99);//00 00 00 63  -->63
		raf.write(356);//00 00 01 64  -->64
		
		byte[] a = {
				101,102,103,104,105,106,107,108,109,110
		};
		
		raf.write(a);//全部
		
		raf.write(a,2,4);//下标2开始的4个
		//下标定位回到0位置
		raf.seek(0);
		//单字节读取
		int b;//保存读取的字节值
		
		while((b = raf.read()) != -1){
			System.out.println(b);
		}
		//批量读取
		raf.seek(0);
		byte[] buff = new byte[5];
		int n ;//保存每一批的数量
		while((n = raf.read(buff)) != -1){
			System.out.println(n+"\t"+ Arrays.toString(buff));
		}
		
		raf.close();//释放系统资源
	}
}
