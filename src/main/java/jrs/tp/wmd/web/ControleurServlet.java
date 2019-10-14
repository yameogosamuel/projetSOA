package jrs.tp.wmd.web;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jrs.tp.wmd.payment.services.BanqueServices;
import jrs.tp.wmd.restauration.RepasRessource;


public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RepasRessource metier1;
	BanqueServices metier2;
	
	public void init() throws ServletException {
		metier1=new RepasRessource();
		metier2= new BanqueServices();
	}
    public ControleurServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("VueAuthentificate.html").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("VueAuthentificate.html").forward(request, response);
	}

}
