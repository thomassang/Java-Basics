package day0105;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(1);
		
		int a  = f(2);
		
		System.out.println(a);
		System.out.println(f(3));
		System.out.println(f(4) + 3);
		

	}
	
	/**
	 * û�з���ֵ����void���գ�
	 * û���κ����ݴ���
	 * �з���ֵ��Ҫ���巵������
	 */
	static int f (int x){
		//return�����λ�÷��ؼ�����
		return 2 * x + 3;
	}

}
