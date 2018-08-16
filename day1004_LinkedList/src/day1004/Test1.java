package day1004;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * <>泛型
		 * 		作用：限制集合中存放的数据类型
		 * 			不支持基本类型。要使用基本类型的包装类型
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
		
		//双向链表，下标遍历效率低
		//每次访问一个下标位置，都从头开始，一步一步向后引用
		for(int i=0; i<list.size(); i++){
			String l = list.get(i);
			
			System.out.print(l);
		}
		System.out.println();
		System.out.println("!-----!------!");
		//迭代器遍历
		//新建迭代器
		Iterator<String> it = list.iterator();
		//当还有数据
		while(it.hasNext()){
			//取下一个数据
			String s = it.next();
			
			System.out.print(s);
		}
		
	}

}
