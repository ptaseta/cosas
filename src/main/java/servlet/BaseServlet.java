package servlet;

import java.io.IOException;
import java.util.Optional;

import model.Equipos;
import model.Votantes;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class BaseServlet extends HttpServlet{
	
	public BaseServlet() {
		super();
	}

	protected Equipos getEquipoFromRequest(HttpServletRequest req) {
		Equipos equipo = new Equipos();
		equipo.setId(Integer.parseInt(req.getParameter("id")));
		equipo.setNombreEquipo(req.getParameter("nombre_equipo"));
		
		
		System.out.println(equipo.getId());
		System.out.println(equipo.getNombreEquipo());
		
		
		return equipo;
		
	}

	protected void redirect(HttpServletRequest req, HttpServletResponse resp, String jsp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(req, resp);
	}

}
