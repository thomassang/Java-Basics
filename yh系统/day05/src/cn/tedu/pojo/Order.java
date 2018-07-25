package cn.tedu.pojo;

import java.sql.Timestamp;

/**
 * �������󣺶�����	orderNo
 *  	��������	orderType
 *  	����		persionNum
 *  	����Ա	cashier
 *  	����ʱ��	createTime
 * 		����ʱ��	endTime
 * 		֧������	paymentType
 * 		֧�����	payment
 * 		��ӡʱ��	printTime
 */
public class Order {
	//id����
	private int id;
	//������
	private String orderNo;
	//��������
	private String orderType;
	//����
	private int personNum;
	//����Ա
	private String cashier;
	//����ʱ��	createTime
	private Timestamp createTime;
	//����ʱ��	endTime
	private Timestamp endTime;
	//֧������	paymentType
	private String paymentType;
	//֧�����	payment
	private Double payment;
	//��ӡʱ��	printTime
	private Timestamp printTime;
	//�ŵ�id������
	private int doorId;
	
	//getter��setter����
	public int getDoorId() {
		return doorId;
	}

	public void setDoorId(int doorId) {
		this.doorId = doorId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public int getPersonNum() {
		return personNum;
	}

	public void setPersonNum(int personNum) {
		this.personNum = personNum;
	}

	public String getCashier() {
		return cashier;
	}

	public void setCashier(String cashier) {
		this.cashier = cashier;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public Timestamp getPrintTime() {
		return printTime;
	}

	public void setPrintTime(Timestamp printTime) {
		this.printTime = printTime;
	}

}
