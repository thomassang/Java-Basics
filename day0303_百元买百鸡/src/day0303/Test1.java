package day0303;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("公鸡5元1只");
		System.out.println("母鸡3元1只");
		System.out.println("小鸡1元3只");
		System.out.println("百元买百鸡");
		
		/*
		 * 1.g循环从0到<=20递增
		 *     2.买g只公鸡剩的钱，存到变量money
		 *     3.money最多能买多少母鸡，存到变量max
		 *     4.m循环从0到<=max递增
		 *         5.又买m值母鸡剩的钱
		 *           能买多少小鸡，小鸡数量存到变量x   
		 *         6.如果g+m+x==100
		 *              7.打印组合
		 */
		for(int g=0;g<=20;g++) {
			int money = 100-g*5;
			int max = money/3;
			for(int m=0;m<=33;m++) {
				int x = (money-m*3) * 3;
				if(g+m+x == 100) {
					System.out.println(
					 g+", "+m+", "+x);
				}
			}
		}
		
		
	}
}



