package com.st.afw.webapi.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by bobo on 2018/3/18.
 *
 * @email ruantianbo@163.com
 */
@WebFilter(filterName="accessFilter",urlPatterns = "/*")
@Order(1)
public class AccessFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.debug("AccessFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        logger.debug("access ------> " + httpServletRequest.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        logger.debug("AccessFilter destroy");
    }
}
