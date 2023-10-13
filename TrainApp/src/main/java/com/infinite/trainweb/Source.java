package com.infinite.trainweb;
import java.io.IOException;
import java.io.PrintWriter;
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

import com.infinite.hikaridb.HikariDB;
@Controller
public class Source  {
	@RequestMapping(value = "/src", method = RequestMethod.POST)
	public String reg(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			DataSource datasource = HikariDB.getDataSource();
			con = datasource.getConnection();
			ps = con.prepareStatement("select * from train1 where source=? and destination=?");
			ps.setString(1,source);
			ps.setString(2,destination);
			out.println("<html><body>");
			out.println("<h3>Train Details<h3>");
			out.println("<table border=1>"
					+ "<tr>"+ "<td><b>"+"trainno"+"</b></td>"+ "<td><b>"+"trainname"+"</b></td>"+ "<td><b>"+"source"+"</b></td>"+"<td><b>"+"destination"+"</b></td>"+"<td><b>"+"arrivaltime"+"</b></td>"+"<td><b>"+"destinationtime"+"</b></td>"+"</tr>");
			rs = ps.executeQuery();
			while(rs.next()){
				//out.println(rs.getInt(1)+"<br>"+rs.getString(2)+"<br>"+rs.getString(3));
				out.println("<tr>"+"<td>" + rs.getInt(1) + "</td>"+"<td>" + rs.getString(2) + "</td>"+"<td>" + rs.getString(3) + "</td>"+"<td>" + rs.getString(4) + "</td>"+"<td>" + rs.getString(5) + "</td>"+"<td>" + rs.getString(6) + "</td>"+"</tr>" );
				//i++;
				//+"<td>" + rs.getString(2) + "</td>" +"<td>" + rs.getInt(3) + "</td>"+"<td>" + rs.getInt(4) + "</td>" +"<td>" + rs.getInt(5) + "</td>" 
			}
			out.println("</body></html>");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				// con.rollback();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}