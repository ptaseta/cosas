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


@WebServlet("/AñadirParticipante")
public class AñadirParticipanteServlet extends BaseServlet {
    EquiposRepository repository = new EquiposRepository();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("llega detalles equipo");
        int id = Integer.parseInt(req.getParameter("idEquipo"));
        req.setAttribute("idEquipo", id);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Participantes.jsp");
		dispatcher.forward(req, resp);
    }
}
