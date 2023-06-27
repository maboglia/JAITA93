package controlflow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListaSpesa {

	public static void main(String[] args) {
		
		File f = new File("documenti/canzoni.txt") ;
		
		try {
			Scanner input = new Scanner(f);
			
			while(input.hasNextLine()) {
				
				System.out.println(input.nextLine());
				
			}
			
			
		} catch (FileNotFoundException e) {
			System.err.println("File non trovato, verifica il nome file");
		}

	}

}
