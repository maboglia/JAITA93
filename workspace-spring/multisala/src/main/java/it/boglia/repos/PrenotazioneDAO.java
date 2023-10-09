package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.boglia.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
