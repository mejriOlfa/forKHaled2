package com.modificationAdresse.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.modificationAdresse.model.Contrat;

@Repository
public interface ContratRepository extends CrudRepository<Contrat, Long>{

	
}
