package day1201;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.swing.text.rtf.RTFEditorKit;

/**
 * 日期字符串排序
 * @author sj154
 *
 */
public class Test4 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		List<String> list = new ArrayList<>();
		Collections.addAll(list,
				"2018-2-29","2018-3-9","2018-1-16",
				"2018-7-9","2018-10-23","2018-10-29",
				"2018-5-2","2018-7-18","2018-11-6");
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Date d1 = sdf.parse(o1);
					Date d2 = sdf.parse(o1);
					
					return d1.compareTo(d2);
					
				} catch (ParseException e) {
					//包装成能抛出的类型，再抛
					throw new RuntimeException(e);
				}
			}
		});
		System.out.println(list);
	}
}
