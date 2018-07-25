package day0308;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		//新建10个长度的int[]数组，
		//地址存到变量 a
		int[] a = new int[10];
		//遍历，填入100内随机值
		for(int i=0; i<a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		
		System.out.println(Arrays.toString(a)); 
		
		System.out.println("--交换3,4位置的值-----------");
		swap(a,3,4);
		System.out.println(Arrays.toString(a)); 
		
		System.out.println("--获得最小值的位置下标----------------");
		int index = min(a);
		System.out.println("最小值位置："+index);
		
		swap(a,0,index);
		System.out.println(Arrays.toString(a));
	}

	private static int min(int[] a) {
		/*
		 *            m=3
		 * [59,18,62,14,64,70,67,25,94,58]
		 *                                 i
		 * 
		 * *)假设0位置就是最小值
		 * *)从1位置向后找比m位置更小值
		 * *)找到更小值，m定位到i位置
		 * 
		 * 1.定义下标m=0
		 * 2.i循环从1到<a.length
		 *     3.如果i位置值<m位置值
		 *          4.把m修改成i的值
		 * 
		 * 5.返回m的值
		 */
		int m=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[m]) {
				m = i;
			}
		}
		
		return m;
	}
	
	

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}	






