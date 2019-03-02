package com.guilin.realestate.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * LogFilter在请求过来的时候处理日志，代表请求已经过来了
 */

public class LogFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(LogFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //容器启动时启动
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //方法拦截时执行
        logger.info("Request--coming");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        //容器销毁时执行
    }
}
