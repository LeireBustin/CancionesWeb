package com.formacion.canciones.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.canciones.pojo.Cancion;

/**
 * Servlet implementation class CrearController
 */

// @WebServlet("/crear") NO APARECE ESTO POR DEFINICION
public class CrearController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CrearController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recoger params del formu
		String nombre = getParameter("nombre");

		// creamos la cancion
		Cancion c = new Cancion("Nombre", " ", " ");

		// ...Enviamos a la vista??		FALTA CODIGO
		request.setAttribute("nombre", c);

		//vamos a la vista
		RequestDispatcher dispatch = request.getRequestDispatcher("detalle.jsp");
		dispatch.forward(request, response);

	}

}
