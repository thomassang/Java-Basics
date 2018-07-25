package day0801;

import java.util.Random;

/**
 * 封装：
 * 		把士兵相关的属性数据，方法代码
 * 		封装成一个独立的组件（类）
 */
public class Soldier {
	//属性数据，成员变量
	int id;	//默认为零
	int blood = 100;
	
	//静态变量，士兵计数
	static int count;
	
	//day06新加内容：构造方法
	public Soldier(){
		System.out.println("新建soldier对象是执行");
		
		//同一个类中，类名可以省略
		Soldier.count++;
	}
	
	
	//成员方法
	public void go(){
		System.out.println(id + "号士兵前进");
	}
	
	public void attact(){
		System.out.println(id + "号士兵进攻");
		//随机的减血量
		int d =  new Random().nextInt(10);
		blood -= d;
		
		//如果血量变成负数，置成0 
		if(blood < 0){
			blood = 0;			
		}
		
		System.out.println("血量： " + blood );
		
		if(blood == 0){
			System.out.println(id + "号士兵阵亡");
		
			Soldier.count--; 
			
			return;
		}
	}
}
