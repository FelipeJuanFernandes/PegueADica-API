package com.pegueadica.felipejuan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TemaTest {

    private Tema tema;
    private List<Postagem> postagens;

    @BeforeEach
    public void setUp() {
        tema = new Tema();
        postagens = new ArrayList<>();
    }

    @Test
    public void testGetId() {
        long id = 1;
        tema.setId(id);
        Assertions.assertEquals(id, tema.getId());
    }

    @Test
    public void testGetNome() {
        String nome = "Technology";
        tema.setNome(nome);
        Assertions.assertEquals(nome, tema.getNome());
    }

    @Test
    public void testGetDescricao() {
        String descricao = "Lorem ipsum dolor sit amet";
        tema.setDescricao(descricao);
        Assertions.assertEquals(descricao, tema.getDescricao());
    }

    @Test
    public void testGetQnt_posts() {
        long qntPosts = 10;
        tema.setQnt_posts(qntPosts);
        Assertions.assertEquals(qntPosts, tema.getQnt_posts());
    }

    @Test
    public void testGetPostagem() {
        tema.setPostagem(postagens);
        Assertions.assertEquals(postagens, tema.getPostagem());
    }
}
