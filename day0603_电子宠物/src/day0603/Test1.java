package day0603;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("������������֣� ");
		String name = new Scanner(System.in).nextLine();
		
		//�½�dog���󣬵�ַ���浽����dog��
		Dog dog = new Dog(name, 50, 50);
		/*Ϊdog���������Ը�ֵ
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
			
			//�ȴ����س�����
			new Scanner(System.in).nextLine();
		}
	}

}
