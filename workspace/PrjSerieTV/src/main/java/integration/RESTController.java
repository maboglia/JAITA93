package integration;

import java.io.IOException;

import org.json.JSONArray;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.SerieService;
import services.SerieServiceImpl;

@WebServlet("/api/serie")
public class RESTController extends HttpServlet{

	SerieService service;
	
	public RESTController() {
		service = new SerieServiceImpl();
	}	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("application/json");//MIME
		
		JSONArray array = new JSONArray(this.service.getSerie());
		
		response.getWriter().print(array.toString());
		
	}
	
	
	
	
}
