package com.study.product.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/signup")
public class SignUpPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SignUpPage() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext application = request.getServletContext();
		application.setAttribute("key4", "value1");
		application.setAttribute("key2", "value2");
		application.setAttribute("key3", "value3"); // 서버가 켜지고 꺼질때 까지 유지
		
		request.setAttribute("key1", "value4"); // 요청이 오고 응답이 가면 사라짐
		request.setAttribute("key5", "value5");
		request.setAttribute("key6", "value6");
		
		HttpSession session = request.getSession();
		
		session.setMaxInactiveInterval(1000 * 60 * 10);
		
		session.setAttribute("key4", "value7");
		session.setAttribute("key8", "value8");
		session.setAttribute("key9", "value9");
		
		request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
		
	}



}
