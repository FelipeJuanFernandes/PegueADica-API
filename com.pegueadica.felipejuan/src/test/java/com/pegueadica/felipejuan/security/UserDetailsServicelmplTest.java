package com.pegueadica.felipejuan.security;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pegueadica.felipejuan.model.Usuario;
import com.pegueadica.felipejuan.repository.UsuarioRepository;

public class UserDetailsServicelmplTest {

    private UserDetailsServicelmpl userDetailsService;
    private UsuarioRepository usuarioRepository;

    @BeforeEach
    public void setUp() {
        usuarioRepository = mock(UsuarioRepository.class);
        userDetailsService = new UserDetailsServicelmpl();
    }

    @Test
    public void testLoadUserByUsername_ExistingUser() {
        // Create a test user
        String username = "testuser";
        String password = "testpassword";

        Usuario user = new Usuario();
        user.setUsuario(username);
        user.setSenha(password);

        // Configure the repository mock
        when(usuarioRepository.findByNome(username)).thenReturn(Optional.of(user));

    }

    @Test
    public void testLoadUserByUsername_NonExistingUser() {
        // Create a test user
        String username = "nonexistinguser";

        // Configure the repository mock
        when(usuarioRepository.findByNome(username)).thenReturn(Optional.empty());

    }
}
