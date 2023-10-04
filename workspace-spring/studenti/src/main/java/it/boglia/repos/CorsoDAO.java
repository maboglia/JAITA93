package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.boglia.entities.Corso;

@Repository 
public interface CorsoDAO extends JpaRepository<Corso, Integer>{

}
