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

	//CRUD
	
	//C - CREATE
	
	public Materia addMateria(String nome) {
		
		Materia m = new Materia(0, nome);
		
		try {
			this.statement = db.getConnessione().createStatement();
			this.statement.execute("INSERT INTO materie (nome) VALUES ('"+m.getNome()+"')");
			
			if (this.statement.getUpdateCount() == 1 )
				System.out.println("RECORD INSERITO!!!");
			else
				System.out.println("RECORD NON INSERITO!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m;
		
	}
	
	
	//R - READ (RETRIEVE) - getAll getMateriaById(int id)
	
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
	
	//U - UPDATE
	
	public void updateMateria(String altroNome, int idRecord) {
		
		try {
			this.statement = db.getConnessione().createStatement();
			this.statement.execute("UPDATE materie set nome = '"+altroNome+"' WHERE id = " + idRecord);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//D - DELETE
	
	public void deleteMateria(int id) {
		try {
			this.statement = db.getConnessione().createStatement();
			this.statement.execute("DELETE FROM materie WHERE id = " + id);
			
			if (this.statement.getUpdateCount() == 1 )
				System.out.println("RECORD ELIMINATO!!!");
			else
				System.out.println("RECORD NON ELIMINATO!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
