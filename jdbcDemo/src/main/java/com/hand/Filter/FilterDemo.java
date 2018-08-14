package com.hand.Filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author shuai.wang02@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/7/19 09:07
 */
public class FilterDemo implements Filter {

    public FilterDemo() {
        System.out.println("=========Filter构造函数===========");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("=========Filter Init===========");

        String initParam = filterConfig.getInitParameter("param");

        System.out.println("param = " + initParam);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("================doFilter过滤器开始==============");
        System.out.println("=========Filter DoFilter===========");
        System.out.println("================doFilter过滤器结束==============");
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {
        System.out.println("=========Filter Destroy===========");
    }
}
