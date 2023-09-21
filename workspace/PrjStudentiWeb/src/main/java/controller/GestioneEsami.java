package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import database.EsameDAO;
import database.MateriaDAO;
import database.StudentiDB;
import model.Esame;
import model.Materia;
import model.Studente;
import view.ViewRegistro;

public class GestioneEsami {

	private ArrayList<Studente> studenti;
	private ArrayList<Materia> insegnamenti;
	private ArrayList<Esame> esami;
	
	private StudentiDB db;
	private MateriaDAO dao;
	private EsameDAO daoEsame;
	
	public GestioneEsami() {
		this.studenti = new ArrayList<>();
		this.insegnamenti= new ArrayList<>();
		this.esami = new ArrayList<>();
		this.db = new StudentiDB();
		this.dao = new MateriaDAO();
		this.daoEsame = new EsameDAO();
	}
	
	public void modificaMateria(String nuovoNome, int id) {
		this.dao.updateMateria(nuovoNome.toUpperCase(), id);
	}
	
	public void eliminaMateria(int id) {
		this.dao.deleteMateria(id);
	}
	
	public void inizializzaDalDatabase() {
		this.db.inizializza();
		;
		System.out.println(this.db.getStudenti());
	}
	
	public void addStudente(Studente s) {
		this.studenti.add(s);//aggiunge uno studente alla collezione
	}
	
	public void addMateria(String nomeMateria) {
		this.dao.addMateria(nomeMateria);
	}
	
	public void addEsame(Esame e) {
		//logica per aggiungere esame al db
		
		//1 collego al DAO
		//2 chiamo il metodo addEsame passando i parametri
		this.daoEsame.addEsame(e.getStudente(), e.getMateria(), e.getVoto());
		
		
		//this.esami.add(e);
	}

	public ArrayList<Studente> getStudenti() {
		//Collections.sort(studenti);
		
		return this.db.getStudenti();
		
		
	}

	public ArrayList<Materia> getInsegnamenti() {
		
		try {
			this.insegnamenti = this.dao.getMaterie();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return insegnamenti;
	}

	public ArrayList<Esame> getEsami() {
		return esami;
	}
	
	public String stampaStudente(Studente s) {
		ViewRegistro view = new ViewRegistro();
		return view.stampaStudente(s);
	}
	
	
	
	
	
}
