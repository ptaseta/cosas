package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.EquiposRepository;
import model.Equipos;

@WebServlet("/VotoFormulario")
public class ConfirmacionServlet extends BaseServlet{
    
    EquiposRepository repository = new EquiposRepository();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("llega");
		List<Equipos> equipo = repository.listAll();
		req.setAttribute("lista", equipo);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/VotoFormulario.jsp");
		dispatcher.forward(req, resp);
	}
}
