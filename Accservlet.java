package com.wipro.servlet;
import com.wipro.dao.*;
import com.wipro.bean.*;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Accservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		Accountdao ad=new Accountdao();
		List<Accountbean> li=ad.getAccounts();
		
		request.setAttribute("data", li);
		
	RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
		rd.forward(request, response);
		
		
	}

}
