package services;

import java.util.List;

import model.Canzone;

public interface CanzoneService {

	List<Canzone> getCanzoni();
	void addCanzone(Canzone c);
}
