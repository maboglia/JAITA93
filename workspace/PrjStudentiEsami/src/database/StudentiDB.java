package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Studente;

public class StudentiDB {
	
	Collegamento db = new Collegamento();
	ArrayList<Studente> studenti = new ArrayList<>();
	
	public ArrayList<Studente> getStudenti() {
		return studenti;
	}

	public void inizializza() {
	
		try {
			Statement stat =  db.getConnessione().createStatement();
			
			ResultSet rs = stat.executeQuery("SELECT * FROM studenti");
			
			while (rs.next()) {
				
				String nome = rs.getString("nome");
				Studente temp = new Studente(nome);
				studenti.add(temp);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
