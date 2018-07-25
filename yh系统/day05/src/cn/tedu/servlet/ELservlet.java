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
		
		//��Ҫҳ��ͨ��el���ʽ��ȡֵ
		//servlet��Ҫ׼�����ݣ�el�ſ��Ի�ȡ��׼����ֵ
//		request.setAttribute("doorname", "���ʹ���");
		//׼���ڶ�������
//		request.setAttribute("tel", "666666");
		
		//���el���ʽ�ļ򵥶��󴫵�
		//�� servlet�и�ҳ��׼������--��Door����
		//��jsp�У�ͨ��el���ʽ����ȡ���������
		Door d = new Door();//����door���󣬴�ʱ��һ���ն���
		
		//��Ҫ����ֵ
		d.setId(10);//����door�����idֵ
		d.setDoorname("���ʹ���һ��");//����door������ŵ�����
		d.setTel("010-66668888");//����door����ĵ绰
		
		//��ҳ��׼��door������,��door����׼������
		request.setAttribute("dd", d);
		
		
		//��תҳ��
		request.getRequestDispatcher("/WEB-INF/eltest.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
