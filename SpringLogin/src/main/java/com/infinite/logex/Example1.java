package com.infinite.logex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Servlet implementation class Example1
 */
@Controller
public class Example1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection on = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Example1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@RequestMapping("/index")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			Class.forName("com.mysql.jdbc.Driver"); // loading driver

			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");

			// PreparedStatement ps=on.prepareStatement("Insert into login
			// values(?,?);");

			// ps.setString(1, username);

			// ps.setString(2, password);

			if (request.getParameter("username").equals("pradeep"))

			{

				if (request.getParameter("password").equals("prdp"))

				{

					response.sendRedirect("login.html");

				}

				else

				{

					response.sendRedirect("invalid.jsp");

				}

			} else

			{

				response.sendRedirect("invalid.html");

			}

		}

		catch (Exception e)

		{

			System.out.println(e);

		}

		finally

		{

			try {

				on.close();

			}

			catch (Exception e1)

			{

				System.out.println(e1);

			}

		}

	}

}