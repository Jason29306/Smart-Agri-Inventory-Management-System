package com.jason.agriinventory.config;

import com.jason.agriinventory.service.CustomUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final CustomUserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    public SecurityConfig(CustomUserDetailsService userDetailsService,
                          PasswordEncoder passwordEncoder) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())

                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/",
                                "/index.html",
                                "/products.html",
                                "/add-product.html",
                                "/supplier.html",
                                "/purchase.html",
                                "/sales.html",
                                "/login.html",
                                "/style.css",
                                "/script.js",
                                "/products.js",
                                "/supplier.js",
                                "/purchase.js",
                                "/sales.js",
                                "/auth/**",
                                "/products/**",
                                "/suppliers/**",
                                "/purchases/**",
                                "/sales/**",
                                "/inventory/**"
                        ).permitAll()
                        .anyRequest().authenticated()
                )

                .userDetailsService(userDetailsService)

                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

}