package servlet;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import model.Equipos;
import model.Integrante;
import repository.EquiposRepository;
import repository.IntegranteRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DetallesEquipos")
public class DetallesEquiposServlet extends BaseServlet {

    EquiposRepository repository = new EquiposRepository();
    IntegranteRepository repositoryIntegrante = new IntegranteRepository();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("llega detalles equipo");
		String nombreIntegrante = req.getParameter("Integrante1");
		System.out.println("nombreIntegrante: " + nombreIntegrante);
		System.out.println("id: " + req.getParameter("idEquipo"));
		if (nombreIntegrante != null) {
			System.out.println("llega integrante");
			int id = Integer.parseInt(req.getParameter("id"));
			repositoryIntegrante.insert(new Integrante(nombreIntegrante, id));
			List<Integrante> integrantes = repositoryIntegrante.listAll(id);
			List<Equipos> equipo = repository.listOne(id);
			req.setAttribute("listIntegrantes", integrantes);
			req.setAttribute("listOne", equipo);

			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DetallesEquipos.jsp");
			dispatcher.forward(req, resp);
		}else{
			System.out.println("llega¿?");
			List<Equipos> equipo = repository.listOne(Integer.parseInt(req.getParameter("idEquipo")));
			List<Integrante> integrantes = repositoryIntegrante.listAll(Integer.parseInt(req.getParameter("idEquipo")));
			req.setAttribute("listOne", equipo);
			req.setAttribute("listIntegrantes", integrantes);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DetallesEquipos.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
