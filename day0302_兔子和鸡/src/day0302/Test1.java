package day0302;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("兔子和鸡一共48只，");
		System.out.println("有108只脚，");
		System.out.println("兔子和鸡各多少只");
		/*
		 * 兔  鸡
		 * i  j
		 * 0  48   xxx
		 * 1  47   xxx
		 * ...
		 * 48 0
		 */
		for(int i=0,j=48; i<=48; i++,j--) {
			int n = i*4+j*2;//脚的数量
			if(n == 108) {
				System.out.println(
				 "兔子："+i+", 鸡："+j);
			}
		}
	}
}






