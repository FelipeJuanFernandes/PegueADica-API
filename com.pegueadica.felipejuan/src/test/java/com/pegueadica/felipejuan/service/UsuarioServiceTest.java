package com.pegueadica.felipejuan.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.pegueadica.felipejuan.model.Usuario;
import com.pegueadica.felipejuan.model.UsuarioLogin;
import com.pegueadica.felipejuan.repository.UsuarioRepository;

public class UsuarioServiceTest {

    private UsuarioService usuarioService;
    private UsuarioRepository usuarioRepository;

    @BeforeEach
    public void setUp() {
        usuarioRepository = mock(UsuarioRepository.class);
        usuarioService = new UsuarioService();
    }

    @Test
    public void testCadastrarUsuario() {
        // Create a test user
        String username = "testuser";
        String password = "testpassword";
        Usuario usuario = new Usuario();
        usuario.setUsuario(username);
        usuario.setSenha(password);

        // Configure the repository mock
        when(usuarioRepository.save(usuario)).thenReturn(usuario);

    }

    @Test
    public void testLogar_ExistingUser() {
        // Create a test user login
        String username = "testuser";
        String password = "testpassword";
        UsuarioLogin userLogin = new UsuarioLogin();
        userLogin.setUsuario(username);
        userLogin.setSenha(password);

        // Create a test user
        Usuario usuario = new Usuario();
        usuario.setUsuario(username);
        String encodedPassword = new BCryptPasswordEncoder().encode(password);
        usuario.setSenha(encodedPassword);

        // Configure the repository mock
        when(usuarioRepository.findByUsuario(username)).thenReturn(Optional.of(usuario));

    }

    @Test
    public void testLogar_NonExistingUser() {
        // Create a test user login
        String username = "nonexistinguser";
        String password = "testpassword";
        UsuarioLogin userLogin = new UsuarioLogin();
        userLogin.setUsuario(username);
        userLogin.setSenha(password);

        // Configure the repository mock
        when(usuarioRepository.findByUsuario(username)).thenReturn(Optional.empty());

        // Call the logar method
        Optional<UsuarioLogin> result = usuarioService.logar(Optional.of(userLogin));

        // Verify the result
        assertNotNull(result);
        assertFalse(result.isPresent());
    }
}
