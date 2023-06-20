package gestione;

import mezzi.Automobile;

public class Vendita {

	public static void main(String[] args) {
		
		
		
		Automobile a1 = new Automobile("Fiat", "Panda", 2012, 1550);
		Automobile a2 = new Automobile("Renault", "Twingo", 2020, 10500);
		
		
		System.out.println(a1.stampaLibretto());		
		System.out.println(a2.stampaLibretto());
		
//		Automobile a3 = a2;
//		System.out.println(a3);
		
	}

}
