package day0104;

public class Test1 {
	public static void main(String[] args) {

		System.out.println("ţ��֯Ů�����16.4���꣬");
		System.out.println("����299792458��/�룬");
		System.out.println("ϲȵ��0.46�ף�");
		System.out.println("ţ��֯Ů��ᣬ��Ҫ����ֻϲȵ��");
		
		//�ȼ���һ���������
		long ly = 299792458L * 60 * 60 * 24 * 365;
		
		//16.4���������
		double d = 16.4 * ly;
		
		//ϲȵ����
		double r = d/0.46;
		
		//����ȡ��
		//math.ceil(r)ȡ�������double���ͣ��е���
		//ǿ������ת��
		long n = (long) Math.ceil(r);
		
		System.out.println("��Ҫ"+n+"ֻϲȵ��");
				
	}

}
