package day1001;

public class Test1 {
	public static void main(String[] args) {
		Integer a = new Integer(5);//�·����ڴ�
		Integer b = Integer.valueOf(5);//���ʻ������
		Integer c = Integer.valueOf(5);//���ʻ������
		
		System.out.println(a == b);//�ڴ��ַ��ͬ
		System.out.println(b == c);//�ڴ��ַ��ͬ
		System.out.println(a.equals(b));//�ȽϷ�װ��ֵ
		
		System.out.println(a.byteValue());
		System.out.println(a.shortValue());
		System.out.println(a.intValue());
		System.out.println(a.longValue());
		System.out.println(a.floatValue());
		System.out.println(a.doubleValue());
		
		System.out.println("-------------");
		
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toOctalString(255));
		System.out.println(Integer.toHexString(255));
		System.out.println("-------------");
		System.out.println("-------------");
		
	}

}
