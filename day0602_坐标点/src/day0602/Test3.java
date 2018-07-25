package day0602;
/**
 * 多态
 * @author sj154
 *
 */
public class Test3 {
	public static void main(String[] args) {
		f(new Point(3,4));
		//子类对象，转型成父类型传递到f（）方法
		f(new Point3D(3,4,5));
	}
	
	static void f(Point p){
		System.out.println(p.toString());
		System.out.println(p.distance());
	}

}
