package com.infinite.servlet;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Voter
 */
public class Voter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Voter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	int a;
	//Scanner sc=new Scanner(System.in);
	try{
		a=Integer.valueOf(request.getParameter("age"));
		if(a>=18)

	{
			response.sendRedirect("Insert.html");
			
	}
		else{
			response.sendRedirect("Failure.html");
		}
	}
	catch (Exception e) {
		System.out.println(e);
		
	} finally {
		try {
			//sc.close();
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}
}


}
