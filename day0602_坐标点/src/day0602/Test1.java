package day0602;

public class Test1 {
	public static void main(String[] args) {
		//�½�����Point����
		//�ڴ��ַ�ֱ𱣴浽p1��p2
		Point p1 = new Point(3, 4);
		Point p2 = new Point();
		
		/*  
		 * Ϊp1��p2��xy���ำֵ
		p1.x = 9;
		p1.y = 36;
		*/
		p2.x = 16;
		p2.y = 5;
		
		//�ֱ�������������distance������toString����	
		//����������ӡ�����ķ���ֵ
		System.out.println(p1.toString());
		System.out.println(p1.distance());
		System.out.println(p2.toString());
		System.out.println(p2.distance());
	}

}
