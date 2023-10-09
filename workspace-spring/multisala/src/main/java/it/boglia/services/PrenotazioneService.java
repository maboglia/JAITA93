package it.boglia.services;

import java.util.List;

import it.boglia.entities.Prenotazione;

public interface PrenotazioneService {

	//CRUD
	
	Prenotazione add(Prenotazione f);
	Prenotazione get(int id);
	List<Prenotazione> getAll();
	Prenotazione update(Prenotazione f);
	void delete(int id);
	
}
