package services;

import java.util.List;

import model.Serie;
import repos.SerieDAO;
import repos.SerieDAOImpl;

public class SerieServiceImpl implements SerieService{
	
	
	SerieDAO dao = new SerieDAOImpl();
	

	@Override
	public void addSerie(Serie s) {
		dao.addSerie(s);
		
	}

	@Override
	public void addSerie(String titolo, String genere, double rating) {
		dao.addSerie(titolo, genere, rating);
		
	}

	@Override
	public List<Serie> getSerie() {
		
		return dao.getSerie();
	}

	@Override
	public Serie getSerieById(int id) {
		
		return dao.getSerieById(id);
	}

	@Override
	public List<Serie> getSerieByGenere(String genere) {
		
		return dao.getSerieByGenere(genere);
	}

}
