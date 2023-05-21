package com.pegueadica.felipejuan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegueadica.felipejuan.model.Interesse;

@Repository
public interface InteresseRepository extends JpaRepository<Interesse, Long> {

	public List<Interesse> findAllByNomeContainingIgnoreCase(String nome);
	
}
