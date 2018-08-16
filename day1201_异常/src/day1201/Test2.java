package day1201;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		try {
			f();
		} catch (IOException e) {
			System.out.println("文件创建失败");
			//打印完成的异常信息。栈追踪信息
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("日期格式错误");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void f() throws IOException, ParseException {
		System.out.println("生日：");
		String s = new Scanner(System.in).nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		String path = "f:\\" + d.getTime() + ".txt";
		File file = new File(path);
		file.createNewFile();
		
	}
}
