package day0101;

public class Test4 {
	public static void main(String[] args) {
		int a = 0xff;
		int b = 0377;
		char c = '\u4e2d';
		//unicode�����ַ���Χ\u4e00��\u9fa5
		char d = '\u4e00';
		char e = '\u9fa5';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
