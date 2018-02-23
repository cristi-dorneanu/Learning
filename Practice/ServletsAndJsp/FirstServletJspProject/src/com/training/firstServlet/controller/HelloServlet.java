package com.training.firstServlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.firstServlet.model.beans.User;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String url = "/index.html";
		
		if(action == null || action.equals("back"))
		{
			url = "/JoinNow";
		} else if(action.equals("toHello"))
		{
			url = "/SayHello.jsp";
		}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}

}
