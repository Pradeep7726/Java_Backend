package com.infinite.jdbc;

//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.IOException;
//insert rows in table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.infinite.security.JavaSecurity;

public class JdbcInsertExample {
	private static final Logger logger = Logger.getLogger(JdbcInsertExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection on = null;
		FileReader fr = null;
		Properties pr = null;
		PropertyConfigurator.configure("log4j.properties");
		Scanner s = new Scanner(System.in);
		try {
			fr = new FileReader("mysqldb.properties");
			pr = new Properties();
			pr.load(fr);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {

			Class.forName(pr.getProperty("drivername"));
		}
		// step1 loading the driver
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {

			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training",
					JavaSecurity.decrypt(pr.getProperty("username"), "bcd1243$"),
					JavaSecurity.decrypt(pr.getProperty("password"), "prdp123"));// Establishing
																					// connection
			logger.info("connection established");
			PreparedStatement ps = on.prepareStatement("insert into company values(?,?,?,?,?)");

			logger.info("enter companyname");
			ps.setString(1, s.next());

			logger.info("enter address");
			ps.setString(2, s.next());

			logger.info("enter country");
			ps.setString(3, s.next());

			logger.info("enter No_of_employees");
			ps.setInt(4, s.nextInt());

			logger.info("enter status");
			ps.setString(5, s.next());

			int status = ps.executeUpdate();// return 1
			if (status == 1)
				logger.info("record insert successfully");
			else
				logger.info("record failed");
		}

		catch (SQLException e1) {

			logger.error(e1);
		}
		/*
		 * catch (ClassNotFoundException e) {
		 * 
		 * logger.info(e); } catch (FileNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } catch (IOException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		finally {
			try {
				on.close();
				s.close();
			} catch (Exception e) {
				logger.error(e);
			}
		}
	}

}