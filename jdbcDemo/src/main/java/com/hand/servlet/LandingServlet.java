package com.hand.servlet;



import com.hand.dto.AdminDao2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


public class LandingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        AdminDao2 dao = new AdminDao2();
        String username = req.getParameter("username");
        ArrayList<String> list = (ArrayList<String>) dao.selectAdminById();
        int t = 0;
        for (String str:list) {
            if(str.equals(username)){
                t = 1;
                break;
            }
        }
        System.out.println("zz");
        if(t == 1){
            String login_suc = "display.jsp";
            resp.sendRedirect(login_suc);

            return;
        }else{
            String login_fail = "fail.jsp";
            resp.sendRedirect(login_fail);
            return;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doGet(req,resp);
    }
}