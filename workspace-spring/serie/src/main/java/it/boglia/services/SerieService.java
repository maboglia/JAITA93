package it.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.entities.Serie;
import it.boglia.repos.SerieDAO;

@Service
public class SerieService {

	@Autowired
	private SerieDAO dao;
	
	public List<Serie> getSerie(){
		return dao.findAll();
	}
	
}
