package com.webproject.view;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {
    private DBUtil() {}

    public static DataSource getDataSource() {
        return initDataSource();
    }

    private static DataSource initDataSource() {
        try {
            InitialContext ic = new InitialContext();
            return (DataSource) ic.lookup("java:comp/env/jdbc/web4");
        } catch (NamingException e) {
            e.printStackTrace();
            System.out.println("Pool connection exception");
            return null;
        }
    }

}