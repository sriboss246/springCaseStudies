package com.wipro.servletsrc;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewVoterIDForwardServlet
 */
public class ViewVoterIDForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewVoterIDForwardServlet() {
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
		//System.out.println("In servlet");
		response.setContentType("text/html");
		com.wipro.databasesrc.VoterID_Request_DAO x = new com.wipro.databasesrc.VoterID_Request_DAO ();
		ResultSet rs = x.displayForwardedReq();
		System.out.println("Resultset Contains Display Function");
		request.setAttribute("displayVoterIDForwarded", rs);
		RequestDispatcher rd= request.getRequestDispatcher("ViewVoterIDForwarded.jsp");
		rd.forward(request, response);

	}

}
