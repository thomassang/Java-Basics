package day0603;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("1, ��");
		System.out.println("2, è");
		System.out.println("ѡ�� ");
		int c = new Scanner(System.in).nextInt();
		
		System.out.println("�������֣�");
		String n = new Scanner(System.in).nextLine();
		/*	
		Dog dog;
		Cat cat;
		 */
		Pet p;
		
		switch(c){
		case 1:
			//������󣬵��������ͣ����浽�����ͱ���
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

			//�ȴ����س�����
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

			//�ȴ����س�����
			new Scanner(System.in).nextLine();
		}

	}
	*/
}
