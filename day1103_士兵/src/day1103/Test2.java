package day1103;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		//�½�soldier[]����
		Soldier[] a = new Soldier[5];
		for(int i= 0;i<a.length;i++){
			a[i] = new Soldier();
			a[i].id = i+1;
		}
		
		//ʿ�����������㣬�ͼ�������
		while(Soldier.count != 0){
			for(int i=0;i<a.length;i++){
				a[i].attact();
			}
			System.out.println("��ǰʣ��ʿ��������" + Soldier.count);
			System.out.println("----------------");
			new Scanner(System.in).nextLine();
		}
		
	}

}
