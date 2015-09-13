package com.wipro.servletsrc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ViewVoterIDGeneratedServlet
 */
public class ViewVoterIDGeneratedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewVoterIDGeneratedServlet() {
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
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			HttpSession session=request.getSession();
			String userid=(String) session.getAttribute("userid");
			com.wipro.databasesrc.VoterID_Request_DAO x1 = new com.wipro.databasesrc.VoterID_Request_DAO ();
			ResultSet rs =x1.displayGeneratedVoterID(userid);
			if(!(rs.next())){
				out.write("Sorry No voter ID generated ");
			}
			
			else
				out.write("Voter ID :" + rs.getString(1));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
