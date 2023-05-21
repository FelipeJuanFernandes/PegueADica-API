package com.pegueadica.felipejuan.controller;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.pegueadica.felipejuan.controller.InteresseController;
import com.pegueadica.felipejuan.model.Interesse;
import com.pegueadica.felipejuan.repository.InteresseRepository;

public class InteresseControllerTest {

    private InteresseController interesseController;
    private InteresseRepository interesseRepository;

    @BeforeEach
    public void setUp() {
        interesseRepository = mock(InteresseRepository.class);
        interesseController = new InteresseController();
    }

    @Test
    public void testGetAllInteresse() {
        // Create a list of test interests
        List<Interesse> interesses = Arrays.asList(
                new Interesse(),
                new Interesse(),
                new Interesse()
        );

        // Configure the repository mock
        when(interesseRepository.findAll()).thenReturn(interesses);

    }

    @Test
    public void testFindByIdInteresse_ExistingId() {
        // Create a test interest
        long interestId = 1L;
        Interesse interesse = new Interesse();

        // Configure the repository mock
        when(interesseRepository.findById(interestId)).thenReturn(Optional.of(interesse));

    }

    @Test
    public void testFindByIdInteresse_NonExistingId() {
        // Create a test interest ID
        long interestId = 1L;

        // Configure the repository mock
        when(interesseRepository.findById(interestId)).thenReturn(Optional.empty());

        
    }

    @Test
    public void testGetByNome() {
        // Create a test name
        String nome = "interest";

        // Create a list of test interests with matching name
        List<Interesse> interesses = Arrays.asList(
                new Interesse(),
                new Interesse()
        );

        // Configure the repository mock
        when(interesseRepository.findAllByNomeContainingIgnoreCase(nome)).thenReturn(interesses);

    }

    @Test
    public void testPost() {
        // Create a test interest
        Interesse interesse = new Interesse();

        // Configure the repository mock
        when(interesseRepository.save(interesse)).thenReturn(interesse);

    }

    @Test
    public void testPut() {
        // Create a test interest
        Interesse interesse = new Interesse();

        // Configure the repository mock
        when(interesseRepository.save(interesse)).thenReturn(interesse);


    }

}
