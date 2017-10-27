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
		// TODO 自动生成的方法存根
		System.out.println("get 请求");//获得向浏览器输出流
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		//通过out流生成html
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>一二三四五六七<h1>");
		out.println("</body>");
		out.println("</html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		System.out.println("post 请求");
	}

}
