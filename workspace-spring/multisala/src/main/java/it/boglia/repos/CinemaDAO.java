package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.boglia.entities.Cinema;

public interface CinemaDAO extends JpaRepository<Cinema, Integer> {

}
