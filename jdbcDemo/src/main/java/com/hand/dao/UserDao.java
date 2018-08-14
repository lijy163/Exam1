package com.hand.dao;

import com.hand.dto.User;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author shuai.wang02@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/7/18 16:31
 */
public interface UserDao {

    public void save(Connection conn , User user)throws SQLException;
    public void update(Connection conn , Long id ,User user)throws SQLException;
    public void delete(Connection conn , User user)throws SQLException;
    public void select(Connection conn , String usename)throws SQLException;

}
