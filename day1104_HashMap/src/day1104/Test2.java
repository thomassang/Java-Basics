package day1104;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("输入字符串：  ");
		String s = new Scanner(System.in).nextLine();
		
		/**
		 * 1.新建hashMap<Character，Integer> map对象，
		 * 2.i循环遍历字符串当中的字符
		 * 3.取出字符串s中i位置的字符，
		 * 4.从map取字符c的计数值，保存到变量count
		 * 5.判断，count == null，
		 * 6放入字符c和计数1，
		 * 7，否则
		 * 8.放入字符c和计数count+1；
		 * 
		 * 9，打印map
		 */
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			Integer count = map.get(c);
			
			if(count == null){
				map.put(c, 1);
			}else{
				map.put(c, count+1);
			}
		}
		System.out.println(map);

	}
}
