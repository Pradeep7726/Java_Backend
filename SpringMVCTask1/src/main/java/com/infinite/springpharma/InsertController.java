package com.infinite.springpharma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class InsertController {

	Connection con = null;
	PreparedStatement ps = null;
	@RequestMapping("/insert")
	public String insertrecord(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			DataSource datasource=HikariDB.getDataSource();
			con=datasource.getConnection();
			ps =con.prepareStatement("insert into pharma values(?,?,?,?,?);");
			ps.setString(1, request.getParameter("Medicine"));
			ps.setString(2, request.getParameter("ExpiryDate"));
			ps.setInt(3,Integer.valueOf(request.getParameter("Cost")));
			ps.setInt(4,Integer.valueOf(request.getParameter("Quantity")));
			ps.setInt(5,Integer.valueOf(request.getParameter("Codeno")));

			int status=ps.executeUpdate();
			if(status==1)
			{
				return "inserted";
			}
			else
			{
				return "unsuccessful";
			}
		}
		catch(SQLException e1)// handle any sql -related exceptions
		{
			System.out.println(e1);
		}
		catch(Exception e)// handle any sql -related exceptions
		{
			System.out.println(e);
		}
		return "unsuccessful";
	}
}

/*
String Medicine=request.getParameter("Medicine");
String ExpiryDate=request.getParameter("ExpiryDate");
Int Cost=request.getParameter("Cost");
Int Quantity=request.getParameter("Quantity");
Int Costno =request.getParameter("Costno");
try{
	DataSource dataSoure=HikariDB.getDataSource();
	connection=dataSource.getConnection();
	ps=connection.prepareStatement("insert into values pharma values(?,?,?,?,?)");
	ps.setString(1,Medicine);
	ps.setString(2,ExpiryDate);
	ps.setInt(3,Cost);
	ps.setInt(4,Quantity);
	ps.setInt(5,Costno);
	
	int a=ps.executeUpdate());	
	
}*/
