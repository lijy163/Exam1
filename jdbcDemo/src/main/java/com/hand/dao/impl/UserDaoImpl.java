package com.hand.dao.impl;

import com.hand.dao.UserDao;
import com.hand.dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author shuai.wang02@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/7/18 16:35
 */
public class UserDaoImpl implements UserDao {
    /**
     * 保存用户信息
     */
    @Override
    public void save(Connection conn, User user) throws SQLException {
        PreparedStatement ps =
                conn.prepareCall("INSERT INTO tbl_user(name,password,email)VALUE (?,?,?)");
        ps.setString(1, user.getName());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getEmail());
        ps.execute();
    }

    /**
     * 更新用户信息
     */
    @Override
    public void update(Connection conn, Long id, User user) throws SQLException {

        PreparedStatement ps =
                conn.prepareCall("UPDATE  tbl_user SET name = ?,password = ?,email = ? WHENEVER  id = ?");

        ps.setString(1, user.getName());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getEmail());
        ps.setLong(4, id);
        ps.execute();
    }

    /**
     * 删除用户信息
     */
    @Override
    public void delete(Connection conn, User user) throws SQLException {
        PreparedStatement ps = conn.prepareCall("DELETE FROM tbl_user WHERE id = ?");
        ps.setLong(1, user.getId());
        ps.execute();
    }

    @Override
    public void select(Connection conn, String usename) throws SQLException {
        PreparedStatement ps =
                conn.prepareCall("select first_name from customer");
        ps.execute();
    }
}
