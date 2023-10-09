import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

class Studente {
	
	String nome, cognome;

	public Studente() {
		// TODO Auto-generated constructor stub
	}
	
	public Studente(String nome) {
		this.nome = nome.split(",")[0];
		this.cognome = nome.split(",")[1];
	}
	
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
}


public class Prova {

	public static void main(String[] args) {
		
		
		try {
			//Stream<String> lines = Files.lines(Paths.get("studenti.txt"));
			
//			lines
//				.map(s -> {
//					String[] array = s.split(",");
//					Studente stud = new Studente(array[0], array[1]);
//					return stud;
//				})
//				.forEach(System.out::println);
			
			
			List<Studente> list = Files
				.lines(Paths.get("studenti.txt"))
				.map(Studente::new)
				.toList();
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
