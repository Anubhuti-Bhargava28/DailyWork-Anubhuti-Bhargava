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
public class SecondFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("From init of Second filter");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("From doFilter of Second filter");

		System.out.println("request pre processing logic---from SF");
		chain.doFilter(request, response);
		System.out.println("request post processing logic--from SF");

	}

	public void destroy() {
	}

}
