package com.wipro.servletsrc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PartyDetailsIntoServlet
 */
public class PartyDetailsIntoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PartyDetailsIntoServlet() {
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
			com.wipro.entitybean.classes.Party_Details_Bean_Class x = (com.wipro.entitybean.classes.Party_Details_Bean_Class)request.getAttribute("PartyDetailsIntoServlet");
			
			com.wipro.databasesrc.Party_Details_DAO x1 = new com.wipro.databasesrc.Party_Details_DAO ();
			if(x1.addPartyCheck(x)==1){
				out.write("Records inserted successfully");
			}
			else 
				out.write("Error in inserting records");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
