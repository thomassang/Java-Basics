package day1104;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		Student s1 = new Student(1,"张三","男",19);
		Student s2 = new Student(1,"张三","男",19);

		//哈希值必须相同，才能保证计算出相同位置
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//及时下标相同，equals（）相同才能覆盖
		System.out.println(s1.equals(s2));
		
		HashMap<Student,Integer> map = new HashMap<>();
		map.put(s1, 95);
		map.put(s2, 90);
		
		System.out.println(map);
	}
}
