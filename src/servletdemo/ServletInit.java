package servletdemo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInit implements Servlet {
	
	public ServletInit(){
		System.out.println("�����˶���");
	}
	@Override
	public void destroy() {
		// TODO �Զ����ɵķ������
		System.out.println("����");
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO �Զ����ɵķ������
		System.out.println("��ʼ��");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		System.out.println("����");
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public String getServletInfo() {
		// TODO �Զ����ɵķ������
		return null;
	}

}
