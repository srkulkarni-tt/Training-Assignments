package com.thinkitive;

import java.sql.*;

public class DatabaseValidation {
	public static boolean validateUser(String username, String password) {
		boolean flag = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Establish Connection with 'Employee' database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "root");

			PreparedStatement ps = con.prepareStatement("select * from Users where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			flag = rs.next();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
	}

	public static boolean registerUser(String username, String password) {
		boolean flag = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "root");

			PreparedStatement ps = con.prepareStatement("insert into Users values(?,?)");
			ps.setString(1, username);
			ps.setString(2, password);

			ps.executeUpdate();

			if (DatabaseValidation.validateUser(username, password)) {
				flag = true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
	}
}
