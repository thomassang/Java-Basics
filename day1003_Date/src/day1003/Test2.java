package day1003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入您的生日(yyyy-MM-dd)");
		String s = new Scanner(System.in).nextLine();
		
		/**
		 * "1992-3-9"
		 * 字符串要解析成date对象
		 * 
		 * 只能解析指定格式的时间字符串
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		/**
		 * 鼠标提示，选择add throws
		 */
		Date d = sdf.parse(s);
		long t = System.currentTimeMillis()-d.getTime();
		t = t/1000/60/60/24;
		System.out.println("您已经生存了"+t+"天");
	}

}
