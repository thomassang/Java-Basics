package day0602;
/**
 * ��̬
 * @author sj154
 *
 */
public class Test3 {
	public static void main(String[] args) {
		f(new Point(3,4));
		//�������ת�ͳɸ����ʹ��ݵ�f��������
		f(new Point3D(3,4,5));
	}
	
	static void f(Point p){
		System.out.println(p.toString());
		System.out.println(p.distance());
	}

}
