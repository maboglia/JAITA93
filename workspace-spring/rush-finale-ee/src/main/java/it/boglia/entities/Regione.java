package it.boglia.entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Regione {

	private String nome;
	private int popolazione;
	
}
