package controlflow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Studenti {

	public static void main(String[] args) {
		

		File f = new File("documenti/studenti.txt");
		int assenti = 0;
		int presenti = 0;
		
		
		try {
			Scanner input = new Scanner(f);
			Scanner prof = new Scanner(System.in);
			
			while (input.hasNextLine()) {
				
				String studente = input.nextLine();
				System.out.println("E' presente lo studente " + studente );
				String risposta = prof.nextLine();
				
				if (risposta.equals("s")) {
					presenti++;
				} else {
					assenti++;
				}
				
			}
			
			System.out.println("Sono presenti " + presenti);
			System.out.println("Sono assenti " + assenti);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
