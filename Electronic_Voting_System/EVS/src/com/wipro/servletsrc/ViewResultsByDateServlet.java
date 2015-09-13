package com.wipro.servletsrc;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewResultsByDateServlet
 */
public class ViewResultsByDateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewResultsByDateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In servlet");
		response.setContentType("text/html");
		com.wipro.databasesrc.Election_Results_DAO x = new com.wipro.databasesrc.Election_Results_DAO ();
		String str = request.getParameter("eldate");
		ResultSet rs = x.displayResultsByDate(str);
		System.out.println("Resultset Contains Display Function");
		request.setAttribute("electionResultsByDate", rs);
		RequestDispatcher rd= request.getRequestDispatcher("ViewResultsByDate.jsp");
		rd.forward(request, response);
		
	}

}
