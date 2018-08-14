package com.hand.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author shuai.wang02@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/7/18 10:49
 */
public class JdbcDemo {

    public static Connection getConnection() {
        //当前数据库链接
        Connection conn = null;
        // Statement 对象用于将 SQL 语句发送到数据库中
        Statement st = null;
        //结果集
        ResultSet rs = null;

        try {
            //注册jdbc驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //获取mysql的数据库链接
            conn = DriverManager.getConnection("jdbc:mysql://118.25.133.206:3306/sakila", "root", "123456");
            //使用Connection的createStatement()方法创建Statement 对象用于将 SQL 语句发送到数据库中
            st = conn.createStatement();
            /*
             *  使用结果集接收Statement的executeQuery方法返回的结果集
             *
             *  executeQuery、executeUpdate 和 execute
             *
             *  executeQuery 用于产生单个结果集的语句，例如 SELECT 语句。
             *
             *  executeUpdate 用于执行 INSERT、UPDATE 或 DELETE 语句以及 SQL DDL（数据定义语言）语句，例如 CREATE TABLE 和 DROP TABLE。INSERT、UPDATE 或 DELETE 语句的效果是修改表中零行或多行中的一列或多列
             *
             *  execute 用于执行返回多个结果集、多个更新计数或二者组合的语句
             * */


        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
