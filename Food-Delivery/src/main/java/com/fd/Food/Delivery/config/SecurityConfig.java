package com.fd.Food.Delivery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService users() {
        UserDetails user = User.builder()
                .username("nhom8")
                .password("{bcrypt}$2a$10$t9rJmmkhOupFINIeoAF3N.QlHK7zNQc3b2GsPI5UugKiaJEg1kQIi")
                .roles("USER")
                .build();
        UserDetails admin = User.builder()
                .username("admin")
                .password("{bcrypt}$2a$10$CszvQPeVgHryyxUWav1aXOVXe9xR1jMxAeMEtdaUz9SEPdcR3Sf4q")
                .roles("USER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }
}
