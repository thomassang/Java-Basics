package cn.tedu.pojo;
/**
 * �����������ʾһ���ŵ����
 * 1����һЩ�Լ�������
 * 2���������Լ���getter��setter
 * 3��û��ҵ���߼�
 */
public class Door {
	
	//�ŵ���������
	private String doorname;
	
	//�ŵ�绰����
	private String tel;
	
	//id����
	private int id;
	
	//getter��setter����
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
