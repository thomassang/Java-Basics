package cn.tedu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.jdbc.Driver;

/**
 * �������������jdbc����
 */
public class TestJDBC {
	
	@Test
	public void test() throws SQLException{
		/**
		 * �������裺
		 * 1��ע������
		 * 2����ȡ���ݿ�����
		 * 3����ȡ������
		 * 4��ִ��sql
		 * 5�����������
		 * 6���ͷ���Դ
		 */
		
		//ע������
		DriverManager.registerDriver(new Driver());
		
		//��ȡ���ݿ�����
		String url="jdbc:mysql:///stor_yh";//���ݿ�� ���ӵ�ַ
		String user="root";
		String password="root";		

		Connection conn = DriverManager.getConnection(url, user, password);
		
		//��ȡ������
		Statement st = conn.createStatement();
		
		//ִ��sql;(��ѯtb_door��������)
		ResultSet rs = st.executeQuery("select * from td_door");
		
		//���������
		while(rs.next()){
			//rs.next()�ж�sqlִ������û������
			String id = rs.getString(1);//��ȡÿһ�еĵ�һ�е�ֵ
			String doorname = rs.getString(2);
			String tel = rs.getString(3);
			
			System.out.println(id+doorname+tel);
			
		}
		
		//�ͷ���Դ
		rs.close();//�ͷŽ������Դ
		st.close();//�ͷŴ�������Դ
		conn.close();//�ͷ����ݿ���Դ
		
	}

}
