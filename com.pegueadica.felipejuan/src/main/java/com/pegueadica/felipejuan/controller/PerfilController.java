package com.pegueadica.felipejuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pegueadica.felipejuan.model.Perfil;
import com.pegueadica.felipejuan.repository.PerfilRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/perfil")
public class PerfilController {
	
	@Autowired
	private PerfilRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Perfil>> getAllPerfis()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Perfil> findByIdPerfil(@PathVariable long id)
	{
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Perfil> post(@RequestBody Perfil perfil)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(perfil));
	}
	
	@PutMapping
	public ResponseEntity<Perfil> put(@RequestBody Perfil perfil)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(perfil));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		repository.deleteById(id);
	}
}