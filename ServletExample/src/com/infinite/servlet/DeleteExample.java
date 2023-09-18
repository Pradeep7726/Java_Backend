package com.infinite.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete
 */
public class DeleteExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection on=null;   
    
    public DeleteExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			ServletConfig cg = getServletConfig();
			Class.forName(cg.getInitParameter("mysql"));
			on = DriverManager.getConnection(cg.getInitParameter("mysqlurl"), cg.getInitParameter("mysqlusername"),
					cg.getInitParameter("mysqlpassword"));
			PreparedStatement ps=on.prepareStatement("delete from register where StdId=?;");
			ps.setInt(1,Integer.valueOf(request.getParameter("StdId")));
			ps.executeUpdate();
			out.println("<html><body>");
			out.println("<h3>Student Details<h3>");
			out.println("<table border=1><tr>" + "<td><b>Full Name</b></td>" + "<td><b>Std Id</b></td>"+"<td><b>Age</b></td>"+"<td><b>Branch</b></td>"+"<td><b>E-mail</b></td>");
			//response.sendRedirect("Deleted.html");
			ResultSet rs=ps.executeQuery("select * from register;");
			while(rs.next())
			{
				String name = rs.getString("StdName");
				int stdid = rs.getInt("StdId");
				int Age = rs.getInt("Age");
				String Branch=rs.getString("Branch");
				String EMail=rs.getString("E_mail");

				out.println("<tr>" + "<td>" + name + "</td>" + "<td>" + stdid + "</td>" + "<td>" + Age + "</td>"+ "<td>" + Branch + "</td>" + "<td>" + EMail + "</td>"+"</tr>");
			}
			out.println("</table></body></html>");
			ps.close();
			out.close();
			response.sendRedirect("success.html");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try{
				on.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}
}