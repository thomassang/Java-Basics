package day0202;
/**
 * �������������������ֵ
 */
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("��������������");
		
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		
		//abc����������ֵ�����ݵ�max���������������ֵ��
		//�õ������ķ��ؽ�������浽����m
		int m = max(a,b,c);
		
		System.out.println("���ֵ�� " + m);
	}

	private static int max(int a, int b, int c) {
		// ���ֵ�жϺ���
	//��a��b�����ֵ���浽����max
		
/*		int max = a>b ? a : b;
		
		//��max��c�����ֵ�����浽max
		max = max>c ? max : c;
		*/
		//�ϲ���
		int max = a>b ? (a>c ? a : c) : (b>c ? b : c);
		
		return max;
	}

}
