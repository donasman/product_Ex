package com.study.product.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.study.product.dto.UserDto;
import com.study.product.utils.RequestUtil;
import com.study.product.utils.ResponseEntity;


@WebServlet("/auth/signin")
public class SignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SignServlet() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDto dbUser = (UserDto) request.getServletContext().getAttribute("dbUser");
		UserDto signInUserDto = RequestUtil.convertJsonData(request, UserDto.class);
		
		boolean isMatchUserName = Objects.equals(dbUser.getUsername(), signInUserDto.getUsername());
		boolean isMatchUserPassword = Objects.equals(dbUser.getPassword(), signInUserDto.getPassword());
		
		if(!(isMatchUserName && isMatchUserPassword)) { //잘못된 정보 나오면 if걸림
			Map<String, String> errorMap = new HashMap<>();
			errorMap.put("errorMessage", "사용자 정보를 다시 입력하세요.");
			ResponseEntity.ofJson(response, 403, errorMap);
			return;
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("principalUser", dbUser);
		
		ResponseEntity.ofJson(response, 200, dbUser);
	}

}
