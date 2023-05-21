package com.pegueadica.felipejuan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PerfilTest {

    private Perfil perfil;
    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        perfil = new Perfil();
        usuario = new Usuario();
    }

    @Test
    public void testGetId() {
        long id = 1;
        perfil.setId(id);
        Assertions.assertEquals(id, perfil.getId());
    }

    @Test
    public void testGetPrimeiro_nome() {
        String primeiroNome = "John";
        perfil.setPrimeiro_nome(primeiroNome);
        Assertions.assertEquals(primeiroNome, perfil.getPrimeiro_nome());
    }

    @Test
    public void testGetUltimo_nome() {
        String ultimoNome = "Doe";
        perfil.setUltimo_nome(ultimoNome);
        Assertions.assertEquals(ultimoNome, perfil.getUltimo_nome());
    }

    @Test
    public void testGetGenero() {
        String genero = "Male";
        perfil.setGenero(genero);
        Assertions.assertEquals(genero, perfil.getGenero());
    }

    @Test
    public void testGetOcupacao() {
        String ocupacao = "Software Engineer";
        perfil.setOcupacao(ocupacao);
        Assertions.assertEquals(ocupacao, perfil.getOcupacao());
    }

    @Test
    public void testGetSobre_usuario() {
        String sobreUsuario = "Lorem ipsum dolor sit amet";
        perfil.setSobre_usuario(sobreUsuario);
        Assertions.assertEquals(sobreUsuario, perfil.getSobre_usuario());
    }

    @Test
    public void testGetUsuario() {
        perfil.setUsuario(usuario);
        Assertions.assertEquals(usuario, perfil.getUsuario());
    }

    @Test
    public void testSetUsuario() {
        Usuario newUsuario = new Usuario();
        perfil.setUsuario(newUsuario);
        Assertions.assertEquals(newUsuario, perfil.getUsuario());
    }
}
