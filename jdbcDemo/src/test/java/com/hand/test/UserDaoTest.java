package com.hand.test;

import com.hand.dao.UserDao;
import com.hand.dao.impl.UserDaoImpl;
import com.hand.dto.User;
import com.hand.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author shuai.wang02@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/7/18 17:01
 */
public class UserDaoTest {
    public static void main(String[] args) {

        Connection conn = null;
        try {
            conn = ConnectionFactory.getInstance().makeConnection();
            conn.setAutoCommit(false);
            UserDao userDao = new UserDaoImpl();
            User tom = new User();
            tom.setEmail("wangshuai@hand.com");
            tom.setName("liyuhao");
            tom.setPassword("liyugao");

            userDao.save(conn,tom);

            conn.commit();
        } catch (SQLException e) {

            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }
}
