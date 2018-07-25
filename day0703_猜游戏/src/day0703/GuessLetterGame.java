package day0703;

import java.util.Random;

public class GuessLetterGame extends GuessGame{

	@Override
	public String suiji() {
		/**
		 * �������5�����ظ��Ĵ�д��ĸ
		 * 1��StringBuilder��ʾA-Z 26����д��ĸ
		 * 2���������5����ǰ���λ��
		 * 
		 * 	abcdefghijklmnopqrstuvwxyz
		 * 
		 * 3����ȡǮ����ַ�
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
		
		System.out.println("�Ѿ�����5�����ظ��Ĵ�д��ĸ");
		System.out.println("�²��������ĸ��");
		
	}

	@Override
	public String bijiao(String c, String r) {
		
		int a = 0;
		int b = 0;
		
		for(int i=0;i<c.length();i++){
			for(int j=0;j<r.length();j++){
				//iλ���ַ���jλ���ַ����
				if(c.charAt(i) == r.charAt(j)){
					if(i == j){//λ�����
						a++;
					}else{//λ�ò����
						b++;
					}
					//jλ���ҵ���ͬ�ַ������������Ѱ��
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
