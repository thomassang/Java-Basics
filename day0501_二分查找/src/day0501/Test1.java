package day0501;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int[] a = suiJi();
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		System.out.print("查找的目标值： ");
		
		int t = new Scanner(System.in).nextInt();
		//二分查找
		int index = binarySearch(a,t);
		
		System.out.println(index);
	}

	private static int binarySearch(int[] a, int t) {
      /*
       * 38
       *                mid
       * [1, 3, 30, 33, 38, 59, 61, 70, 85, 90]
       *  lo
       *                                    hi
       *                                   
       * 1.定义三个下标
       *   lo=0
       *   hi=a.length-1
       *   mid 先不赋值
       * 2.当lo<=hi
       *      3.计算中间位置mid=(lo+hi)/2
       *      4.mid位置的值>t，hi定位到mid-1位置        
       *      5.mid位置的值<t，lo定位到mid+1位置
       *      6.否则，直接返回mid的值
       * 7.找不到数据，返回一个特殊值-1
       */
		int lo = 0;
		int hi = a.length-1;
		int mid;
		
		while(lo <= hi){
			mid = (lo+hi)/2;
			if(a[mid] > t){
				hi = mid-1;
			}else if(a[mid] < t){
				lo = mid + 1;
			}else{
				return mid;
			}
			
		}
		
		return -1;
	}

	private static int[] suiJi() {
		int len = 5+new Random().nextInt(6);
		int[] a = new int[len];
		
		for(int i = 0; i < a.length; i++){
			a[i] = new Random().nextInt(100);
		}
		
		return a;
	}

}
