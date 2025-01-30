package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RequestAddAttribute")
public class RequestAddAttribute  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Student s= new Student(1,"jaya",100);

		req.setAttribute("std", s);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("GetAttribute");
		
		dispatcher.forward(req, resp);
	}

}
