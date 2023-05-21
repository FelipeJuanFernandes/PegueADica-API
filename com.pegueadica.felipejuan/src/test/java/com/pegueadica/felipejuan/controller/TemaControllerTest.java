package com.pegueadica.felipejuan.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pegueadica.felipejuan.model.Tema;
import com.pegueadica.felipejuan.repository.TemaRepository;

public class TemaControllerTest {

    private TemaController temaController;
    private TemaRepository temaRepository;

    @BeforeEach
    public void setUp() {
        temaRepository = mock(TemaRepository.class);
        temaController = new TemaController();
    }

    @Test
    public void testGetAllTema() {
        // Create a list of test temas
        List<Tema> temas = Arrays.asList(
                new Tema(),
                new Tema(),
                new Tema()
        );

        // Configure the repository mock
        when(temaRepository.findAll()).thenReturn(temas);


    }

    @Test
    public void testFindByIdTema_ExistingId() {
        // Create a test tema
        long temaId = 1L;
        Tema tema = new Tema();

        // Configure the repository mock
        when(temaRepository.findById(temaId)).thenReturn(Optional.of(tema));


    }

    @Test
    public void testFindByIdTema_NonExistingId() {
        // Create a test tema ID
        long temaId = 1L;

        // Configure the repository mock
        when(temaRepository.findById(temaId)).thenReturn(Optional.empty());

    }

    @Test
    public void testGetByNome() {
        // Create a test nome
        String nome = "Tema";

        // Create a list of test temas
        List<Tema> temas = Arrays.asList(
                new Tema(),
                new Tema(),
                new Tema()
        );

        // Configure the repository mock
        when(temaRepository.findAllByNomeContainingIgnoreCase(nome)).thenReturn(temas);


    }

    @Test
    public void testPost() {
        // Create a test tema
        Tema tema = new Tema();

        // Configure the repository mock
        when(temaRepository.save(tema)).thenReturn(tema);


    }

    @Test
    public void testPut() {
        // Create a test tema
        Tema tema = new Tema();

        // Configure the repository mock
        when(temaRepository.save(tema)).thenReturn(tema);


    }


}

