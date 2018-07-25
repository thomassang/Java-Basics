package day0603;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("给宠物起个名字： ");
		String name = new Scanner(System.in).nextLine();
		
		//新建dog对象，地址保存到变量dog；
		Dog dog = new Dog(name, 50, 50);
		/*为dog的三个属性赋值
		dog.name = name;
		dog.full = 50;
		dog.happy = 50;
		*/
		while(true){
			double d = Math.random();
			if(d<0.33){
				dog.feed();
			}else if(d<0.66){
				dog.play();
			}else{
				dog.punish();
			}
			
			//等待按回车继续
			new Scanner(System.in).nextLine();
		}
	}

}
