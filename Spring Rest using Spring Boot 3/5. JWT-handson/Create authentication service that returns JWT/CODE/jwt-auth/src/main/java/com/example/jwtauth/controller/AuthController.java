package com.example.jwtauth.controller;
import com.example.jwtauth.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AuthController {
	@Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length()).trim();
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded);
            String[] values = credentials.split(":", 2);

            String username = values[0];
            String password = values[1];

            if (username.equals("user") && password.equals("pwd")) {
                String token = jwtUtil.generateToken(username);
                return "{\"token\":\"" + token + "\"}";
            }
        }

        return "Invalid credentials";
    }
}
