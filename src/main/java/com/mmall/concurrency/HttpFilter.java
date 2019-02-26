package com.mmall.concurrency;

import com.mmall.concurrency.example.threadLocal.RequestHolder;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.LogRecord;

@Slf4j
public class HttpFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;

        log.info("do filter ,{},{}",Thread.currentThread().getId(),request.getServletPath());
        RequestHolder.add(Thread.currentThread().getId());
        chain.doFilter(servletRequest,response);
    }

    @Override
    public void destroy() {

    }
}
