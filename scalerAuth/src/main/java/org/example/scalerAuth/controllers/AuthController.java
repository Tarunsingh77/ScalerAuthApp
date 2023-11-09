package org.example.scalerAuth.controllers;

import org.example.scalerAuth.dto.LogCredDtos;
import org.example.scalerAuth.services.ScalerAuthenticationService;
import org.example.scalerAuth.services.ScalerAuthenticationServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private ScalerAuthenticationService scalerAuthenticationService;
    public AuthController(ScalerAuthenticationService scalerAuthenticationService) {
        this.scalerAuthenticationService = scalerAuthenticationService;
    }
    @PostMapping("/login")
    public String login(@RequestBody LogCredDtos loginRe) {
        return scalerAuthenticationService.login(loginRe.getUsername(), loginRe.getPassword());
    }

    @GetMapping("/isSessionTokenValid")
    public boolean isSessionTokenValid(String token) {
        return scalerAuthenticationService.isSessionTokenValid(token);
    }

}
