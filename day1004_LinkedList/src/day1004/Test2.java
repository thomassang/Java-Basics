package day1004;

import java.util.Iterator;
import java.util.LinkedList;

public class Test2 {
	public static void main(String[] args) {
		//׼������
		LinkedList<String> list = new LinkedList<>();
		
		for(int i = 0; i<100000;i++){
			list.add("a");
		}
		System.out.println(list.size());
		
		System.out.println("----�±����-----");
		
		long t = System.currentTimeMillis();
		f1(list);
		
		t = System.currentTimeMillis()-t;
		System.out.println(t);
		
		System.out.println("----��������-----");
		t = System.currentTimeMillis();
		f2(list);
		t = System.currentTimeMillis()-t;
		System.out.println(t);
	}

	private static void f1(LinkedList<String> list) {
		// �±��
		for(int i = 0;i<list.size();i++){
			list.get(i);
		}
	}

	private static void f2(LinkedList<String> list) {
		// ��������
		//�½�������
		Iterator<String> it = list.iterator();
		//����������
		while(it.hasNext()){
			//ȡ��һ������
			it.next();
		}
	}

}
