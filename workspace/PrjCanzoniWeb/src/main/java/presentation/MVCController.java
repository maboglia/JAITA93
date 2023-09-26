package presentation;

import java.util.List;

import model.Canzone;
import services.CanzoneService;
import services.CanzoneServiceImpl;

public class MVCController {

	CanzoneService service = new CanzoneServiceImpl();
	
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
