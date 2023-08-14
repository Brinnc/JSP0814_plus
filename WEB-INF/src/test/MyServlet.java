/*
이 클래스는 오직 서버에서만 해석 및 실행되어지는 클래스임
이러한 클래스를 가리켜, 서블릿(Servlet)이라 함
*/
package test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

//서블릿 클래스를 상속 받으면, 이 시점부터 본 클래스는 서블릿이 됨(is a 관계)
public class MyServlet extends HttpServlet{ //패키지에 넣은 클래스는 공개되어야함(public)
	//이 서블릿을 이용하여 나의 이름을 웹브라우저에 출력해봄
	
	//클라이언트의 요청이 get방식일 경우 doGet() 메서드로 요청을 받아야함
	//jsp에서의 request 내장객체의 자료형은 사실 HttpServletRequest형임
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//jsp에서의 page 지시영역의 인코딩
		response.setContentType("text/html;charset=utf-8"); 
		
		//나의 이름을 응답정보로 구성하여 웹브라우저에 전송함
		PrintWriter out=response.getWriter(); //문자기반 출력스트림

		out.print("My name is 최승아");
	}
}

