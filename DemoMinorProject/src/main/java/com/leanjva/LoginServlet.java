package com.leanjva;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter(); 
		String user = req.getParameter("username");
		String pass =  req.getParameter("pass");
		String query = "Select * from user where username = ? AND password = ?";
		try (
			Connection conn = DBConfig.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			pstmt.setString(1, user);
			pstmt.setString(2, pass);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				req.setAttribute("user",rs.getString("username"));
				out.println("Login Successfull");
			}else {
				req.setAttribute("error", "Username and passoword is incorrect! pls try again!");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, res);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}