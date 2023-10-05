package it.boglia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.entities.Corso;
import it.boglia.entities.Esame;
import it.boglia.entities.Studente;
import it.boglia.repos.CorsoDAO;
import it.boglia.repos.EsameDAO;
import it.boglia.repos.StudenteDAO;

@Service
public class StudenteServiceImpl implements StudenteService, CorsoService, EsameService{

	@Autowired
	private StudenteDAO dao;

	@Autowired
	private CorsoDAO daoCorsi;

	@Autowired
	private EsameDAO daoEsami;	
	
	@Override
	public List<Studente> getStudenti() {
		return dao.findAll();
	}

	@Override
	public Studente addStudente(Studente s) {
		return dao.save(s);
	}

	@Override
	public List<Esame> getEsami() {
		return daoEsami.findAll();
	}

	@Override
	public Esame addEsame(Esame e) {
		return daoEsami.save(e);
	}

	@Override
	public List<Corso> getCorsi() {
		return daoCorsi.findAll();
	}

	@Override
	public Corso addCorso(Corso c) {
		return daoCorsi.save(c);
	}

	@Override
	public List<Esame> getEsamiByVoti(int min, int max) {
		// TODO Auto-generated method stub
		return daoEsami.findByVotoBetween(min, max);
	}

	@Override
	public Studente getStudenteById(int id) {
		
		Optional<Studente> s = dao.findById(id);
		if (s.isPresent())
			return s.get();
		
		return null;
	}

}
