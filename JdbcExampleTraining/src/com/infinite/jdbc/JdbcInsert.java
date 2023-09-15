package com.infinite.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author pradeepl
 *
 */
public class JdbcInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection on =null;
		try {
			Class.forName(args[0]);//step1 loading the driver
			on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//Establishing connection
			Statement stmt=on.createStatement();//creating stmt
			//stmt.executeUpdate("insert into employee(idnumber='223',fullname='kanna',departmentname='civil')");
			
			Scanner s= new Scanner(System.in);
			System.out.println("enter fullname");
			String fullname =s.nextLine();
			
			System.out.println("enter id");
			int idnumber =s.nextInt();
			
			System.out.println("enter departmentname");
			String departmentname =s.next();
			
			System.out.println("insert row from employee table");
			s.close();
			stmt.executeUpdate("Insert into employee values('"+(fullname)+"',"+(idnumber)+",'"+(departmentname)+"')");
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

