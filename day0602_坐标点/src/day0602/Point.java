package day0602;
/**
 * 封装：
 * 		坐标点相关的属性、方法代码
 *		封装成Point类
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
