package com.infinite.springpharma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 

@Controller
public class LoginValidation {

	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public String validating(HttpServletRequest request, HttpServletResponse response)
	{
		String Username = request.getParameter("Username");
		String Idno= request.getParameter("Idno");
		try {
			DataSource datasource = (DataSource) HikariDB.getDataSource();
			Connection con = ((javax.sql.DataSource) datasource).getConnection();
			PreparedStatement pt = con.prepareStatement("select * from Login1 where Username=? and Idno=?;");
			pt.setString(1, Username);
			pt.setString(2, Idno);
			ResultSet x = pt.executeQuery();
			if(x.next())
				return "main";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "unsuccessful";
	}
}