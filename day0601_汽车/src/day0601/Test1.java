package day0601;

import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//新建car对象
		//吧对象的内存地址，保存到变量c1
		car c1 = new car("宝马", "粉色", new Random().nextInt(150));
		car c2 = new car("奔驰", "无色", new Random().nextInt(230));
		
		/*为c1对象的三个属性赋值，
		c1.brand = "宝马";
		c1.color = "粉色";
		c1.speed = new Random().nextInt(150);
		*/
//		c1.brand = "奔驰";
//		c1.color = "无色";
//		c1.speed = new Random().nextInt(230);
//		
//		//控制c1执行go（）方法，或stop（）方法
		c1.go();
		c2.go();

		c1.stop();
		c2.stop();
	}

}
