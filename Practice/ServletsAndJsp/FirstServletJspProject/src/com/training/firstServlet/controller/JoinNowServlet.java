package com.training.firstServlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.firstServlet.model.beans.User;
import com.training.firstServlet.model.beans.UserCredentials;

public class JoinNowServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1084999494756109207L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		String url = "";
		
		if(action == null || action.equalsIgnoreCase("toHello") || action.equalsIgnoreCase("back")) {
			if(req.getParameter("back") != null && req.getParameter("back").equalsIgnoreCase("Back")) {
				url = "/index.html";
			} else if (req.getParameter("enter") != null && req.getParameter("enter").equalsIgnoreCase("Enter")) {
				User user = new User();
				user.setName("Pula");
				
				req.setAttribute("user", user);
				url = "/SayHello";
			} else if (action.equalsIgnoreCase("back")) {
				url = "/index.html";
			}
		} else if (action.equalsIgnoreCase("join")){
			UserCredentials credentials = new UserCredentials();
			
			credentials.setEmail(req.getParameter("email"));
			credentials.setFirstName(req.getParameter("firstName"));
			credentials.setLastName(req.getParameter("lastName"));
			
			req.setAttribute("credentials", credentials);
			url = "/ResponseJoinNow.jsp";
		}
		
		getServletContext().getRequestDispatcher(url).forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
