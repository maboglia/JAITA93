package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.boglia.entities.FilmInSala;

public interface FilmInSalaDAO extends JpaRepository<FilmInSala, Integer> {

}
