package day0804;

import java.awt.Label;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Sword s = new Sword();
		AK47 a = new AK47();
		lyb l = new lyb();
		Transformer t = new Transformer();
		
		t.attack();
		
		while(true){
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(3);
			
			switch(r){
			case 0:
				t.setWeapon(s);break;
			case 1:
				t.setWeapon(a);break;
			case 2:
				t.setWeapon(l);break;
			case 3:
				t.setWeapon(new Weapon(){
					public void kill() {
						System.out.println("小拳拳捶你胸口");
					}

					public String getNmae() {
						return "沙包大的拳头";
					}

					public int getType() {
						return Weapon.TYPE_HOT;
					}});break;
			}
			t.attack();
		}
	}

}
