package day0605;

public class Test2 {
	public static void main(String[] args) {
		//先执行父类Person的午餐构造
		
		new Student();
		
		System.out.println("---------");
		
		//先执行父类Person的无参构造
		new Student("a","b",1,"d");
	}

}
