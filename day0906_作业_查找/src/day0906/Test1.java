package day0906;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("请输入字符串：");
		String c = new Scanner(System.in).nextLine();
		System.out.print("输入您要找的字符串：");
		String d = new Scanner(System.in).nextLine();
		
		int[] a = fint(c,d);
		System.out.println(a);
	}

	private static int[] fint(String c, String d) {
		//创建足够长的数组
		int[] a = new int [c.length()];
		int i = 0;//用来访问数组a
		
		//用来标记从哪开始向后找
		//并保存找到的下标位置
		int index = 0;
		//死循环向后找
		while(true){
			//从index位置向后找
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
