package games;

public class Dado {

	public int facce;
	 
	public Dado() {
		
		this.facce= 6;
		
	}
	
	public int launch() {
		int i = 1;
		
		//qui devo calcolare un valore casuale tra 1 e il 
		//numero delle facce del mio dato
		
		double casuale= Math.random();  //Casuale tra 0.0 e <1
		i=(int)(casuale*facce)+1;
		
		return i;	
		
	}
	 

	
	
}
