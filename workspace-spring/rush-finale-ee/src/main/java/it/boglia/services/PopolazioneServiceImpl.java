package it.boglia.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.dal.ProvinciaDAO;
import it.boglia.entities.Provincia;
import it.boglia.entities.Regione;

@Service
public class PopolazioneServiceImpl implements PopolazioneService {

	@Autowired
	private ProvinciaDAO dao;
	
	private Map<Integer, Provincia> mappaProvince;
	
	@Autowired
	public PopolazioneServiceImpl(ProvinciaDAO dao) {
		this.mappaProvince = new TreeMap<>();
		
		
	}

	public void inizializza() {
		for (Provincia p : this.getProvince()) {
			this.mappaProvince.put(p.getId(), p);
		}
	}
	
	@Override
	public List<String> getRegioni() {
//		
//		Set<String> regioniSet = new TreeSet<String>();
//		for (Provincia p : getProvinceMap().values()) {
//			regioniSet.add(p.getRegione());
//		}
//		
//		List<String> regioni = new ArrayList<String>(regioniSet);
//		return regioni;
	
		return getProvinceMap()
				.values()//collection provincia
				.stream()//trasformo in stream
				.map(p -> p.getRegione())//prendo solo una proprietà dall'oggetto
				.distinct()//eleimino i duplicati
				.sorted()//ordino (string impl comparable)
				.toList();//converto in una list string
	}

	@Override
	public List<Provincia> getProvince() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Provincia> getProvinceByRegione(Regione r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Provincia> getProvinceByRegione(String regione) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Provincia> getProvinceMap() {
		inizializza();
		return this.mappaProvince;
	}

	@Override
	public Provincia getProvinciaById(int id) {
		
		return this.mappaProvince.get((Integer) id);
	}

}
