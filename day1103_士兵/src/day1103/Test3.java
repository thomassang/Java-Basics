package day1103;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("s士兵数量：");
		int n = new Scanner(System.in).nextInt();
		
		ArrayList<Soldier> list = new ArrayList<>();
		for(int i=1;i<=n;i++){
			Soldier s = new Soldier();
			s.id = i +1;
			list.add(s);
		}
		
		while(list.size() != 0){
			new Scanner(System.in).nextLine();
			for(Iterator<Soldier> it = list.iterator(); it.hasNext();){
				Soldier s = it.next();
				s.attact();
				if(s.blood == 0){
					it.remove();
				}
			}
			System.out.println("士兵数量： " + list.size());
		}
	}

}
