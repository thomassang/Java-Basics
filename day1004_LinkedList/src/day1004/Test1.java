package day1004;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * <>����
		 * 		���ã����Ƽ����д�ŵ���������
		 * 			��֧�ֻ������͡�Ҫʹ�û������͵İ�װ����
		 */
		LinkedList<String> list = new LinkedList</*String*/>();
		
		list.add("111-");
		list.add("222-");
		list.add("333-");
		list.add("111-");
		list.add("444-");
		list.add("555-");
		list.add("666-");
		list.add("777-");
		list.add("888-");
		list.add("111-");
		list.add("999-");
		list.add("aaa-");
		list.add("sss-");
		list.add("kkk-");
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		System.out.println(list.remove(3));
		System.out.println(list);
		System.out.println(list.size());
		
		//˫�������±����Ч�ʵ�
		//ÿ�η���һ���±�λ�ã�����ͷ��ʼ��һ��һ���������
		for(int i=0; i<list.size(); i++){
			String l = list.get(i);
			
			System.out.print(l);
		}
		System.out.println();
		System.out.println("!-----!------!");
		//����������
		//�½�������
		Iterator<String> it = list.iterator();
		//����������
		while(it.hasNext()){
			//ȡ��һ������
			String s = it.next();
			
			System.out.print(s);
		}
		
	}

}
