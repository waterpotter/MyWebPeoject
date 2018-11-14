package com.power.using.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo2 implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FilterDemo2前");
		//对请求进行拦截,写在放行前
		chain.doFilter(request, response);//放行
		//对响应进行拦截,写在放行后
		System.out.println("FilterDemo2后");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	

}
