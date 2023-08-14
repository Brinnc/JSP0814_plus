/*
�� Ŭ������ ���� ���������� �ؼ� �� ����Ǿ����� Ŭ������
�̷��� Ŭ������ ������, ����(Servlet)�̶� ��
*/
package test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

//���� Ŭ������ ��� ������, �� �������� �� Ŭ������ ������ ��(is a ����)
public class MyServlet extends HttpServlet{ //��Ű���� ���� Ŭ������ �����Ǿ����(public)
	//�� ������ �̿��Ͽ� ���� �̸��� ���������� ����غ�
	
	//Ŭ���̾�Ʈ�� ��û�� get����� ��� doGet() �޼���� ��û�� �޾ƾ���
	//jsp������ request ���尴ü�� �ڷ����� ��� HttpServletRequest����
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//jsp������ page ���ÿ����� ���ڵ�
		response.setContentType("text/html;charset=utf-8"); 
		
		//���� �̸��� ���������� �����Ͽ� ���������� ������
		PrintWriter out=response.getWriter(); //���ڱ�� ��½�Ʈ��

		out.print("My name is �ֽ¾�");
	}
}

