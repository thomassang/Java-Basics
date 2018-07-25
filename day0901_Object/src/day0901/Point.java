package day0901;

public class Point /*extends Object*/{
	private int x;
	private int y;
	
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "（"+x+","+y+"）";
	}
	@Override
	public boolean equals(Object obj) {
		/**
		 * obj的特殊情况；根据需要，选择性判断，全判断也无错
		 */
		if(obj == null) {
			return false;
		}
		if(obj == this){
			return true;
		}
		if(! (obj instanceof Point)){
			return false;
		}
		
		/*this.x 有同名变量必须写this.x*/
		Point p = (Point) obj;//先向下转型
		return x == p.x && y == p.y;
		
	}
}
