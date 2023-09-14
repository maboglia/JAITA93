package model;

public class Studente implements Comparable<Studente>{

	private String nome;

	public Studente() {
		// TODO Auto-generated constructor stub
	}
	
	public Studente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + "]";
	}

	@Override
	public int compareTo(Studente altro) {
		// TODO Auto-generated method stub
		return altro.nome.compareTo(this.nome);
	}
	
	
	
}
