package day1102;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(555);
		list.add(666);
		list.add(777);
		list.add(888);
		list.add(333);
		list.add(111);
		list.add(444);
		list.add(999);
		list.add(333);
		list.add(888);
		list.add(000);
		list.add(222);
		list.add(444);
		list.add(444);
		list.add(444);
		
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println(list.remove(3));
		System.out.println(list);
		
		System.out.println(list.remove(Integer.valueOf(444)));
		System.out.println(list);
		
		//下标遍历
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i));
		}
		System.out.println("");
		System.out.println("---------");
		//迭代器遍历
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			Integer a = it.next();
			System.out.print(a);
			
			if(a == 444){
				//迭代遍历期间，不能使用使用集合来添加或删除数据
				//用来移除刚刚取出的数据
				it.remove();
			}
		}
		System.out.println("");
		System.out.println(list);
	}

}
