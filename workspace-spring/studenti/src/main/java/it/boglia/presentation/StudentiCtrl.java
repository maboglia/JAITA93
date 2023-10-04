package it.boglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.boglia.entities.Studente;
import it.boglia.services.StudenteService;

@Controller
@RequestMapping("")
public class StudentiCtrl {


	@Autowired
	StudenteService service;
	
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
	
	
}
