package it.boglia.services;

import java.util.List;

import it.boglia.entities.Film;

public interface FilmService {

	//CRUD
	
	Film add(Film f);
	Film get(int id);
	List<Film> getAll();
	Film update(Film f);
	void delete(int id);
	
}
