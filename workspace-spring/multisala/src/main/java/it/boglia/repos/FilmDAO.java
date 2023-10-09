package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.boglia.entities.Film;

public interface FilmDAO extends JpaRepository<Film, Integer> {

}
