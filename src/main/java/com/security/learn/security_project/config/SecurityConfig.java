package com.security.learn.security_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.security.KeyStore;

@EnableWebSecurity(debug = true)
@Configuration
public class SecurityConfig {

//    @Bean
//    public UserDetailsService userDetailsService() {
//
////        UserDetails user1 = User.builder()
//        UserDetails user1 = User.withDefaultPasswordEncoder()
//                .username("zamzam")
//                .password("zamzam")
//                .roles("ADMIN", "Guest")
//                .build();
//
//        UserDetails user2 = User.withDefaultPasswordEncoder()
//                .username("shozam")
//                .password("shozam")
//                .roles("ADMIN")
//                .build();
//
//        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user1, user2);
//        return inMemoryUserDetailsManager;
//    }
    @Bean
    public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
    }
}
