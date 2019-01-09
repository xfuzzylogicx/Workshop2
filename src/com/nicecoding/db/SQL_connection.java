package com.nicecoding;

import java.sql.*;

public class SQL_connection
{
    public static Connection getConnection() throws SQLException
    {
        try(
            Connection newConnection = DriverManager.getConnection
                    (
                            "jdbc:mysql://localhost:3306/codingschool?useSSL=false&useJDBCCompilantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                            "root",
                            "coderslab"
                    )
        )
        {
            return newConnection;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

      return null;
    }
}

