package it.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.entities.Prenotazione;
import it.boglia.repos.PrenotazioneDAO;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {

	@Autowired
	private PrenotazioneDAO dao;
	
	@Override
	public Prenotazione add(Prenotazione f) {
		return dao.save(f);
	}

	@Override
	public Prenotazione get(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Prenotazione> getAll() {
		return dao.findAll();
	}

	@Override
	public Prenotazione update(Prenotazione f) {
		return dao.save(f);
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
	}

}
