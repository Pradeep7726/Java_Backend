package com.infinite.servlet;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	Scanner sc = new Scanner(System.in);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			/*response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			ServletConfig cg = getServletConfig();
			Class.forName(cg.getInitParameter("mysql"));
			on = DriverManager.getConnection(cg.getInitParameter("mysqlurl"), cg.getInitParameter("mysqlusername"),cg.getInitParameter("mysqlpassword"));*/
			con=ConToDB.initializeDatabase();
			PreparedStatement ps = con.prepareStatement("Insert into voter values(?,?,?);");
			ps.setString(1, request.getParameter("firstname"));
			ps.setString(2, request.getParameter("lastname"));
			ps.setInt(3,Integer.valueOf(request.getParameter("voterId")));
			
			
			int status=ps.executeUpdate();
			
			if(status==1){
				response.sendRedirect("Success.html");
				
			}
			else
			{
				response.sendRedirect("Failure.html");
			}

		}
		catch (SQLException e1)
		{
			System.out.println(e1);
		}
		catch (Exception e) {
			System.out.println(e);
			
		} finally {
			try {
				con.close();
			} catch (Exception e1) {
				System.out.println(e1);
			}
		}
	}
}