package controlflow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Studenti2 {

	public static void main(String[] args) {
		

		File f = new File("documenti/studenti.txt");
		File studentiList = new File("documenti/studenti.html"); 
		
		
		try {
			Scanner input = new Scanner(f);
			PrintWriter pennarello = new PrintWriter(studentiList);
			
			pennarello.println("<ul>");
			while (input.hasNextLine()) {//parte il ciclo
				
				String studente = input.nextLine();
				pennarello.println("<li>" + studente + "</li>");
				
				
				
			}//chiude il ciclo
			pennarello.println("</ul>");
			pennarello.close();
			
			System.out.println("programma terminato");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
