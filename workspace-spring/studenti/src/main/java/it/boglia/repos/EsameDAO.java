package it.boglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.boglia.entities.Corso;
import it.boglia.entities.Esame;
import it.boglia.entities.Studente;

@Repository 
public interface EsameDAO extends JpaRepository<Esame, Integer>{

	//derived query
	List<Esame> findByCorso(Corso c);
	List<Esame> findByStudente(Studente s);
	List<Esame> findByVotoBetween(int min, int max);
	
	//native query
//	@Query(nativeQuery = true, name = "select * from studenti where nome like 'm%'")
//	List<Studente> queryCustom();
	
	
}
