package com.formacion.canciones.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.canciones.pojo.Cancion;

/**
 * Servlet implementation class ListaController
 */
public class ListaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//crear array con 10 canciones
		ArrayList<Cancion> canciones = new ArrayList<>();
		
		canciones.add( new Cancion("sdfsf","dfd","jhj"));
		canciones.add( new Cancion("Safe","erma","jhbvjh"));
				
		//pasar canciones en la request a la JSP
		request.setAttribute("listado",canciones);
				
		//ir a listar.JSP
		RequestDispatcher dispatch = request.getRequestDispatcher("listado.jsp");
		dispatch.forward(request, response);
		
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
