package com.hand.servlet;


import com.hand.dto.AdminDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DeleteServlet extends HttpServlet{  //删除数据

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String idStr = req.getParameter("id");  //删除数据的ID，根据ID删除
        if(idStr != null && !idStr.equals("")){
            int id = Integer.valueOf(idStr);
            AdminDao dao = new AdminDao();
            dao.deleteAdmin(id);
        }
        req.getRequestDispatcher("ShowServlet").forward(req, resp);
    }



}