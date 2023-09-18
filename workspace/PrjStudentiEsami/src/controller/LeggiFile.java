package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Studente;

public class LeggiFile {
	
	public static ArrayList<Studente> leggiFileStudenti(String nomeFile){
		File f = new File(nomeFile);
		ArrayList<Studente> tempStudenti = new ArrayList<Studente>();
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String riga = sc.nextLine();
				Studente temp = new Studente(0, riga);
				tempStudenti.add(temp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tempStudenti;
	}

}
