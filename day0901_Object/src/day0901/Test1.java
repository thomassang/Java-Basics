package day0901;

public class Test1 {
	public static void main(String[] args) {
		Point a = new Point(3,4);
		Point b = new Point(3,4);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a == b);//�Ƚϵ����ڴ��ַ
		System.out.println(a.equals(b));//�Ƚϵ�Ҳ���ڴ��ַ
	}

}
