package com.anbow.carmanage.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//普通连接
public class ConnectionUtil {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ambow";
            String username = "root";
            String password = "root";
            conn = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
    public static Connection getDruidConnection() {
        Connection conn = null;

        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("com/anbow/carmanage/properties/Druid.properties"));
            DataSource ds = DruidDataSourceFactory.createDataSource(prop);
            conn = ds.getConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return conn;
    }
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            conn.close();
            ps.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void close(Connection conn, PreparedStatement ps) {
        try {
            conn.close();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
