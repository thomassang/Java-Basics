package day0906;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("�������ַ�����");
		String c = new Scanner(System.in).nextLine();
		System.out.print("������Ҫ�ҵ��ַ�����");
		String d = new Scanner(System.in).nextLine();
		
		int[] a = fint(c,d);
		System.out.println(a);
	}

	private static int[] fint(String c, String d) {
		//�����㹻��������
		int[] a = new int [c.length()];
		int i = 0;//������������a
		
		//������Ǵ��Ŀ�ʼ�����
		//�������ҵ����±�λ��
		int index = 0;
		//��ѭ�������
		while(true){
			//��indexλ�������
			index = c.indexOf(d,index);
			if(index == -1){
				break;
			}
			a[i] = index;
			i++;
			index++;
			if(index >= c.length()){
				break;
			}
		}
		return Arrays.copyOf(a, i);
	}

}
