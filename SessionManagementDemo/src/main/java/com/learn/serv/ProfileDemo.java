package com.learn.serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/profile")
public class ProfileDemo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		Cookie[] cookie = req.getCookies();
		String name ="";
		for(Cookie c : cookie) {
			if(c.getName().equals("email")) {
				name = c.getValue();
			}
		}
//		HttpSession session = req.getSession();
//		String name = (String) session.getAttribute("name_key");
//		String email = (String) session.getAttribute("email_key");
		PrintWriter out = res.getWriter();
		out.println("Name: "+name);
	}
}
