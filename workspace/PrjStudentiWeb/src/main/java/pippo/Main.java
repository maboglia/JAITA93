package pippo;

import java.util.ArrayList;

import controller.GestioneEsami;
import controller.LeggiFile;
import model.Esame;
import model.Materia;
import model.Studente;

public class Main {

	public static void main(String[] args) {

//		Studente s = new Studente("Oscar");
//		Materia m = new Materia("SQL");
//		
//		ArrayList<Studente> studentiLetti = LeggiFile.leggiFileStudenti("files/studenti.txt");
		
		GestioneEsami gestionale1 = new GestioneEsami();
		
		//caricaStudenti(studentiLetti, gestionale1);
		
//		gestionale1.inizializzaDalDatabase();
//		
//		for (Studente studente : gestionale1.getStudenti()) {
//			System.out.println(gestionale1.stampaStudente(studente));
//		}
//		
//		for (Materia m : gestionale1.getInsegnamenti()) {
//			System.out.println(m);
//		}
		
		//gestionale1.addMateria("Filosofia JAVA");
		//gestionale1.eliminaMateria(7);
//		gestionale1.modificaMateria("c#", 6);
//		gestionale1.modificaMateria("c++", 8);
//		gestionale1.modificaMateria("dart", 9);

		Materia m = gestionale1.getInsegnamenti().get(1);
		Studente s = gestionale1.getStudenti().get(1);
		int voto = 28;
		Esame e = new Esame(s, m, voto);
		gestionale1.addEsame(e);
		
		
	}//fine metodo main

	private static void caricaStudenti(ArrayList<Studente> studentiLetti, GestioneEsami gestionale1) {
		for (Studente studente : studentiLetti) {
			gestionale1.addStudente(studente);
		}
	}

	
	
}
