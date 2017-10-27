package servletdemo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInit implements Servlet {
	
	public ServletInit(){
		System.out.println("构造了对象");
	}
	@Override
	public void destroy() {
		// TODO 自动生成的方法存根
		System.out.println("销毁");
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO 自动生成的方法存根
		System.out.println("初始化");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		System.out.println("服务");
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public String getServletInfo() {
		// TODO 自动生成的方法存根
		return null;
	}

}
