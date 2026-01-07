package com.learn.serv;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/app2")
public class CookiesServletDemo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		Cookie cookie = new Cookie("email", email);
		res.addCookie(cookie);
		
		res.sendRedirect("profile");
	}
}
