package day0101;

public class Test1 {
	/**
	 * ��ݼ���
	 * main������main֮��alt+/
	 * ִ�У�Ctrl+F11
	 * @param args
	 */
	
	public static void main(String[] args){
		/**
		 * �˸�����abcdefgh
		 * ����������������Сֵ�����ֵ
		 */
		byte a = -128;
		byte b = 127;
		
		/**
		 * jdk����е�short��
		 * �еĳ���MIN_VALUE
		 * 
		 * ��д����������
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
