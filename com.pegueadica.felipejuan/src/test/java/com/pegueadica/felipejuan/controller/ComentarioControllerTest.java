package com.pegueadica.felipejuan.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.pegueadica.felipejuan.model.Comentario;
import com.pegueadica.felipejuan.repository.ComentarioRepository;

public class ComentarioControllerTest {

	private ComentarioController comentarioController;
	private ComentarioRepository comentarioRepository;

	@BeforeEach
	public void setUp() {
		comentarioRepository = mock(ComentarioRepository.class);
		comentarioController = new ComentarioController();
	}

	@Test
	public void testGetAllComentarios() {
		// Create a list of test comments
		List<Comentario> comentarios = Arrays.asList(new Comentario(), new Comentario(), new Comentario());

		// Configure the repository mock
		when(comentarioRepository.findAll()).thenReturn(comentarios);

	}

	@Test
	public void testGetComentariosByPost() {
		// Create a test post ID
		long postId = 1L;

		// Create a list of test comments for the post
		List<Comentario> comentarios = Arrays.asList(new Comentario(), new Comentario(), new Comentario());

		// Configure the repository mock
		when(comentarioRepository.findByPostagemId(postId)).thenReturn(comentarios);

	}

	@Test
	public void testFindByIdPostagem_ExistingId() {
		// Create a test comment
		long commentId = 1L;
		Comentario comentario = new Comentario();

		// Configure the repository mock
		when(comentarioRepository.findById(commentId)).thenReturn(Optional.of(comentario));

	}

	@Test
	public void testFindByIdPostagem_NonExistingId() {
		// Create a test comment ID
		long commentId = 1L;

		// Configure the repository mock
		when(comentarioRepository.findById(commentId)).thenReturn(Optional.empty());

	}

	@Test
	public void testPost() {
		// Create a test comment
		Comentario comentario = new Comentario();

	}
}