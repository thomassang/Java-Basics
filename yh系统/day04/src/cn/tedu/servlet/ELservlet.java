package cn.tedu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.tedu.pojo.Door;


@WebServlet("/ELservlet")
public class ELservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ELservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//想要页面通过el表达式来取值
		//servlet需要准备数据，el才可以获取到准备的值
//		request.setAttribute("doorname", "永和大王");
		//准备第二条数据
//		request.setAttribute("tel", "666666");
		
		//完成el表达式的简单对象传递
		//在 servlet中给页面准备数据--》Door对象
		//在jsp中，通过el表达式来获取对象的数据
		Door d = new Door();//声明door对象，此时是一个空对象
		
		//需要设置值
		d.setId(10);//设置door对象的id值
		d.setDoorname("永和大王一店");//设置door对象的门店名称
		d.setTel("010-66668888");//设置door对象的电话
		
		//给页面准备door的数据,把door对象准备好了
		request.setAttribute("dd", d);
		
		
		//跳转页面
		request.getRequestDispatcher("/WEB-INF/eltest.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
