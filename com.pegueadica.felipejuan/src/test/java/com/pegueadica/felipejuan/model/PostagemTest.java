package com.pegueadica.felipejuan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostagemTest {

    private Postagem postagem;
    private Usuario usuario;
    private Tema tema;
    private Interesse interesse;
    private List<Comentario> comentarios;

    @BeforeEach
    public void setUp() {
        postagem = new Postagem();
        usuario = new Usuario();
        tema = new Tema();
        interesse = new Interesse();
        comentarios = new ArrayList<>();
    }

    @Test
    public void testGetId() {
        long id = 1;
        postagem.setId(id);
        Assertions.assertEquals(id, postagem.getId());
    }

    @Test
    public void testGetTipoPostagem() {
        String tipoPostagem = "News";
        postagem.setTipoPostagem(tipoPostagem);
        Assertions.assertEquals(tipoPostagem, postagem.getTipoPostagem());
    }

    @Test
    public void testGetTitulo() {
        String titulo = "Lorem Ipsum";
        postagem.setTitulo(titulo);
        Assertions.assertEquals(titulo, postagem.getTitulo());
    }

    @Test
    public void testGetTextoPostagem() {
        String textoPostagem = "Lorem ipsum dolor sit amet";
        postagem.setTextoPostagem(textoPostagem);
        Assertions.assertEquals(textoPostagem, postagem.getTextoPostagem());
    }

    @Test
    public void testGetDate() {
        Date date = new Date();
        postagem.setDate(date);
        Assertions.assertEquals(date, postagem.getDate());
    }

    @Test
    public void testGetQntCurtidas() {
        long qntCurtidas = 10;
        postagem.setQntCurtidas(qntCurtidas);
        Assertions.assertEquals(qntCurtidas, postagem.getQntCurtidas());
    }

    @Test
    public void testGetTema() {
        postagem.setTema(tema);
        Assertions.assertEquals(tema, postagem.getTema());
    }

    @Test
    public void testGetUsuario() {
        postagem.setUsuario(usuario);
        Assertions.assertEquals(usuario, postagem.getUsuario());
    }

    @Test
    public void testGetQntComentarios() {
        long qntComentarios = 5;
        postagem.setQntComentarios(qntComentarios);
        Assertions.assertEquals(qntComentarios, postagem.getQntComentarios());
    }

    @Test
    public void testGetQntVisualizacoes() {
        long qntVisualizacoes = 100;
        postagem.setQntVisualizacoes(qntVisualizacoes);
        Assertions.assertEquals(qntVisualizacoes, postagem.getQntVisualizacoes());
    }

    @Test
    public void testGetInteresse() {
        postagem.setInteresse(interesse);
        Assertions.assertEquals(interesse, postagem.getInteresse());
    }

    @Test
    public void testGetComentarios() {
        postagem.setComentarios(comentarios);
        Assertions.assertEquals(comentarios, postagem.getComentarios());
    }
}
