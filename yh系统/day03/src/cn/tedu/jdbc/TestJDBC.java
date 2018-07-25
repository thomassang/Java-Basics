package cn.tedu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.jdbc.Driver;

/**
 * 这个类用来测试jdbc程序
 */
public class TestJDBC {
	
	@Test
	public void test() throws SQLException{
		/**
		 * 开发步骤：
		 * 1、注册驱动
		 * 2、获取数据库连接
		 * 3、获取传输器
		 * 4、执行sql
		 * 5、遍历结果集
		 * 6、释放资源
		 */
		
		//注册驱动
		DriverManager.registerDriver(new Driver());
		
		//获取数据库连接
		String url="jdbc:mysql:///stor_yh";//数据库的 连接地址
		String user="root";
		String password="root";		

		Connection conn = DriverManager.getConnection(url, user, password);
		
		//获取传输器
		Statement st = conn.createStatement();
		
		//执行sql;(查询tb_door所有数据)
		ResultSet rs = st.executeQuery("select * from td_door");
		
		//遍历结果集
		while(rs.next()){
			//rs.next()判断sql执行完有没有数据
			String id = rs.getString(1);//获取每一行的第一列的值
			String doorname = rs.getString(2);
			String tel = rs.getString(3);
			
			System.out.println(id+doorname+tel);
			
		}
		
		//释放资源
		rs.close();//释放结果集资源
		st.close();//释放传输器资源
		conn.close();//释放数据库资源
		
	}

}
