package it.boglia.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import it.boglia.entities.Provincia;

public interface ProvinciaDAO extends JpaRepository<Provincia, Integer> {

}
