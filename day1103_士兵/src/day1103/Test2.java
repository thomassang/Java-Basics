package day1103;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		//新建soldier[]数组
		Soldier[] a = new Soldier[5];
		for(int i= 0;i<a.length;i++){
			a[i] = new Soldier();
			a[i].id = i+1;
		}
		
		//士兵数量不是零，就继续进攻
		while(Soldier.count != 0){
			for(int i=0;i<a.length;i++){
				a[i].attact();
			}
			System.out.println("当前剩余士兵数量：" + Soldier.count);
			System.out.println("----------------");
			new Scanner(System.in).nextLine();
		}
		
	}

}
