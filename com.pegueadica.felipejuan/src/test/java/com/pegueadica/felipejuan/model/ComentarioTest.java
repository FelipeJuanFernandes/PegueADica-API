package com.pegueadica.felipejuan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class ComentarioTest {

    private Comentario comentario;
    private Postagem postagem;

    @BeforeEach
    public void setUp() {
        postagem = new Postagem();
        comentario = new Comentario("Test comment", new Date(), postagem);
    }

    @Test
    public void testGetId() {
        long id = 1;
        comentario.setId(id);
        Assertions.assertEquals(id, comentario.getId());
    }

    @Test
    public void testGetComentario() {
        String comment = "Test comment";
        Assertions.assertEquals(comment, comentario.getComentario());
    }

    @Test
    public void testSetComentario() {
        String comment = "Updated comment";
        comentario.setComentario(comment);
        Assertions.assertEquals(comment, comentario.getComentario());
    }

    @Test
    public void testGetDate() {
        Date date = new Date();
        Assertions.assertEquals(date, comentario.getDate());
    }

    @Test
    public void testSetDate() {
        Date date = new Date();
        comentario.setDate(date);
        Assertions.assertEquals(date, comentario.getDate());
    }

    @Test
    public void testGetPostagem() {
        Assertions.assertEquals(postagem, comentario.getPostagem());
    }

    @Test
    public void testSetPostagem() {
        Postagem newPostagem = new Postagem();
        comentario.setPostagem(newPostagem);
        Assertions.assertEquals(newPostagem, comentario.getPostagem());
    }
}
