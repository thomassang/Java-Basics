package day0602;
/**
 * ��װ��
 * 		�������ص����ԡ���������
 *		��װ��Point��
 *
 */
public class Point {
	int x;
	int y;
	
	public Point(){}
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public double distance(){
		
		return Math.sqrt(x*x + y*y);
	}
	
	public String toString(){
		
		return "(" + x +", " + y + ")";
	}

}
