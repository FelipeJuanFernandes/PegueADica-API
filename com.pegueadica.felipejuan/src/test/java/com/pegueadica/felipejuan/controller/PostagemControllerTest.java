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

import com.pegueadica.felipejuan.model.Postagem;
import com.pegueadica.felipejuan.repository.PostagemRepository;

public class PostagemControllerTest {

    private PostagemController postagemController;
    private PostagemRepository postagemRepository;

    @BeforeEach
    public void setUp() {
        postagemRepository = mock(PostagemRepository.class);
        postagemController = new PostagemController();
    }

    @Test
    public void testGetAllPostagem() {
        // Create a list of test postagens
        List<Postagem> postagens = Arrays.asList(
                new Postagem(),
                new Postagem(),
                new Postagem()
        );

        // Configure the repository mock
        when(postagemRepository.findAll()).thenReturn(postagens);

    }

    @Test
    public void testFindByIdPostagem_ExistingId() {
        // Create a test postagem
        long postagemId = 1L;
        Postagem postagem = new Postagem();

        // Configure the repository mock
        when(postagemRepository.findById(postagemId)).thenReturn(Optional.of(postagem));

    }

    @Test
    public void testFindByIdPostagem_NonExistingId() {
        // Create a test postagem ID
        long postagemId = 1L;

        // Configure the repository mock
        when(postagemRepository.findById(postagemId)).thenReturn(Optional.empty());

    }

    @Test
    public void testGetByTitulo() {
        // Create a test titulo
        String titulo = "Postagem";

        // Create a list of test postagens
        List<Postagem> postagens = Arrays.asList(
                new Postagem(),
                new Postagem(),
                new Postagem()
        );

        // Configure the repository mock
        when(postagemRepository.findAllByTituloContainingIgnoreCase(titulo)).thenReturn(postagens);


    }

    @Test
    public void testPost() {
        // Create a test postagem
        Postagem postagem = new Postagem();

        // Configure the repository mock
        when(postagemRepository.save(postagem)).thenReturn(postagem);


    }

    @Test
    public void testPut() {
        // Create a test postagem
        Postagem postagem = new Postagem();

        // Configure the repository mock
        when(postagemRepository.save(postagem)).thenReturn(postagem);


    }


}

