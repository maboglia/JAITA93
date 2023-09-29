package integration;

import java.io.IOException;

import org.apache.catalina.connector.Response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Serie;
import services.SerieService;
import services.SerieServiceImpl;

@WebServlet("")
public class SiteController extends HttpServlet{

	SerieService service;
	
	public SiteController() {
		this.service = new SerieServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//redirect
		//response.sendRedirect("client_javascript.html");
		
		//oppure request dispatcher
		request.getRequestDispatcher("client_javascript.html").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("titolo")!=null) {
			
			Serie s = new Serie();
			
			s.setTitolo(request.getParameter("titolo"));
			s.setGenere(request.getParameter("genere"));
			s.setRating(Double.parseDouble(request.getParameter("rating")));
			
			service.addSerie(s);
			
		}
		doGet(request, response);
		
	}
	
	
	
	
}
