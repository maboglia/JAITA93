package it.boglia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.boglia.entities.Canzone;
import it.boglia.services.CanzoneService;

@RestController
@RequestMapping("api")
public class RESTController {

	@Autowired
	CanzoneService service;
	
	@GetMapping("canzoni")
	public List<Canzone> getAll(){
		return service.getCanzoni();
	}
	
	@PostMapping("canzoni")
	public Canzone add(@RequestBody Canzone c) {
		return service.addCanzone(c);
	}
	
	@PutMapping("canzoni")
	public Canzone update(@RequestBody Canzone c) {
		return service.updateCanzone(c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
