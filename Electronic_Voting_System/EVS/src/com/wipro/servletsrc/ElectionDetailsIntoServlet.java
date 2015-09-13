package com.wipro.servletsrc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ElectionDetailsIntoServlet
 */
public class ElectionDetailsIntoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElectionDetailsIntoServlet() {
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
			com.wipro.entitybean.classes.Election_Details_Bean_Class x = (com.wipro.entitybean.classes.Election_Details_Bean_Class)request.getAttribute("ElectionDetailsIntoServlet");
			
			com.wipro.databasesrc.Election_Details_DAO x1 = new com.wipro.databasesrc.Election_Details_DAO ();
			//System.out.println(x.getElcons()+"helloworld");
			
			if(x1.addElectionCheck(x)==1){
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
	
