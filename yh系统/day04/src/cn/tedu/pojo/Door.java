package cn.tedu.pojo;
/**
 * 这个类用来表示一个门店对象
 * 1、有一些自己的属性
 * 2、属性有自己的getter和setter
 * 3、没有业务逻辑
 */
public class Door {
	
	//门店名称属性
	private String doorname;
	
	//门店电话属性
	private String tel;
	
	//id属性
	private int id;
	
	//getter和setter属性
	public String getDoorname() {
		return doorname;
	}

	public void setDoorname(String doorname) {
		this.doorname = doorname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
