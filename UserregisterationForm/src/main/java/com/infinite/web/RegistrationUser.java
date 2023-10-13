package com.infinite.web;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 

@Controller
public class  RegistrationUser {
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String validating(HttpServletRequest request, HttpServletResponse response)
	{	
		try {
			DataSource datasource = HikariDB.getDataSource();
			Connection con = datasource.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into register2 values(?,?,?,?,?,?,?,?);");
			System.out.println("gf");
			ps.setString(1,request.getParameter("name"));
			ps.setString(2,request.getParameter("email"));
			ps.setString(3,request.getParameter("password"));
			ps.setString(4,request.getParameter("date"));
			ps.setString(5,request.getParameter("gender"));
			ps.setString(6,request.getParameter("profession"));
			ps.setString(7,request.getParameter("married"));
			ps.setString(8,request.getParameter("note"));
			
			int x = ps.executeUpdate();
			if (x!=0) {                          //condition for inserting values into table				 
				return "welcome";               //redirecting to inserted page
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "invalid";
	}
}