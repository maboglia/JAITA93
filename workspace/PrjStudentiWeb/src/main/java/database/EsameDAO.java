package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Materia;
import model.Studente;

public class EsameDAO {

	Collegamento collegamento;
	Statement statement;//modulo per richieste al db
	PreparedStatement ps;//modulo per richieste al db specializzato
	ResultSet rs;
	
	public EsameDAO() {
		this.collegamento = new Collegamento();
	}
	
	public void addEsame(Studente s, Materia m, int voto) {
		
		try {
			String query = "insert into esami (studente_id, materia_id, voto) values (?,?,?)";
			this.ps = this.collegamento.getConnessione().prepareStatement(query);
			
			this.ps.setInt(1, s.getId());//bind parameter
			this.ps.setInt(2, m.getId());
			this.ps.setInt(3, voto);
			this.ps.execute();
//			if (  ) {
//				System.out.println("Esame inserito con successo");
//			} else {
//				System.out.println("esame non inserito");
//			}
			System.out.println("record inserito");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
