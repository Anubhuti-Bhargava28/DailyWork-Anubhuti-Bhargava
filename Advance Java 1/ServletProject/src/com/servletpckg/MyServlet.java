package com.servletpckg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void task2() {
		System.out.println("From task 2");
	}

	public MyServlet() {
		System.out.println("constru");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("from init");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("from service");
		task2();
	}

	@Override
	public void destroy() {
		System.out.println("from destroy");
	}

	public static void main(String[] args) {
		System.out.println("From main");
	}
}
