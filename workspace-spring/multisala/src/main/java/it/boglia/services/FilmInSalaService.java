package it.boglia.services;

import java.util.List;

import it.boglia.entities.FilmInSala;

public interface FilmInSalaService {

	//CRUD
	
	FilmInSala add(FilmInSala f);
	FilmInSala get(int id);
	List<FilmInSala> getAll();
	FilmInSala update(FilmInSala f);
	void delete(int id);
	
}

