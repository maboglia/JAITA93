package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.boglia.entities.Serie;

public interface SerieDAO extends JpaRepository<Serie, Integer> {

}
