package com.pegueadica.felipejuan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioLoginTest {

    private UsuarioLogin usuarioLogin;

    @BeforeEach
    public void setUp() {
        usuarioLogin = new UsuarioLogin();
    }

    @Test
    public void testGetNome() {
        String nome = "John Doe";
        usuarioLogin.setNome(nome);
        Assertions.assertEquals(nome, usuarioLogin.getNome());
    }

    @Test
    public void testGetId() {
        long id = 1;
        usuarioLogin.setId(id);
        Assertions.assertEquals(id, usuarioLogin.getId());
    }

    @Test
    public void testGetEmail() {
        String email = "john.doe@example.com";
        usuarioLogin.setEmail(email);
        Assertions.assertEquals(email, usuarioLogin.getEmail());
    }

    @Test
    public void testGetUsuario() {
        String usuarioName = "johndoe";
        usuarioLogin.setUsuario(usuarioName);
        Assertions.assertEquals(usuarioName, usuarioLogin.getUsuario());
    }

    @Test
    public void testGetSenha() {
        String senha = "password123";
        usuarioLogin.setSenha(senha);
        Assertions.assertEquals(senha, usuarioLogin.getSenha());
    }

    @Test
    public void testGetToken() {
        String token = "abcdef123456";
        usuarioLogin.setToken(token);
        Assertions.assertEquals(token, usuarioLogin.getToken());
    }

    @Test
    public void testIsAdmin() {
        boolean isAdmin = true;
        usuarioLogin.setAdmin(isAdmin);
        Assertions.assertEquals(isAdmin, usuarioLogin.isAdmin());
    }
}
