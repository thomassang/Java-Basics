package day0703;

import java.util.Random;

public class GuessLetterGame extends GuessGame{

	@Override
	public String suiji() {
		/**
		 * 随机产生5个不重复的大写字母
		 * 1）StringBuilder表示A-Z 26个大写字母
		 * 2）随机交换5个到前五个位置
		 * 
		 * 	abcdefghijklmnopqrstuvwxyz
		 * 
		 * 3）截取钱五个字符
		 */
		StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		for(int i=0;i<5;i++){
			int j = new Random().nextInt(26);
			char t = sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j, t);
			
		}
		String s = sb.substring(0, 5);
		System.out.println(s);
		return s;
	}

	@Override
	public void tishi() {
		
		System.out.println("已经产生5个不重复的大写字母");
		System.out.println("猜猜这五个字母：");
		
	}

	@Override
	public String bijiao(String c, String r) {
		
		int a = 0;
		int b = 0;
		
		for(int i=0;i<c.length();i++){
			for(int j=0;j<r.length();j++){
				//i位置字符和j位置字符相等
				if(c.charAt(i) == r.charAt(j)){
					if(i == j){//位置相等
						a++;
					}else{//位置不相等
						b++;
					}
					//j位置找到相同字符，不必在向后寻找
					break;
				}
			}
			
		}
		return a+"A"+b+"B";
	}

	@Override
	public boolean caidui(String result) {
		
		return "5A0B".equals(result);
	}

}
