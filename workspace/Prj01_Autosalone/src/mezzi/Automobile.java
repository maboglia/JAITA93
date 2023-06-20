package mezzi;

public class Automobile {
	
	public String marca;
	public String modello;
	public int anno;
	public double prezzo;
	
	
	
	public Automobile(String marca, String modello, int anno, double prezzo) {
		this.marca = marca;
		this.modello = modello;
		this.anno = anno;
		this.prezzo = prezzo;
	}



	public String stampaLibretto() {
		return "Libretto:"
				+ "\n"
				+ "marca: " + marca
				+ "\n"
				+ "modello: " + modello
				+ "\n"
				+ "anno: " + anno
				+ "\n"
				+ "prezzo: " + prezzo
				;
	}
	
	

}
