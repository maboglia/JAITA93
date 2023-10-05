package it.boglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.boglia.entities.Corso;
import it.boglia.entities.Esame;
import it.boglia.entities.Studente;
import it.boglia.services.CorsoService;
import it.boglia.services.EsameService;
import it.boglia.services.StudenteService;

@RestController
@RequestMapping("api")
public class StudenteRestCtrl {

	@Autowired
	StudenteService service;

	@Autowired
	EsameService esameService;
	
	@Autowired
	CorsoService corsoService;
	
	@GetMapping("studenti")
	List<Studente> getStudenti(){
		return service.getStudenti();
	}
	
	@GetMapping("studenti/{id}")
	Studente getStudenteById(@PathVariable int id){
		if (service.getStudenteById(id)!=null)
		
			return service.getStudenteById(id);
		
		return new Studente();
	}
	
	
	
	@GetMapping("esami")
	List<Esame> getEsami(){
		return esameService.getEsami();
	}
	
	@PostMapping("esami")
	Esame addEsami(@RequestBody Esame e){
		return esameService.addEsame(e);
	}	
	
	@GetMapping("corsi")
	List<Corso> getCorsi(){
		return corsoService.getCorsi();
	}
	
	@PostMapping("studenti")
	Studente addStudente(@RequestBody  Studente s) {
		return service.addStudente(s);
	}
	
	@GetMapping("esami/{min}/{max}")
	List<Esame> getEsamiRange(@PathVariable("min") int min, @PathVariable("max") int max){
		return esameService.getEsamiByVoti(min, max);
	}
	
}
