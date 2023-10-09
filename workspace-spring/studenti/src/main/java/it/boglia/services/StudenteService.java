package it.boglia.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import it.boglia.entities.Studente;

public interface StudenteService {

	List<Studente> getStudenti();
	Studente getStudenteById(int id);

	
	Studente addStudente(Studente s);
	
}
