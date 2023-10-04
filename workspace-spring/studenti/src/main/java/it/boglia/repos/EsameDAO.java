package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.boglia.entities.Esame;

@Repository 
public interface EsameDAO extends JpaRepository<Esame, Integer>{

}
