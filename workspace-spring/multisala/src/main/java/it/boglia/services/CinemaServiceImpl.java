package it.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.entities.Cinema;
import it.boglia.repos.CinemaDAO;

@Service
public class CinemaServiceImpl implements CinemaService {

	@Autowired
	private CinemaDAO dao;
	
	@Override
	public Cinema add(Cinema f) {
		return dao.save(f);
	}

	@Override
	public Cinema get(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Cinema> getAll() {
		return dao.findAll();
	}

	@Override
	public Cinema update(Cinema f) {
		return dao.save(f);
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
	}

}
