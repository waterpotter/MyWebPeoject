package com.power.using.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo3 implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FilterDemo3前");
		//对请求进行拦截,写在放行前
		//request的操作
		chain.doFilter(request, response);//放行
		//对响应进行拦截,写在放行后
		System.out.println("FilterDemo3后");
		//response的操作
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

}
