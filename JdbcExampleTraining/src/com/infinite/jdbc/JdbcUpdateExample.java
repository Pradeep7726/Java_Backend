package com.infinite.jdbc;
//update row in table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author pradeepl
 *
 */
public class JdbcUpdateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//step1 loading the driver
			Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//Establishing connection
			Statement stmt=on.createStatement();//creating stmt
			stmt.executeUpdate("update employee set idnumber=899 where fullname='pradeep'");
			System.out.println("update row from employee table");
			on.close();
		}
		catch (SQLException e1)
		{
			
			System.out.println(e1);
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}