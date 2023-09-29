package repos;

import java.util.List;

import model.Serie;

public interface SerieDAO {

	String ADD = "INSERT INTO serie (titolo, genere, rating) VALUES (?,?,?)";
	String FIND_ALL = "select * from serie";
	String FIND_BY_ID = "select * from serie where id = ?";
	String FIND_BY_GENERE = "select * from serie where genere = ?";
	
	void addSerie(Serie s);
	void addSerie(String titolo, String genere, double rating);
	
	List<Serie> getSerie();
	Serie getSerieById(int id);
	List<Serie> getSerieByGenere(String genere);
	
	
	
	
}
