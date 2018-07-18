package day0105;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(1);
		
		int a  = f(2);
		
		System.out.println(a);
		System.out.println(f(3));
		System.out.println(f(4) + 3);
		

	}
	
	/**
	 * 没有返回值，用void（空）
	 * 没有任何数据传回
	 * 有返回值，要定义返回类型
	 */
	static int f (int x){
		//return向调用位置返回计算结果
		return 2 * x + 3;
	}

}
