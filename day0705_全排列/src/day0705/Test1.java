package day0705;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		qpl(a, 0);
	}

	private static void qpl(int[] a, int start) {
		if(start==a.length-1) {
			System.out.println(Arrays.toString(a));
			return;
		}
		
		/*       start
		 *       |
		 * 1, 2, 3
		 *       i
		 * 
		 * *)将i位置的值，固定到start位置
		 * *)对后面的值全排列
		 */
		for(int i=start; i<a.length; i++) {
			swap(a,i,start);
			qpl(a, start+1);
			//交换回来，否则进一步递归执行过程中，会引起混乱
			swap(a,i,start);
		}
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}






