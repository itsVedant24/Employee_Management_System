package com.ems.service;

import com.ems.dto.AuthResponse;
import com.ems.dto.LoginRequest;

import com.ems.entity.User;

import com.ems.repository.UserRepository;

import com.ems.security.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service

public class AuthServiceImpl
        implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @Override

    public AuthResponse login(
            LoginRequest request) {

        User user = userRepository

                .findByUsername(
                        request.getUsername()
                )

                .orElseThrow(() ->
                        new RuntimeException(
                                "User Not Found"
                        ));

        if(!user.getPassword()
                .equals(request.getPassword())) {

            throw new RuntimeException(
                    "Invalid Password"
            );
        }

        String token =
                jwtUtil.generateToken(

                        user.getUsername(),

                        user.getRole()
                );

        return new AuthResponse(

                token,

                user.getRole()
        );
    }
}