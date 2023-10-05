package it.boglia.services;

import java.util.List;

import it.boglia.entities.Esame;

public interface EsameService {

	List<Esame> getEsami();
	Esame addEsame(Esame e);
	
	List<Esame> getEsamiByVoti(int min, int max);
	
}
