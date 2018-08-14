package com.hand.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author shuai.wang02@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/7/18 18:40
 */
public class HelloWorld extends HttpServlet {



    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("===========init whth patameters=========");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("===========init whth patameters=========");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===========doGet=========");
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===========doPost=========");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===========service=========");

        PrintWriter pw = resp.getWriter();
        pw.println("HelloWorld");
        pw.close();
    }


    @Override
    public void destroy() {
        System.out.println("===========destroy=========");
    }
}
