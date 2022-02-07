package org.sigaBem.repository;

import java.util.Optional;

import org.sigaBem.model.Cep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CepRepository extends JpaRepository<Cep, Long>{
	//public Optional<Cep> findByCep(Long cep);
}
