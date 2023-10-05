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

@Controller
public class DeleteController {
	Connection con = null;
	PreparedStatement ps = null;
	@RequestMapping("/delete")
	public String insertrecord(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			DataSource datasource=HikariDB.getDataSource();
			con=datasource.getConnection();
			ps =con.prepareStatement("delete from pharma where Codeno=?;");
			ps.setInt(1,Integer.valueOf(request.getParameter("Codeno")));
			int status=ps.executeUpdate();
			if(status==1)
			{
				return "delete1";
			}
			else
			{
				return "unsuccessful";
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		return "unsuccessful";
	}
}




