package com.pegueadica.felipejuan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class InteresseTest {

    private Interesse interesse;
    private List<Postagem> postagens;

    @BeforeEach
    public void setUp() {
        interesse = new Interesse();
        postagens = new ArrayList<>();
    }

    @Test
    public void testGetId() {
        long id = 1;
        interesse.setId(id);
        Assertions.assertEquals(id, interesse.getId());
    }

    @Test
    public void testGetNome() {
        String nome = "Teste Interesse";
        interesse.setNome(nome);
        Assertions.assertEquals(nome, interesse.getNome());
    }

    @Test
    public void testGetPostagem() {
        Postagem postagem1 = new Postagem();
        Postagem postagem2 = new Postagem();
        postagens.add(postagem1);
        postagens.add(postagem2);

        interesse.setPostagem(postagens);

        Assertions.assertEquals(postagens, interesse.getPostagem());
    }

    @Test
    public void testSetPostagem() {
        Postagem postagem1 = new Postagem();
        Postagem postagem2 = new Postagem();
        List<Postagem> newPostagens = new ArrayList<>();
        newPostagens.add(postagem1);
        newPostagens.add(postagem2);

        interesse.setPostagem(newPostagens);

        Assertions.assertEquals(newPostagens, interesse.getPostagem());
    }
}
