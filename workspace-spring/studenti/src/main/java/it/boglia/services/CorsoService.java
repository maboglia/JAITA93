package it.boglia.services;

import java.util.List;

import it.boglia.entities.Corso;

public interface CorsoService {

	List<Corso> getCorsi();
	Corso addCorso(Corso c);
	
}
