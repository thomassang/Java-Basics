package day1302;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException  {
		FileOutputStream out = new FileOutputStream("e:/abc/f3");
		out.write(97);
		out.write(98);
		out.write(99);
		out.write(356);
/*		out.write(101);
		out.write(102);*/
		byte[] a = {
				101,102,103,104,105,
				106,107,108,109,110
		};
		
		out.write(a);
		out.write(a,2,4);
		out.close();
	}

}
