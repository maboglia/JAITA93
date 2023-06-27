package array;

public class WhileLoop {

	public static void main(String[] args) {
		
		String[] note = {
				"do","re","mi","fa","sol","la","si",
		};
		
		boolean suona = true;
		
		while (suona) {
			
			int casuale = (int) (Math.random() * note.length );
			
			
			System.out.print(note[casuale] + " ");
			
			if (note[casuale].equals("sol") )
				suona = false;
		}
		
		
		
		

	}

}
