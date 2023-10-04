package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.boglia.entities.Studente;

@Repository 
public interface StudenteDAO extends JpaRepository<Studente, Integer>{

}
