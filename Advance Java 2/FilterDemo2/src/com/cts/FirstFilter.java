package com.cts;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;

@WebFilter("/RequestHandlerServlet")
public class FirstFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("From init of First filter");
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	if(request.getParameter("un").equals("Anubhuti")) {
		chain.doFilter(request, response);
	}
	else {
		response.getWriter().write("<h1>Invalid User</h1>");
	}
	}

	public void destroy() {
	}

}
