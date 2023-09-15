package com.infinite.lob;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BlobInputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection on = null;
	
		Scanner s = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");// step1 loading the driver
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");// Establishing
																											// connection
			System.out.println("connection established to database");
			PreparedStatement ps=on.prepareStatement("insert into imgtable values(?,?)");  
			ps.setString(1,"sonoo");  

			FileInputStream fin=new FileInputStream("D:\\images\\inputs.png");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");
		}
			catch (SQLException e1)
			{
				
				System.out.println(e1);
			}
			catch (Exception e)
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
