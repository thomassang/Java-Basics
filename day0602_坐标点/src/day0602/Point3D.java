package day0602;
/**
 * 增加变量z，成为三维坐标系
 *
 */
public class Point3D extends Point{
	//x,y,distance(),tostrin()
	int z;
	public Point3D(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double distance(){
		
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	public String toString(){
		
		return "("+x+", "+y+", "+z+")";
	}
}
