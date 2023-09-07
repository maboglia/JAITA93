package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeggiFile {

	public static void main(String[] args) {
		File f = new File("files/frutti.txt"); 
		File out = new File("files/frutti_maiuscoli.txt");
				
		try {
			int a = 7/0;
			//Scanner input = new Scanner(f);
			PrintWriter pw = new PrintWriter(out);
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String riga; 
			
			while( (riga = br.readLine()) != null ) {
				//= input.nextLine();
				if (riga.equals("fragole"))
					throw new MiaEccezione("si capisce?");
				System.out.println(riga);
				pw.println(riga.toUpperCase());
				
			}
			pw.close();
			br.close();
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MiaEccezione e) {
			// TODO Auto-generated catch block
			System.err.println("AIUTOOOOOOOOOOOO");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.err.println("Generica eccezione");
			System.err.println(e.getMessage());
		}
		
		System.out.println("Programma terminato");
	}

}
