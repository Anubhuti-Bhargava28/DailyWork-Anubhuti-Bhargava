package com.cts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookiehandler1
 */
@WebServlet("/Cookiehandler1")
public class Cookiehandler1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String creditCardNo = request.getParameter("creditCardNo");
		String password = request.getParameter("pwd");
		Cookie cookie = new Cookie(creditCardNo, password);
		cookie.setMaxAge(24 * 365 * 7);
		response.addCookie(cookie);
		RequestDispatcher rd = request.getRequestDispatcher("/CookieHandler2");
		rd.forward(request, response);
	}

}
