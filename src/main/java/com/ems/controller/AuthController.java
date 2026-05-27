package com.ems.controller;

import com.ems.dto.AuthResponse;
import com.ems.dto.LoginRequest;

import com.ems.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/api/auth")

public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")

    public AuthResponse login(
            @RequestBody LoginRequest request) {

        System.out.println(
                request.getUsername()
        );

        System.out.println(
                request.getPassword()
        );

        return authService.login(request);
    }
}