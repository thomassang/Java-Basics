package day1104;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("�����ַ�����  ");
		String s = new Scanner(System.in).nextLine();
		
		/**
		 * 1.�½�hashMap<Character��Integer> map����
		 * 2.iѭ�������ַ������е��ַ�
		 * 3.ȡ���ַ���s��iλ�õ��ַ���
		 * 4.��mapȡ�ַ�c�ļ���ֵ�����浽����count
		 * 5.�жϣ�count == null��
		 * 6�����ַ�c�ͼ���1��
		 * 7������
		 * 8.�����ַ�c�ͼ���count+1��
		 * 
		 * 9����ӡmap
		 */
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			Integer count = map.get(c);
			
			if(count == null){
				map.put(c, 1);
			}else{
				map.put(c, count+1);
			}
		}
		System.out.println(map);

	}
}
