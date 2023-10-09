package it.boglia.services;

import java.util.List;
import java.util.Map;

import it.boglia.entities.Provincia;
import it.boglia.entities.Regione;

public interface PopolazioneService {

	List<String> getRegioni();
	List<Provincia> getProvince();
	List<Provincia> getProvinceByRegione(Regione r);
	List<Provincia> getProvinceByRegione(String regione);
	
	Map<Integer, Provincia> getProvinceMap();
	
	Provincia getProvinciaById(int id);
}
