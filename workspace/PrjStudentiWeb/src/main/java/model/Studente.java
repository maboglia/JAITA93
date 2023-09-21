package model;

public class Studente implements Comparable<Studente>{

	private int id;
	private String nome;

	

	public Studente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + "]";
	}



	@Override
	public int compareTo(Studente altro) {
		// TODO Auto-generated method stub
		return altro.nome.compareTo(this.nome);
	}
	
	


	
	
}
