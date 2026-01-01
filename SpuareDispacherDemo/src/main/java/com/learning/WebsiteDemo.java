package com.learning;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/app")
public class WebsiteDemo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		RequestDispatcher rd = req.getRequestDispatcher("header");
		rd.include(req, res);
		
		PrintWriter out = res.getWriter();
		out.println("Hello This is main content");
		
		RequestDispatcher rd2 = req.getRequestDispatcher("footer");
		rd2.include(req, res);
	}
}
