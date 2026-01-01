package com.learning;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/footer")
public class Footer extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException  {
		PrintWriter out = res.getWriter();
		out.println("This is footer");
	}
}
