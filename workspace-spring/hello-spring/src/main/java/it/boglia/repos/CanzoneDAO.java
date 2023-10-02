package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.boglia.entities.Canzone;

@Repository
public interface CanzoneDAO extends JpaRepository<Canzone, Integer> {

}
