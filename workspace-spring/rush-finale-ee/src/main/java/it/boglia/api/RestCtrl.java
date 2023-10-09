package it.boglia.api;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.boglia.entities.Provincia;
import it.boglia.services.PopolazioneService;

@RestController
@RequestMapping("api")
public class RestCtrl {

	@Autowired
	private PopolazioneService service;
	
	@GetMapping("")
	public Collection<Provincia> getProvince(){
		
		return service.getProvinceMap().values();
	} 
	
	
	
}
