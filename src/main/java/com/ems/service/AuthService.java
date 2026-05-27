package com.ems.service;

import com.ems.dto.AuthResponse;
import com.ems.dto.LoginRequest;

public interface AuthService {

    AuthResponse login(
            LoginRequest request);
}