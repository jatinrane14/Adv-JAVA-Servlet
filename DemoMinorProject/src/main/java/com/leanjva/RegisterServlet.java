package com.leanjva;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regester")
public class RegisterServlet extends HttpServlet {
	private static final String query = "INSERT INTO user VALUES(?,?,?)";
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		try(
			Connection conn = DBConfig.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
		){
			ps.setString(1, "25BgDk");
			ps.setString(2, name);
			ps.setString(3, pass);
			int result = ps.executeUpdate();
		
			if(result!=0) {
				req.setAttribute("result", "Account Regestration completed");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, res);
			}else {
				out.println(result + "Account not regestered!");
			}
			
		}catch(Exception e) {
			
		}
		
	}
}
