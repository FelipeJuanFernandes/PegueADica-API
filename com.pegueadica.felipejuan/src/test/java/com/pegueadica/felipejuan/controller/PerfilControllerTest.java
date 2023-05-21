package com.pegueadica.felipejuan.controller;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pegueadica.felipejuan.model.Perfil;
import com.pegueadica.felipejuan.repository.PerfilRepository;

public class PerfilControllerTest {

    private PerfilController perfilController;
    private PerfilRepository perfilRepository;

    @BeforeEach
    public void setUp() {
        perfilRepository = mock(PerfilRepository.class);
        perfilController = new PerfilController();
    }

    @Test
    public void testGetAllPerfis() {
        // Create a list of test profiles
        List<Perfil> perfis = Arrays.asList(
                new Perfil(),
                new Perfil(),
                new Perfil()
        );

        // Configure the repository mock
        when(perfilRepository.findAll()).thenReturn(perfis);


    }

    @Test
    public void testFindByIdPerfil_ExistingId() {
        // Create a test profile
        long perfilId = 1L;
        Perfil perfil = new Perfil();

        // Configure the repository mock
        when(perfilRepository.findById(perfilId)).thenReturn(Optional.of(perfil));


    }

    @Test
    public void testFindByIdPerfil_NonExistingId() {
        // Create a test profile ID
        long perfilId = 1L;

        // Configure the repository mock
        when(perfilRepository.findById(perfilId)).thenReturn(Optional.empty());


    }

    @Test
    public void testPost() {
        // Create a test profile
        Perfil perfil = new Perfil();

        // Configure the repository mock
        when(perfilRepository.save(perfil)).thenReturn(perfil);

    }

    @Test
    public void testPut() {
        // Create a test profile
        Perfil perfil = new Perfil();

        // Configure the repository mock
        when(perfilRepository.save(perfil)).thenReturn(perfil);


    }


}

