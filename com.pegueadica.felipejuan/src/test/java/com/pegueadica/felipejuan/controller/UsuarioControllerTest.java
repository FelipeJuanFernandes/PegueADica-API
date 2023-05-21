package com.pegueadica.felipejuan.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pegueadica.felipejuan.model.Usuario;
import com.pegueadica.felipejuan.model.UsuarioLogin;
import com.pegueadica.felipejuan.repository.UsuarioRepository;

public class UsuarioControllerTest {

    private UsuarioController usuarioController;
    private UsuarioRepository usuarioRepository;
    private Optional<UsuarioLogin> usuarioService;

    @BeforeEach
    public void setUp() {
        usuarioRepository = mock(UsuarioRepository.class);
        usuarioController = new UsuarioController();
    }

    @Test
    public void testGetAll() {
        // Create a list of test usuarios
        List<Usuario> usuarios = Arrays.asList(
                new Usuario(),
                new Usuario(),
                new Usuario()
        );

        // Configure the repository mock
        when(usuarioRepository.findAll()).thenReturn(usuarios);

    }

    @Test
    public void testGetById_ExistingId() {
        // Create a test usuario
        long usuarioId = 1L;
        Usuario usuario = new Usuario();

        // Configure the repository mock
        when(usuarioRepository.findById(usuarioId)).thenReturn(Optional.of(usuario));


    }

    @Test
    public void testGetById_NonExistingId() {
        // Create a test usuario ID
        long usuarioId = 1L;

        // Configure the repository mock
        when(usuarioRepository.findById(usuarioId)).thenReturn(Optional.empty());


    }

    @Test
    public void testGetByName() {
        // Create a test nome
        String nome = "Usuario";

        // Create a test usuario
        Usuario usuario = new Usuario();

        // Configure the repository mock
        when(usuarioRepository.findByNome(nome)).thenReturn(Optional.of(usuario));

    }

    @Test
    public void testPost() {
        // Create a test usuario
        Usuario usuario = new Usuario();

        // Configure the repository mock
        when(usuarioRepository.save(usuario)).thenReturn(usuario);


    }

    @Test
    public void testPut() {
        // Create a test usuario
        Usuario usuario = new Usuario();

        // Configure the repository mock
        when(usuarioRepository.save(usuario)).thenReturn(usuario);


    }
}




