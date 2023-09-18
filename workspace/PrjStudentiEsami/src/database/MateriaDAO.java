package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Materia;

public class MateriaDAO {

	Collegamento db;
	ArrayList<Materia> materie;
	Statement statement; //un oggetto che serve per portare le istruzioni da java al db
	ResultSet rs; //serve per memorizzare il risulato di una QUERY al db (istruzione SELECT)
	
	public MateriaDAO() {
		this.db = new Collegamento();
		this.materie = new ArrayList<Materia>();
	}

	public ArrayList<Materia> getMaterie() throws SQLException {
		
		extracted();
		
		return materie;
	}

	private void extracted() throws SQLException {
		this.materie.clear();//svuoto l'AL
		
		this.statement = db.getConnessione().createStatement();
		this.rs = this.statement.executeQuery("SELECT id, nome from materie");

		while(this.rs.next()) {
			int id = this.rs.getInt(1);
			String nome = this.rs.getString(2);
			this.materie.add(new Materia(id, nome)); //aggiungo all'AL la materia
		}
	}
	
	
	
	
}
