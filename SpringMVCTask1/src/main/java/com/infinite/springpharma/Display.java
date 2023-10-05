package com.infinite.springpharma;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Display {
	@RequestMapping("/show")
	public void show(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			DataSource datasource = HikariDB.getDataSource();
			con = datasource.getConnection();
			ps = con.prepareStatement("select Medicine from pharma");
			// ps.setString(1,(request.getParameter("code")));
			rs = ps.executeQuery();
			while (rs.next()) {
				out.println(rs.getString(1)+"<br>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// con.rollback();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}