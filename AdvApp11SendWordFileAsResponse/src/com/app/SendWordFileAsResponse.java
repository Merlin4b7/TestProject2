package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class SendWordFileAsResponse extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		PrintWriter out = resp.getWriter();
		
		resp.setContentType("application/msword");
		
		out.println("<h1><table border =1>");
		out.println("<tr><th>COURSE NAME</th><th>FACULTY</th><th>DURATION</th><th>FEE</th></tr>");
		out.println("<tr><td>CORE JAVA</td><td>MERLIN</td><td>30 DAYS</td><td>1500</td></tr>");
		out.println("<tr><td>ADVANCED JAVA</td><td>SATYA</tD><td>45 DAYS</td><td>1000</td></tr>");
		out.println("<tr><td>ORACLE 10g</td><td>KARUNAA</td><td>30 DAYS</td><td>1000</td></tr>");
		out.println("<tr><td>SPRING FRAMEWORK</td><td>SHEKAR</td><td>60 DAYS</td><td>2500</td></tr></h1>");

	}
}
