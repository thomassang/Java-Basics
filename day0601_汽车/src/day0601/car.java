package day0601;
/**
 * 封装：
 * 		相关的数据和方法代码
 * 		封装在car类中
 */
public class car {
	String brand;//品牌
	String color;//颜色
	int speed;//速度
	
	//构造方法
	public car(	String brand,String color,int speed){
		//有同名局部变量，
		//必须用this.xxx来访问成员变量
		
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	
	public void go(){
		System.out.println(color + brand + "前进,速度：" + speed);
	}
	
	public void stop(){
		System.out.println(color + brand + "停止");
		
	}

}
