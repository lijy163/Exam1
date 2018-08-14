package com.hand.servlet;


import com.hand.dto.Admin;
import com.hand.dto.AdminDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddServlet extends HttpServlet{  //添加数据
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String username = req.getParameter("username");
        String userpwd = req.getParameter("userpwd");
        Admin admin = new Admin();
        admin.setUsername(new String(username.getBytes("ISO-8859-1"),"UTF-8"));  //转值，中文需要转换为utf-8
        admin.setUserpwd(new String(userpwd.getBytes("ISO-8859-1"),"UTF-8"));
        AdminDao dao = new AdminDao();
        dao.addAdmin(admin);
        req.getRequestDispatcher("ShowServlet").forward(req, resp);
    }
}