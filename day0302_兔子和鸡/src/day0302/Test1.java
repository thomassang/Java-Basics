package day0302;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("���Ӻͼ�һ��48ֻ��");
		System.out.println("��108ֻ�ţ�");
		System.out.println("���Ӻͼ�������ֻ");
		/*
		 * ��  ��
		 * i  j
		 * 0  48   xxx
		 * 1  47   xxx
		 * ...
		 * 48 0
		 */
		for(int i=0,j=48; i<=48; i++,j--) {
			int n = i*4+j*2;//�ŵ�����
			if(n == 108) {
				System.out.println(
				 "���ӣ�"+i+", ����"+j);
			}
		}
	}
}






