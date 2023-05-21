package com.pegueadica.felipejuan.security;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.pegueadica.felipejuan.model.Usuario;
import com.pegueadica.felipejuan.repository.UsuarioRepository;

@WebMvcTest
@ContextConfiguration(classes = { BasicSecurityConfig.class })
public class BasicSecurityConfigTest {

    private static final String USERNAME = "testuser";
    private static final String PASSWORD = "testpassword";

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private UsuarioRepository usuarioRepository;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void testSecuredEndpointWithoutUser() throws Exception {
        mockMvc.perform(get("/securedEndpoint"))
                .andExpect(header().doesNotExist("Authorization"));
    }

    private Usuario createTestUser() {
        Usuario user = new Usuario();
        user.setUsuario(USERNAME);
        user.setSenha(PASSWORD);
        return user;
    }
}
