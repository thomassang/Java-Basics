package cn.tedu.pojo;
/**
 * �����������Ŷ����������
 * ���ԣ�������Ʒ����
 *
 */
public class OrderDetail {
	
	//id���ԣ�
	private int id;
	
	//��������
	private int num;
	
	//Ʒ������
	private String item;
	
	//���
	private Double price;
	
	//�ṩ������getter��setter����
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
