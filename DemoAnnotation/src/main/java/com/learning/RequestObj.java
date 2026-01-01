package com.learning;

import java.util.Enumeration;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/requestest")
public class RequestObj extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		String name = req.getParameter("name");
		String method = req.getMethod();
		Enumeration<String> headers = req.getHeaderNames();
		String[] checkbox = req.getParameterValues("check");
		System.out.println(name+" "+method+" "+checkbox[0]+" "+headers.toString());
	}
}
