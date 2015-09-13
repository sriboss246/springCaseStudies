package com.wipro.servletsrc;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewVoterIDReqServlet
 */
public class ViewVoterIDReqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewVoterIDReqServlet() {
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
		com.wipro.databasesrc.VoterID_Request_DAO x = new com.wipro.databasesrc.VoterID_Request_DAO ();
		ResultSet rs = x.display();
		System.out.println("Resultset Contains Display Function");
		request.setAttribute("displayVoterIDReq", rs);
		RequestDispatcher rd= request.getRequestDispatcher("ViewVoterIDReq.jsp");
		rd.forward(request, response);

	}

}
