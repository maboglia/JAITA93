import java.util.ArrayList;

import controller.GestioneEsami;
import controller.LeggiFile;
import model.Materia;
import model.Studente;

public class Main {

	public static void main(String[] args) {

		Studente s = new Studente("Oscar");
		Materia m = new Materia("SQL");
		
		ArrayList<Studente> studentiLetti = LeggiFile.leggiFileStudenti("files/studenti.txt");
		
		GestioneEsami gestionale1 = new GestioneEsami();
		
		//caricaStudenti(studentiLetti, gestionale1);
		
		gestionale1.inizializzaDalDatabase();
		
		for (Studente studente : gestionale1.getStudenti()) {
			System.out.println(gestionale1.stampaStudente(studente));
		}
		

	}//fine metodo main

	private static void caricaStudenti(ArrayList<Studente> studentiLetti, GestioneEsami gestionale1) {
		for (Studente studente : studentiLetti) {
			gestionale1.addStudente(studente);
		}
	}

	
	
}
