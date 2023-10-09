package it.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.entities.Film;
import it.boglia.repos.FilmDAO;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDAO dao;
	
	@Override
	public Film add(Film f) {
		return dao.save(f);
	}

	@Override
	public Film get(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Film> getAll() {
		return dao.findAll();
	}

	@Override
	public Film update(Film f) {
		return dao.save(f);
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
	}

}
