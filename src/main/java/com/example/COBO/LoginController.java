package com.example.COBO;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class LoginController implements ILoginApi{

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request) {
        String token = generateJWTToken(); // Método ficticio para generar el token JWT
        String timestamp = LocalDateTime.now().toString();

        LoginResponse response = new LoginResponse();
        response.setToken(token);
        response.setTimestamp(timestamp);

        return ResponseEntity.ok().body(response);
    }

    private String generateJWTToken() {
        return "token_generado";
    }

}

