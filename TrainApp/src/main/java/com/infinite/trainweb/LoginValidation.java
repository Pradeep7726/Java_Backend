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
public class LoginValidation {

	@RequestMapping(value="/LoginValid",method=RequestMethod.POST)
	public String validating(HttpServletRequest request, HttpServletResponse response)
	{
		String Username = request.getParameter("Username");
		String Password= request.getParameter("Password");
		try {
			DataSource datasource = HikariDB.getDataSource();
			Connection con = datasource.getConnection();
			PreparedStatement pt = con.prepareStatement("select * from Login2 where Username=? and Password=?");
			pt.setString(1, Username);
			pt.setString(2, Password);
			ResultSet rs = pt.executeQuery();
			while (rs.next()) {
				if (rs.getString(1).equals(Username)) {
					System.out.print("e");
					if (rs.getString(2).equals(Password)) {
						return "home";
					} else {
						return "invalid";
					}
				} else {
					return "invalid";
				}
			}
		}catch (Exception e) {
		e.printStackTrace();
		}
		return "invalid";
	}
}
