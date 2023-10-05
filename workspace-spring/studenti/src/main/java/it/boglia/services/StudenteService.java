package it.boglia.services;

import java.util.List;

import it.boglia.entities.Studente;

public interface StudenteService {

	List<Studente> getStudenti();
	Studente getStudenteById(int id);
	Studente addStudente(Studente s);
	
}
