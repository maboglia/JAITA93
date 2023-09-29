package repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Serie;

public class SerieDAOImpl implements SerieDAO {

	Collegamento DB;
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	public SerieDAOImpl() {
		this.DB = new Collegamento();
		this.conn = this.DB.getConnessione();
	}
	
	@Override
	public void addSerie(Serie s) {
		try {
			this.ps = this.conn.prepareStatement(ADD);
			this.ps.setString(1, s.getTitolo());
			this.ps.setString(2, s.getGenere());
			this.ps.setDouble(3, s.getRating());
			this.ps.execute();
			
		} catch (SQLException e) {
			System.err.println("Errore database: " + e.getMessage());
		}

	}

	@Override
	public void addSerie(String titolo, String genere, double rating) {
		try {
			Serie s = new Serie();
			s.setTitolo(titolo);
			s.setGenere(genere);
			s.setRating(rating);
			this.ps = this.conn.prepareStatement(ADD);
			this.ps.setString(1, s.getTitolo());
			this.ps.setString(2, s.getGenere());
			this.ps.setDouble(3, s.getRating());
			this.ps.execute();
			
		} catch (SQLException e) {
			System.err.println("Errore database: " + e.getMessage());
		}

	}

	@Override
	public List<Serie> getSerie() {
		List<Serie> serie = new ArrayList<>();//inizializzato e vuoto
		
		try {
			this.ps = this.conn.prepareStatement(FIND_ALL);
			this.rs = this.ps.executeQuery();
			while (this.rs.next()) {
				Serie s = new Serie();
				s.setId(rs.getInt(1));
				s.setTitolo(rs.getString("titolo"));
				s.setGenere(rs.getString("genere"));
				s.setRating(rs.getDouble("rating"));
				serie.add(s);
			}
			
			
			
		} catch (SQLException e) {
			System.err.println("Errore database: " + e.getMessage());
		}
		
		return serie;
	}

	@Override
	public Serie getSerieById(int id) {
		Serie s = null;
		try {
			this.ps = this.conn.prepareStatement(FIND_BY_ID);
			this.ps.setInt(1, id);//collego il parametro alla query
			this.rs = this.ps.executeQuery();
			while (this.rs.next()) {
				s = new Serie();
				s.setId(rs.getInt(1));
				s.setTitolo(rs.getString("titolo"));
				s.setGenere(rs.getString("genere"));
				s.setRating(rs.getDouble("rating"));
				
			}
			
		} catch (SQLException e) {
			System.err.println("Errore database: " + e.getMessage());
		}
		
		return s;
	}

	@Override
	public List<Serie> getSerieByGenere(String genere) {
		List<Serie> serie = new ArrayList<>();//inizializzato e vuoto
		
		try {
			this.ps = this.conn.prepareStatement(FIND_BY_GENERE);
			this.ps.setString(1, genere);//collego il parametro alla query
			this.rs = this.ps.executeQuery();
			while (this.rs.next()) {
				Serie s = new Serie();
				s.setId(rs.getInt(1));
				s.setTitolo(rs.getString("titolo"));
				s.setGenere(rs.getString("genere"));
				s.setRating(rs.getDouble("rating"));
				serie.add(s);
			}
			
			
			
		} catch (SQLException e) {
			System.err.println("Errore database: " + e.getMessage());
		}
		
		return serie;
	}

}
