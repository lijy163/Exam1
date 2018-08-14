package com.hand.dto;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminDao2 {

    public List selectAdminById(){

        Connection conn = JdbcDemo.getConnection();
        String sql  = "select first_name from customer";
        List<String> list = null;
        try {
            System.out.println("d4d");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            list = new ArrayList<String>();
            while (rs.next()) {
                list.add(rs.getString("first_name"));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;  //返回
    }

}
