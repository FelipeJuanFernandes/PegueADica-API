package com.pegueadica.felipejuan.security;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.pegueadica.felipejuan.model.Usuario;

public class UserDetailsImplTest {

    @Test
    public void testUserDetailsImpl() {
        // Create a test user
        String username = "testuser";
        String password = "testpassword";
        List<String> roles = List.of("ROLE_USER");

        Usuario user = new Usuario();
        user.setUsuario(username);
        user.setSenha(password);

        // Convert roles to GrantedAuthority objects
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }

        // Create UserDetailsImpl object
        UserDetailsImpl userDetails = new UserDetailsImpl(user);

        // Test methods
        assertEquals(username, userDetails.getUsername());
        assertEquals(password, userDetails.getPassword());
        assertTrue(userDetails.getAuthorities().containsAll(authorities));
        assertTrue(userDetails.isAccountNonExpired());
        assertTrue(userDetails.isAccountNonLocked());
        assertTrue(userDetails.isCredentialsNonExpired());
        assertTrue(userDetails.isEnabled());
    }
}
