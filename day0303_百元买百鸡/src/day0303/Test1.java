package day0303;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����5Ԫ1ֻ");
		System.out.println("ĸ��3Ԫ1ֻ");
		System.out.println("С��1Ԫ3ֻ");
		System.out.println("��Ԫ��ټ�");
		
		/*
		 * 1.gѭ����0��<=20����
		 *     2.��gֻ����ʣ��Ǯ���浽����money
		 *     3.money����������ĸ�����浽����max
		 *     4.mѭ����0��<=max����
		 *         5.����mֵĸ��ʣ��Ǯ
		 *           �������С����С�������浽����x   
		 *         6.���g+m+x==100
		 *              7.��ӡ���
		 */
		for(int g=0;g<=20;g++) {
			int money = 100-g*5;
			int max = money/3;
			for(int m=0;m<=33;m++) {
				int x = (money-m*3) * 3;
				if(g+m+x == 100) {
					System.out.println(
					 g+", "+m+", "+x);
				}
			}
		}
		
		
	}
}



