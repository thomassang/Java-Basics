package cn.tedu.pojo;

import java.sql.Timestamp;

/**
 * 订单对象：订单号	orderNo
 *  	订单类型	orderType
 *  	人数		persionNum
 *  	收银员	cashier
 *  	开单时间	createTime
 * 		结账时间	endTime
 * 		支付类型	paymentType
 * 		支付金额	payment
 * 		打印时间	printTime
 */
public class Order {
	//id属性
	private int id;
	//订单号
	private String orderNo;
	//订单类型
	private String orderType;
	//人数
	private int personNum;
	//收银员
	private String cashier;
	//开单时间	createTime
	private Timestamp createTime;
	//结账时间	endTime
	private Timestamp endTime;
	//支付类型	paymentType
	private String paymentType;
	//支付金额	payment
	private Double payment;
	//打印时间	printTime
	private Timestamp printTime;
	//门店id的属性
	private int doorId;
	
	//getter和setter方法
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
