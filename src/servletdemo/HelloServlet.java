package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		System.out.println("get ����");//���������������
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		//ͨ��out������html
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>һ������������<h1>");
		out.println("</body>");
		out.println("</html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		System.out.println("post ����");
	}

}
