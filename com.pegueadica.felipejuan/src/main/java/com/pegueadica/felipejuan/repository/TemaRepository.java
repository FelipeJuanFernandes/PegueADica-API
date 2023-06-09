package com.pegueadica.felipejuan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegueadica.felipejuan.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List<Tema> findAllByNomeContainingIgnoreCase(String nome);
}
