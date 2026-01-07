package com.learn.serv;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/app")
public class SessionServletDemo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		HttpSession session = req.getSession();
		session.setAttribute("name_key",name);
		session.setAttribute("email_key",email);
		
		RequestDispatcher rs  =  req.getRequestDispatcher("profile");
		rs.forward(req, res);
	}
}
