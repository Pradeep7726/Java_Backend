package com.infinite.trainweb;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.sql.DataSource;

	 

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.hikaridb.HikariDB; 

	@Controller
	public class Account  {

		@RequestMapping(value="Acc",method=RequestMethod.POST)
		public String validating(HttpServletRequest request, HttpServletResponse response)
		{	
			try {
				DataSource datasource = HikariDB.getDataSource();
				Connection con = datasource.getConnection();
				PreparedStatement ps = con.prepareStatement("insert into Login2 values(?,?,?);");
				ps.setString(1,request.getParameter("Username"));
				ps.setString(2,request.getParameter("Password"));
				ps.setString(3,request.getParameter("Email"));
				int x = ps.executeUpdate();
				if (x!=0) {                          //condition for inserting values into table				 
					return "login";               //redirecting to inserted page
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "invalid";
		}
	}

