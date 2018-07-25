package cn.tedu.servlet;
/**
 * ����������������ϵͳСƱ��ӡ
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
		
		//��ҳ��׼������
		
		try {
			//�����ŵ�id��ѯ�ŵ����Ϣ
			request.setAttribute("door", getDoor(1));
			//���ݶ���id��ѯ������Ϣ
			request.setAttribute("order", getOrder(1));
			//���ݶ�������id��ѯ��Ϣ
			request.setAttribute("orderdetail", getOrderDetail(1));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//��תҳ��
		request.getRequestDispatcher("/WEB-INF/views/order.jsp")
				.forward(request, response);
		
	}
	
	private List<OrderDetail> getOrderDetail(int orderId) throws SQLException {
		// TODO Auto-generated method stub
		//1.ע������
		DriverManager.registerDriver(new Driver());
		//2����ȡ���ݿ���
		String url="jdbc:mysql:///store_yh";//���ݿ�� ���ӵ�ַ
		String user="root";
		String password="root";	
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		//3����ȡ������
		Statement st = conn.createStatement();
		
		//4��ִ��SQL
		String sql="select * from tb_order_detail where order_id = " + orderId;
		ResultSet rs = st.executeQuery(sql);
		
		//5�����������(��door��ֵ)
		List<OrderDetail> list = new ArrayList<OrderDetail>();
		while(rs.next()){
			//��ȡ�ֶε�ֵ
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
			
			//list������Ų�ѯ�����Ķ������
			list.add(od);
			
		}
		
		//6���ͷ���Դ
		rs.close();
		st.close();
		conn.close();
		
		return list;
	}

	//���ݶ���id��ѯ���������Ϣ�����շ��ض�������
	private Order getOrder(int OrderId) throws SQLException {
		//1��ע������
		DriverManager.registerDriver(new Driver());
		
		//2����ȡ���ݿ���
		String url = "jdbc:mysql:///store_yh";
		String user = "root";
		String password = "root";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		//3����ȡ������
		Statement st = conn.createStatement();
		
		//4��ִ��SQL
		String sql = "select * from tb_order where id = " +OrderId;
		ResultSet rs = st.executeQuery(sql);
		
		//5�����������(��order��ֵ)
		Order o = new Order();//����order���󣬿յ�
		while(rs.next()){
			int id = rs.getInt(1);//��ȡid��ֵ	
			o.setId(id);//����order����idֵ
			
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
		
		//6���ͷ���Դ
		rs.close();
		st.close();
		conn.close();		

		return o;
	}

	//�����ŵ�id��ѯ�ŵ��ѶϢ�������ŵ����
	private Door getDoor(int doorId) throws SQLException {
		//JDBC�Ŀ�����
		//1.ע������
		DriverManager.registerDriver(new Driver());
		//2����ȡ���ݿ���
		String url="jdbc:mysql:///store_yh";//���ݿ�� ���ӵ�ַ
		String user="root";
		String password="root";	
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		//3����ȡ������
		Statement st = conn.createStatement();
		
		//4��ִ��SQL
		String sql="select * from tb_door where id = " + doorId;
		ResultSet rs = st.executeQuery(sql);
		
		//5�����������(��door��ֵ)
		Door d = new Door();
		while(rs.next()){
			//��ȡidֵ������int���͵�idֵ�����ݱ��е��ֶ�����ȡ��ͬ��get����
			int id = rs.getInt(1);
			
			//��ȡ�ڶ��е�door_name��ֵ
			String doorname = rs.getString(2);
			
			//��ȡ�����е�tel��ֵ
			String tel = rs.getString(3);
			
			//��door��������ֵ
			d.setId(id);
			d.setDoorname(doorname);		
			d.setTel(tel);
			
		}
		
		//6���ͷ���Դ
		rs.close();
		st.close();
		conn.close();
		
		return d;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
