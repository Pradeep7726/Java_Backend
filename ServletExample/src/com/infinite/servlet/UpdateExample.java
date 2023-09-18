package com.infinite.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateExample
 */
public class UpdateExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection on=null;   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateExample() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		
			ServletConfig cg = getServletConfig();
			Class.forName(cg.getInitParameter("mysql"));
			on = DriverManager.getConnection(cg.getInitParameter("mysqlurl"), cg.getInitParameter("mysqlusername"),
					cg.getInitParameter("mysqlpassword"));
			PreparedStatement ps=on.prepareStatement("update register set StdId=? where StdName=?;");
			
			ps.setInt(1,Integer.valueOf(request.getParameter("StdId")));
			ps.setString(2,request.getParameter("StdName"));
			ps.executeUpdate();
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
	