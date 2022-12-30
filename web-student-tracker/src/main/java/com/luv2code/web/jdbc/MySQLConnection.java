package com.luv2code.web.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MySQLConnection {
	 public static void main(String[] args) throws ClassNotFoundException {
		    Connection con = null;

		    String url = "jdbc:mysql://localhost:3306/web_student_tracker?useSSL=false";
		    String username = "root";
		    String password = "21092002";

		    try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      con = DriverManager.getConnection(url, username, password);

		      System.out.println("Connected!");

		    } catch (SQLException ex) {
		        throw new Error("Error ", ex);
		    } finally {
		      try {
		        if (con != null) {
		            con.close();
		        }
		      } catch (SQLException ex) {
		          System.out.println(ex.getMessage());
		      }
		    }
		  }
}
