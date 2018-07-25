package day0602;

public class Test1 {
	public static void main(String[] args) {
		//新建两个Point对象，
		//内存地址分别保存到p1和p2
		Point p1 = new Point(3, 4);
		Point p2 = new Point();
		
		/*  
		 * 为p1和p2的xy属相赋值
		p1.x = 9;
		p1.y = 36;
		*/
		p2.x = 16;
		p2.y = 5;
		
		//分别调用两个对象的distance（）和toString（）	
		//方法，并打印方法的返回值
		System.out.println(p1.toString());
		System.out.println(p1.distance());
		System.out.println(p2.toString());
		System.out.println(p2.distance());
	}

}
