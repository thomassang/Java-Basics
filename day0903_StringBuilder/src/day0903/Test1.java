package day0903;

public class Test1 {
	public static void main(String[] args) {
		String s0 = "abcdefghijklmnopqrstuvwxyz"; 
		StringBuilder sb = new StringBuilder();
		
		//���ϵͳʱ�����ֵ
		long t = System.currentTimeMillis();
		/**
		 * ��1970��1��1��0�㿪ʼ�ĺ���ֵ
		 */
		for(int i = 0; i<1000000;i++){
			sb.append(s0);
		}
		t = System.currentTimeMillis()-t;
		
		System.out.println(t);
	}

}
