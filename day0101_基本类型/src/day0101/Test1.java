package day0101;

public class Test1 {
	/**
	 * 快捷键：
	 * main方法：main之后按alt+/
	 * 执行：Ctrl+F11
	 * @param args
	 */
	
	public static void main(String[] args){
		/**
		 * 八个变量abcdefgh
		 * 保存四种整数的最小值和最大值
		 */
		byte a = -128;
		byte b = 127;
		
		/**
		 * jdk类库中的short类
		 * 中的常量MIN_VALUE
		 * 
		 * 大写是类库里的类
		 */
		short c = Short.MIN_VALUE;
		short d = Short.MAX_VALUE;
		
		int e = Integer.MIN_VALUE;
		int f = Integer.MAX_VALUE;
		
		long g = Long.MIN_VALUE;
		long h = Long.MAX_VALUE;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	}

}
