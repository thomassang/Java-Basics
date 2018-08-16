package day1105;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, 
				"34","2","325","346","675","67","46","0798",
				"657","108","32","567","32","7","20","56");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		/**
		 * sort()������������ʹ��һ���Ƚ�������
		 * �������ݴ�С���бȽ�
		 */
		Collections.sort(list,new Comparator<String>() {

			@Override
			/**
			 * o1��o2�ȴ�С
			 * o1������
			 * o2�󣬸���
			 * һ����0
			 */
			public int compare(String o1, String o2) {
				int a = Integer.parseInt(o1);
				int b = Integer.parseInt(o2);
				//return a-b;
				if(a<b){
					return -1;				
				}else if(a>b){
					return 1;
				}else{
					return 0;
				}
			}});
		System.out.println(list);
		
		for (String s : list) {
			System.out.print(s+"  ");
		}
		
	}
}
