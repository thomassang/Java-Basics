package cn.tedu.pojo;
/**
 * 这个类用来存放订单详情对象
 * 属性：数量，品项，金额
 *
 */
public class OrderDetail {
	
	//id属性：
	private int id;
	
	//数量属性
	private int num;
	
	//品项属性
	private String item;
	
	//金额
	private Double price;
	
	//提供公共的getter和setter方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
