package com.infinite.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Example1 {
	Connection con = null;

	// this method maps to the root url("/") and returns the "index" view.
	@RequestMapping("/")
		public String display(){
			return "index";
		}

	// this method maps to the "/login" url and handles the login logic
	@RequestMapping("/login")
			public String login(HttpServletRequest request,HttpServletResponse response){
			try{
				//loading the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Establishing connection  getConnection is a method in java which will give instance or obj of connection  
				//driverManager is a class in which u  have method getConnection which is the static method.
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");
				String user=request.getParameter("username");//retrive the username and password from the http request
				String pass=request.getParameter("password");
				PreparedStatement ps=con.prepareStatement("select * from login where username=?");//selecting user data based on username
				ps.setString(1, user);
				ResultSet rs=ps.executeQuery();//execute the query and retrieve the results
				//checking if a matching username and password were found
				while(rs.next()){   
				if(rs.getString(1).equals(user)){
					if(rs.getString(2).equals(pass)){
						//if the username and password match,return "login1" view.
						return "login1";
					}
					else{
						//if the password does not match,return "invalid" view
						return "invalid";
					}
				}
					else{
						//if the username does not match,return "invalid" view
						return "invalid";
					}
				}
			}
			catch(SQLException e){
				//handle any sql -related exceptions
				System.out.println(e);
			}
			catch(Exception e1)
			{
				//handles other exceptions
				System.out.println(e1);
			}
			finally
			{
				try//it will throw an exception
				{
					//close the database connection in the finally block
					con.close();
				}
				
				catch(SQLException e2)//it will catch the exception
				{
					System.out.println(e2);
				}
			}
			//if no match or an exception occurred return "invalid" view.
			return "invalid";
	}
}
