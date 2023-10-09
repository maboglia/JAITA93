package it.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.entities.FilmInSala;
import it.boglia.repos.FilmInSalaDAO;

@Service
public class FilmInSalaServiceImpl implements FilmInSalaService {

	@Autowired
	private FilmInSalaDAO dao;
	
	@Override
	public FilmInSala add(FilmInSala f) {
		return dao.save(f);
	}

	@Override
	public FilmInSala get(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<FilmInSala> getAll() {
		return dao.findAll();
	}

	@Override
	public FilmInSala update(FilmInSala f) {
		return dao.save(f);
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
	}

}
