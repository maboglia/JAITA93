package spotify;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Canzoni {

	public static void main(String[] args) {
		
		File f = new File("files/canzoni.txt");
		
		ArrayList<Canzone> jukebox = new ArrayList<>();
		
		try {
			Scanner input = new Scanner(f);
			
			while (input.hasNextLine()) {
				
				String rigaIntera = input.nextLine();
				String[] rigaSpezzata = rigaIntera.split("\\|");
				String cantante = rigaSpezzata[0];
				String titolo = rigaSpezzata[1];
				
				Canzone temp = new Canzone(cantante, titolo);
				jukebox.add(temp);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Il jukebox contiene " + jukebox.size() + " canzoni");
		
		Random random = new Random();
		
		int casuale = random.nextInt(jukebox.size() );
		
		System.out.println("Adesso eseguiamo il brano");
		System.out.println(jukebox.get(casuale));

	}

}
