package com.infinite.jdbc;

//insert rows in table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author pradeepl
 *
 */
public class JdbcInsertExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection on = null;
		Scanner s = new Scanner(System.in);
		try {
			Class.forName(args[0]);// step1 loading the driver
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");// Establishing
																											// connection
			System.out.println("connection established");
			PreparedStatement ps = on.prepareStatement("insert into employee values(?,?,?)");

			System.out.println("enter fullname");
			ps.setString(1, s.next());

			System.out.println("enter idno");
			ps.setInt(2, s.nextInt());

			System.out.println("enter departmentname");
			ps.setString(3, s.next());
			int status = ps.executeUpdate();// return 1
			if (status == 1)
				System.out.println("record insert successfully");
			else
				System.out.println("record failed");
			ResultSet st = ps.executeQuery("select * from employee");
			while (st.next()) {
				System.out.print(st.getString(1) + " ");

				System.out.print(st.getInt(2) + " ");
				System.out.println(st.getString(3) + " ");

			}

		} catch (SQLException e1) {

			System.out.println(e1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} finally {
			try {
				on.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}