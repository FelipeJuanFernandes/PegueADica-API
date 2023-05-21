package com.pegueadica.felipejuan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UsuarioTest {

    private Usuario usuario;
    private List<Postagem> postagens;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario();
        postagens = new ArrayList<>();
    }

    @Test
    public void testGetId() {
        long id = 1;
        usuario.setId(id);
        Assertions.assertEquals(id, usuario.getId());
    }

    @Test
    public void testGetNome() {
        String nome = "John Doe";
        usuario.setNome(nome);
        Assertions.assertEquals(nome, usuario.getNome());
    }

    @Test
    public void testGetEmail() {
        String email = "john.doe@example.com";
        usuario.setEmail(email);
        Assertions.assertEquals(email, usuario.getEmail());
    }

    @Test
    public void testGetUsuario() {
        String usuarioName = "johndoe";
        usuario.setUsuario(usuarioName);
        Assertions.assertEquals(usuarioName, usuario.getUsuario());
    }

    @Test
    public void testGetSenha() {
        String senha = "password123";
        usuario.setSenha(senha);
        Assertions.assertEquals(senha, usuario.getSenha());
    }

    @Test
    public void testGetCategoria() {
        String categoria = "Category";
        usuario.setCategoria(categoria);
        Assertions.assertEquals(categoria, usuario.getCategoria());
    }

    @Test
    public void testGetFoto() {
        String foto = "profile.jpg";
        usuario.setFoto(foto);
        Assertions.assertEquals(foto, usuario.getFoto());
    }

    @Test
    public void testIsAdmin() {
        boolean isAdmin = true;
        usuario.setAdmin(isAdmin);
        Assertions.assertEquals(isAdmin, usuario.isAdmin());
    }

    @Test
    public void testGetPostagem() {
        usuario.setPostagem(postagens);
        Assertions.assertEquals(postagens, usuario.getPostagem());
    }
}
