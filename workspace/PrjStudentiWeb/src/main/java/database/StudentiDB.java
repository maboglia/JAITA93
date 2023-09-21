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
		
		//svuota l'arraylist
		studenti.clear();
		inizializza();
		return studenti;
	}

	public void inizializza() {
	
		try {
			Statement stat =  db.getConnessione().createStatement();
			
			ResultSet rs = stat.executeQuery("SELECT id, nome FROM studenti");
			
			while (rs.next()) {
				
				int id = rs.getInt(1);
				String nome = rs.getString("nome");
				Studente temp = new Studente(id,nome);
				studenti.add(temp);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
