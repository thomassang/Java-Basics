package day0309;

public class Test1 {
	public static void main(String[] args) {
		// 99�˷���
		
		//9��
		for(int i=1; i<=9; i++) {
			//1��i
			for(int j=1; j<=i; j++) {
				if(j==3 && (i==3||i==4)) {
					System.out.print(" ");
				}
				System.out.print(
				 j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();//����
		}
	}
}




