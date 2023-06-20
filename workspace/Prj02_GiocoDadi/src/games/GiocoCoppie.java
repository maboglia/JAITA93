package games;

public class GiocoCoppie {

	public static void main(String[] args) {
		
		Dado dado1= new Dado();
		Dado dado2= new Dado();
		
		final int PARTITE= 1000_000_000;
		int vittorie=0;
		long start=System.currentTimeMillis();
		for (int i = 0; i < PARTITE; i++) {
			
			int res1= dado1.launch();
			int res2= dado2.launch();
			
			if (res1==res2) {
//				System.out.println("Hai vinto!");
//				System.out.println("Con una coppia di "+ res1);
				vittorie++;
				
		
			}
		
			
		}
		long stop=System.currentTimeMillis();
		
		System.out.println("Hai giocato "+ PARTITE +" volte");
		System.out.println("Hai vinto "+ vittorie+" volte");		
		double percentuale= (double)vittorie/PARTITE*100;
		System.out.println("La tua percentuale è "+ percentuale);
		System.out.println("L' elaborazione è durata "+ (stop-start));
		
	

	}

}
