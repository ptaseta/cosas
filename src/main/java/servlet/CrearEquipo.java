package servlet;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import model.Equipos;
import repository.EquiposRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CrearEquipo")
public class CrearEquipo extends BaseServlet{
    
    EquiposRepository repository = new EquiposRepository();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("llega crear equipo");
		System.out.println("nombre equipo servlet: "+req.getParameter("nombre_equipo"));
        repository.insert(new Equipos(req.getParameter("nombre_equipo")));
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/CrearEquipo.jsp");
		dispatcher.forward(req, resp);
	}
}
