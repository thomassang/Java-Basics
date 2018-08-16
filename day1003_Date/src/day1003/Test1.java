package day1003;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		Date a = new Date();
		Date d = new Date(1500000000000L);
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(a.getTime());
		System.out.println(d.getTime());
		
		a.setTime(0L);
		System.out.println(a);
		System.out.println(a.compareTo(d));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1 = sdf.format(a);
		String s2 = sdf.format(d);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
