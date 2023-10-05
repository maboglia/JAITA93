package it.boglia.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "corsi")
public class Corso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//@Column(name="firstName")
	private String nome;
	private int crediti;
	
	@OneToMany(mappedBy = "corso")
    Set<Esame> esami;
	
	@JsonIgnore
	public Set<Esame> getEsami() {
		return esami;
	}
//	public void setEsami(Set<Esame> esami) {
//		this.esami = esami;
//	}
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
	public int getCrediti() {
		return crediti;
	}
	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}

	
	
	
}
