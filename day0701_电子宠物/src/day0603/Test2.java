package day0603;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("1, 狗");
		System.out.println("2, 猫");
		System.out.println("选择： ");
		int c = new Scanner(System.in).nextInt();
		
		System.out.println("宠物名字：");
		String n = new Scanner(System.in).nextLine();
		/*	
		Dog dog;
		Cat cat;
		 */
		Pet p;
		
		switch(c){
		case 1:
			//子类对象，当做父类型，保存到父类型变量
			p = new Dog(n,60,60);
			play(p);
			break;
		case 2:
			p = new Cat(n,50,50);
			play(p);
			break;
		}
	}

	private static void play(Pet p) {
		// TODO Auto-generated method stub
		while(true){
			double d = Math.random();
			if(d<0.33){
				p.feed();
			}else if(d<0.66){
				p.play();
			}else{
				p.punish();
			}

			//等待按回车继续
			new Scanner(System.in).nextLine();
		}
	}
/*
	private static void play(Dog dog) {
		// TODO Auto-generated method stub
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
	*/
}
