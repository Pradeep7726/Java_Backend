package com.infinite.jdbc;
//delete row from employee table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author pradeepl
 *
 */
public class JdbcDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection on=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//step1 loading the driver
			on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//Establishing connection
			Statement stmt=on.createStatement();//creating stmt
			stmt.executeUpdate("Delete from employee where idnumber=222");
			System.out.println("deleted row from employee table");
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
		finally
		{
			try
			{
			on.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}