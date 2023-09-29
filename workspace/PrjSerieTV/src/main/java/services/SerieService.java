package services;

import java.util.List;

import model.Serie;

public interface SerieService {

	void addSerie(Serie s);
	void addSerie(String titolo, String genere, double rating);
	
	List<Serie> getSerie();
	Serie getSerieById(int id);
	List<Serie> getSerieByGenere(String genere);
	
}
