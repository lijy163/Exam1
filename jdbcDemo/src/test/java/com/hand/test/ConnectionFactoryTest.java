package com.hand.test;

import com.hand.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;

/**
 * @author shuai.wang02@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/7/18 15:54
 */
public class ConnectionFactoryTest {
    public static void main(String[] args) throws SQLException {
        //初始化ConnectionFactory类 读取配置
        ConnectionFactory cf = ConnectionFactory.getInstance();
        //获取一个数据库连接
        Connection conn = cf.makeConnection();

        System.out.println(conn.getAutoCommit());
    }
}
