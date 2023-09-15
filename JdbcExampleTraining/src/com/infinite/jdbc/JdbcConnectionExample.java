package com.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author pradeepl
 *
 */
public class JdbcConnectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection on=null;
		try {
			Class.forName(args[0]);//step1 loading the driver
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//Establishing connection
			System.out.println("Connection established");
			Statement stmt=on.createStatement();//creating stmt
			ResultSet st =stmt.executeQuery("select * from employee");
			while(st.next())
			{
				System.out.print(st.getString(1)+" ");
				System.out.print(st.getInt(2)+" ");
				System.out.println(st.getString(3)+" ");
				
			}
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
