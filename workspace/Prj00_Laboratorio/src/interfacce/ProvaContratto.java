package interfacce;

import java.util.ArrayList;

public class ProvaContratto {

	public static void main(String[] args) {
		
		Contratto negozi = new Negozio();
		Contratto piloti = new PilotaF1();
		
		ArrayList<Contratto> contrattualizzati = new ArrayList<>();
		
		contrattualizzati.add(negozi);
		contrattualizzati.add(piloti);
		
		for (Contratto contratto : contrattualizzati) {
			contratto.brandizzare();
		}

	}

}
