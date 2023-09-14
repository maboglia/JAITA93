package view;

import model.Studente;

public class ViewRegistro {

	
	public String stampaStudente(Studente s) {
		return "\n******************\n" 
				+ s.getNome()
				+ "\n*****************\n";
	}
	
	
}
