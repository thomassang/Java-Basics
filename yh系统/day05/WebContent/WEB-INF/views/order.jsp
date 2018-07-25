<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>永和大王</title>

<link rel="stylesheet" href="css/order.css"/>
</head>
<body>
							
	<div>顾客联</div>
	<div class="please">请您留意取餐账单号</div>
	<div class="me">自取顾客联</div>
	<div>${door.doorname}</div>
	<div>${door.tel}</div>
	<div class="me">--结账单--</div>
	<div class="please">账单号：${order.orderNo}</div>
	<div>账单类型:${order.orderType }</div>
	<div>人数：${order.personNum }</div>
	<div>收银员：${order.cashier }</div>
	<div>开单时间：${order.createTime }</div>
	<div>结账时间：${order.endTime }</div>
	
	<hr style="border:1px dashed;">
	
	<div>
		<table>				<!-- 向网页中插入表格 -->
		
			<tr>			<!-- 表格中的行元素 -->		
				<td width=70px;>数量</td>	<!-- 表示表格中的列元素 -->
				<td width=170px;>品项</td>
				<td>金额</td>
			</tr>
			<!--
			 这个地方我们要使用jstl标签库的c:forEach标签，主要完成
			遍历我们的list集合。
			 -->
			 <c:forEach items="${orderdetail}" var="o">
			 	<tr>
			 		<td>${o.num}</td>
			 		<td>${o.item}</td>
			 		<td>${o.price}</td>
			 	</tr>			 			 
			 </c:forEach>
			 

			
		</table>
	</div>
	
	<hr style="border:1px dashed;">
	
	<div>
		<table>
			<tr>
				<td width=250px;>合计</td>
				<td>8.00</td>
			</tr>
			<tr>
                <td>${order.paymentType }</td>
                <td>${order.payment }</td>
			</tr>
		</table>
	</div>
	
	<hr style="border:1px dashed;">
	
	<div>打印时间：${order.printTime }</div>
	
	<hr style="border:1px dashed;">
	
	<div class="note">
		根据相关税法规定，
		电子发票的开票日期同网上申请电子发票的日期，
		如您需要当日的电子发票请务必在消费当日通过扫描下方二维码，
		根据指引步骤开具您的增值税电子普通发票，此二维码30天有效，
		扫码时请保持小票平整。
	</div>
	
	<div class="img">
		<img src="jmg/QR2.png">
	</div><!-- 插入二维码的位置 -->
	
	<div>官网：www.youhe.com.cn</div>
	<div>加盟热线：88-21-60769397	或	88-21-60769002</div>
	
</body>
</html>