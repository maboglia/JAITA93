package presentation;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Canzone;
import services.CanzoneService;
import services.CanzoneServiceImpl;

@WebServlet("/provami")//route - URL endpoint http://localhost:8080/Canzoni/provami
public class MVCController extends HttpServlet {

	CanzoneService service = new CanzoneServiceImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().print("Hey sei connesso! Mi hai chiamato usando GET");
		
		//response.sendRedirect("addCanzone.jsp");//posso fare un redirect
		
		Random r = new Random();
		
		request.setAttribute("titoloPagina", "Il titolo di questa pagina è...");
		
		request.setAttribute("numeroFortunato", r.nextInt(1, 91));
		
		request.getRequestDispatcher("addCanzone.jsp").forward(request, response);
		
	}
	
	
	
	
	

	public List<Canzone> mostraCanzoni(){
		return service.getCanzoni();
	}

	public void addCanzone(String titolo, String cantante) {
		
		Canzone c = new Canzone();
		c.setTitolo(titolo);
		c.setCantante(cantante);
		service.addCanzone(c);
	}
	
}
