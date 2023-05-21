package com.pegueadica.felipejuan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegueadica.felipejuan.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>{

	public List<Perfil> findById(String id);
	
}
