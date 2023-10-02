package it.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.entities.Canzone;
import it.boglia.repos.CanzoneDAO;

@Service
public class CanzoneServiceImpl implements CanzoneService {

	@Autowired
	CanzoneDAO dao;
	
	
	@Override
	public List<Canzone> getCanzoni() {
		
		return dao.findAll();
	}

	@Override
	public Canzone addCanzone(Canzone c) {
		
		return dao.save(c);
	}

	@Override
	public Canzone updateCanzone(Canzone c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}

}
