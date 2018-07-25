package day0304;

public class Test2 {
	public static void main(String[] args) {
		//打印1到100,跳过尾数3,5,7
		for(int i=1;i<=100;i++) {
			//尾数是3,5,7,跳到i++,进入下一轮
			int y = i%10;
			if(y==3 || y==5 || y==7) {
				continue;
			}
			System.out.println(i);
		}
	}
}
