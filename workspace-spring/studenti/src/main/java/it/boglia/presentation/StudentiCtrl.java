package it.boglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.boglia.entities.Esame;
import it.boglia.entities.Studente;
import it.boglia.services.CorsoService;
import it.boglia.services.EsameService;
import it.boglia.services.StudenteService;

@Controller
@RequestMapping("")
public class StudentiCtrl {


	@Autowired
	StudenteService service;

	@Autowired
	EsameService esameService;
	
	@Autowired
	CorsoService corsoService;	
	
	
	@GetMapping("")
	public String home() {
		return "home";
	}
	
	@GetMapping("studenti")
	public String studenti(Model m) {
		m.addAttribute("titoloPagina", "Home page gestione studenti");
		m.addAttribute("tuttiglistudenti", service.getStudenti());//aggiungo alla vista il model
		return "studenti";
	}
	
	@PostMapping("studenti")
	public String addStudente(Studente s) {
		service.addStudente(s);
		return "redirect:studenti";
	}
	
	@GetMapping("corsi")
	public String corsi() {
		return "corsi";
	}
	
	@GetMapping("esami")
	public String esami(Model m) {
		
		m.addAttribute("titoloPagina", "Home page gestione esami");
		m.addAttribute("tuttigliesami", esameService.getEsami());
		
		return "esami";
	}
		
	@PostMapping("esami")
	public String addEsame(Esame e, @RequestParam String dataEsame) {
		System.out.println(dataEsame);
		esameService.addEsame(e);
		return "redirect:esami";
	}
	
}
