package controlflow;

public class TryCatchDemo {

	public static void main(String[] args) {
		
//		String[] colori = {"giallo", "rosso", "verde"};
//		
//		System.out.println(colori[-3]); 
			try {	
				
			int num1 = 7;
			int num2 = 0;

			int divisione = num1 / num2;
			
		} catch (ArithmeticException eccezione) {
			System.err.println("Si è verificata un'eccezione!!!!");
			System.err.println(eccezione.getMessage());
		}
		
		
		
		System.out.println("Programma terminato");
		

	}

}
