package cn.tedu.servlet;
/**
 * 这个类用来完成永和系统小票打印
 */
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

import cn.tedu.pojo.Door;
import cn.tedu.pojo.Order;
import cn.tedu.pojo.OrderDetail;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public OrderServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//给页面准备数据
		
		try {
			//根据门店id查询门店表信息
			request.setAttribute("door", getDoor(1));
			//根据订单id查询订表信息
			request.setAttribute("order", getOrder(1));
			//根据订单详情id查询信息
			request.setAttribute("orderdetail", getOrderDetail(1));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//跳转页面
		request.getRequestDispatcher("/WEB-INF/views/order.jsp")
				.forward(request, response);
		
	}
	
	private List<OrderDetail> getOrderDetail(int orderId) throws SQLException {
		// TODO Auto-generated method stub
		//1.注册驱动
		DriverManager.registerDriver(new Driver());
		//2、获取数据库连
		String url="jdbc:mysql:///store_yh";//数据库的 连接地址
		String user="root";
		String password="root";	
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		//3、获取传输器
		Statement st = conn.createStatement();
		
		//4、执行SQL
		String sql="select * from tb_order_detail where order_id = " + orderId;
		ResultSet rs = st.executeQuery(sql);
		
		//5、遍历结果集(给door赋值)
		List<OrderDetail> list = new ArrayList<OrderDetail>();
		while(rs.next()){
			//获取字段的值
			int id = rs.getInt(1);
			
			int num = rs.getInt(2);
			
			String item = rs.getString(3);
			
			double price = rs.getDouble(4);
			
			int orderid = rs.getInt(5);
			
			OrderDetail od = new OrderDetail();
			
			od.setId(id);
			od.setItem(item);
			od.setNum(num);
			od.setPrice(price);
			od.setOrderid(orderid);
			
			//list用来存放查询出来的多个对象
			list.add(od);
			
		}
		
		//6、释放资源
		rs.close();
		st.close();
		conn.close();
		
		return list;
	}

	//根据订单id查询订单表的信息，最终返回订单对象
	private Order getOrder(int OrderId) throws SQLException {
		//1、注册驱动
		DriverManager.registerDriver(new Driver());
		
		//2、获取数据库连
		String url = "jdbc:mysql:///store_yh";
		String user = "root";
		String password = "root";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		//3、获取传输器
		Statement st = conn.createStatement();
		
		//4、执行SQL
		String sql = "select * from tb_order where id = " +OrderId;
		ResultSet rs = st.executeQuery(sql);
		
		//5、遍历结果集(给order赋值)
		Order o = new Order();//声明order对象，空的
		while(rs.next()){
			int id = rs.getInt(1);//获取id的值	
			o.setId(id);//配置order对象id值
			
			String orderno = rs.getString(2);
			o.setOrderNo(orderno);
			
			String ordertype = rs.getString(3);
			o.setOrderType(ordertype);
			
			int personnum = rs.getInt(4);
			o.setPersonNum(personnum);
			
			o.setCashier(rs.getString(5));
			
			o.setCreateTime(rs.getTimestamp(6));
			
			o.setEndTime(rs.getTimestamp(7));
			
			o.setPaymentType(rs.getString(8));
			
			o.setPayment(rs.getDouble(11));
			
			o.setPrintTime(rs.getTimestamp(9));
			
			o.setDoorId(rs.getInt(10));

		}
		
		//6、释放资源
		rs.close();
		st.close();
		conn.close();		

		return o;
	}

	//根据门店id查询门店表讯息，返回门店对象
	private Door getDoor(int doorId) throws SQLException {
		//JDBC的开发，
		//1.注册驱动
		DriverManager.registerDriver(new Driver());
		//2、获取数据库连
		String url="jdbc:mysql:///store_yh";//数据库的 连接地址
		String user="root";
		String password="root";	
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		//3、获取传输器
		Statement st = conn.createStatement();
		
		//4、执行SQL
		String sql="select * from tb_door where id = " + doorId;
		ResultSet rs = st.executeQuery(sql);
		
		//5、遍历结果集(给door赋值)
		Door d = new Door();
		while(rs.next()){
			//获取id值，返回int类型的id值（根据表中的字段来获取不同的get方法
			int id = rs.getInt(1);
			
			//获取第二列的door_name的值
			String doorname = rs.getString(2);
			
			//获取第三列的tel的值
			String tel = rs.getString(3);
			
			//给door对象设置值
			d.setId(id);
			d.setDoorname(doorname);		
			d.setTel(tel);
			
		}
		
		//6、释放资源
		rs.close();
		st.close();
		conn.close();
		
		return d;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
