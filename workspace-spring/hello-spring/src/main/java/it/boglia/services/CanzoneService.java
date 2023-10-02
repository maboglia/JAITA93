package it.boglia.services;

import java.util.List;

import it.boglia.entities.Canzone;

public interface CanzoneService {

	List<Canzone> getCanzoni();
	Canzone addCanzone(Canzone c);
	//crud
	Canzone updateCanzone(Canzone c);
}
