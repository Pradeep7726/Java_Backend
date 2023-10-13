package com.infinite.web;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 

@Controller
public class LoginRegist {
	private static final Logger logger = Logger.getLogger(LoginRegist.class);
	
	@RequestMapping(value="/acc",method=RequestMethod.POST)
	public String create(){
		return "welcome";
	}

	@RequestMapping(value="/loginval",method=RequestMethod.POST) 
	public String validating(HttpServletRequest request, HttpServletResponse response)
	{
		String name = request.getParameter("name");
		String password= request.getParameter("password");
		try {                                                        //it will throw an exception
			DataSource datasource = HikariDB.getDataSource();
			Connection con = datasource.getConnection();        //
			PreparedStatement pt = con.prepareStatement("select name,password from register2 where name=? and password=?");
			pt.setString(1, name);
			pt.setString(2, password);
			ResultSet rs = pt.executeQuery();
			while (rs.next()) {
				if (rs.getString(1).equals(name)) {          
					logger.info("e");
					if (rs.getString(2).equals(password)) {
						return "homee";                           //it will redirect to welcome page
					} else {
						System.out.println("not good1");
						return "invalid";
					}
				} else {
					System.out.println("not good2");
					return "invalid";								//it will redirect to invalid page

				}
			}
		}catch (Exception e) {   //handle any sql -related exceptions
		e.printStackTrace();
		}
		logger.info("not good");
		return "invalid";
		
	}
}

