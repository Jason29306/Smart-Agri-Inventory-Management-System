package com.jason.agriinventory.controller;

import com.jason.agriinventory.entity.User;
import com.jason.agriinventory.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class UserController {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository repository;
    private final AuthenticationManager authenticationManager;

    public UserController(UserRepository repository,
                          PasswordEncoder passwordEncoder,
                          AuthenticationManager authenticationManager) {

        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return repository.save(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        try {

            Authentication authentication =
                    authenticationManager.authenticate(
                            new UsernamePasswordAuthenticationToken(
                                    user.getUsername(),
                                    user.getPassword()
                            )
                    );

            if (authentication.isAuthenticated()) {
                return "Login Successful";
            }

        } catch (Exception e) {
            return "Invalid Username or Password";
        }

        return "Invalid Username or Password";
    }


}