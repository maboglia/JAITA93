package it.boglia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.boglia.entities.Serie;
import it.boglia.services.SerieService;

@RestController
@RequestMapping("api")
public class RESTController {

	@Autowired
	SerieService service;
	
	@GetMapping("serie")
	public List<Serie> getAll(){
		return service.getSerie();
	}
	
	
}
