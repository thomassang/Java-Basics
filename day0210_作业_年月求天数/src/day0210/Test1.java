package day0210;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("年：");
		int y = new Scanner(System.in).nextInt();
		System.out.println("月：");
		int m = new Scanner(System.in).nextInt();
		
		if(m<1 || m>12){
			System.out.println("月份错误");
			return;
		}
		
		int d = days(y,m);
		System.out.println(d);
	}

	private static int days(int y, int m) {
		// 
		int days = 0;
		
		switch(m){
		case 1:case 3:case 5:case 7:case 8:
		case 10:case 12:
			days=31;break;
		case 4:case 6:case 9:case 11:
			days= 30; break;
		case 2:
			if((y%4 == 0 && y%100 != 0)||y%400 == 0){
				days = 29;
			}else{
				days = 28;
			}
		}
		return days;
	}

}
