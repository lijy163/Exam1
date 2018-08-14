package com.hand.dto;

import com.hand.pojo.addpojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDao {
    public List<addpojo> getAllAdmin(){  //查询所有信息
        List<addpojo> list = new ArrayList<addpojo>();  //创建集合
        Connection conn = JdbcDemo.getConnection();
        String sql  = "select f.film_id,f.title,f.description,l.language from film f ,language l where f.last_update = l.last_update";  //SQL查询语句
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                addpojo add = new addpojo();
                add.setFilm_id(rst.getString("film_id"));
                add.setTitle(rst.getString("title"));
                add.setDescription(rst.getString("description"));
                add.setLanguage(rst.getString("language"));
                list.add(add);
            }
            for ( addpojo add:list) {
                System.out.println(add);
            }
            rst.close();  //关闭
            pst.close();  //关闭
        } catch (SQLException e) {
            e.printStackTrace();  //抛出异常
        }
        return list;  //返回一个集合
    }

    public boolean addAdmin(Admin admin){  //添加信息
        String sql = "INSERT INTO `admin`(`id`,`username`,`userpwd`) VALUES (?,?,?)";  //添加的SQL语句
        Connection conn = JdbcDemo.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, admin.getId());
            pst.setString(2, admin.getUsername());
            pst.setString(3, admin.getUserpwd());
            int count = pst.executeUpdate();
            pst.close();
            return count>0?true:false;  //是否添加的判断
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateAdmin(Admin admin){  //修改
        String sql = "UPDATE `admin` SET `username`=?,`userpwd`=? WHERE `id` = ?";  //修改的SQL语句，根据ID修改
        Connection conn = JdbcDemo.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, admin.getUsername());
            pst.setString(2, admin.getUserpwd());
            pst.setInt(3, admin.getId());  //根据的ID
            int count = pst.executeUpdate();
            pst.close();  //关闭
            return count>0?true:false;  //是否修改的判断
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteAdmin(int id){  //删除
        String sql = "delete from admin where id = ?";  //删除的SQL语句，根据ID删除
        Connection conn = JdbcDemo.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            int count = pst.executeUpdate();
            pst.close();
            return count>0?true:false;  //是否删除的判断
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Admin selectAdminById(int id){  //根据ID进行查询
        Connection conn = JdbcDemo.getConnection();
        String sql  = "select * from admin where id = "+id;
        Admin admin = null;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                admin = new Admin();
                admin.setId(rst.getInt("id"));
                admin.setUsername(rst.getString("username"));
                admin.setUserpwd(rst.getString("userpwd"));
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;  //返回
    }
}