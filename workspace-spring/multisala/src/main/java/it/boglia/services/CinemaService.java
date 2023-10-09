package it.boglia.services;

import java.util.List;

import it.boglia.entities.Cinema;

public interface CinemaService {

	//CRUD
	
	Cinema add(Cinema f);
	Cinema get(int id);
	List<Cinema> getAll();
	Cinema update(Cinema f);
	void delete(int id);
	
}
