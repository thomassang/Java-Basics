package day0904;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println('\\');
		
		System.out.print("���������֤�ţ�");
		String s = new Scanner(System.in).nextLine();
		/**
		 * 123456789012345
		 * 123456789012345678
		 * 12345678901234567x
		 * 12345678901234567X
		 * 
		 * \d{15}��15λ���ֵı������֤�ţ�
		 * \d{17}[\dxX]��18λ���ֵı������֤�ţ�
		 */
		
		String regex = "\\d{15}|\\d{17}[\\dxX]";
		
		if(s.matches(regex)){
			System.out.println("��ʽ��ȷ");
		}else{
			System.out.println("��ʽ����");
		}
	}

}
