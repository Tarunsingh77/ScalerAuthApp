package org.example.scalerAuth.services;

public interface ScalerAuthenticationService {
    public String login (String username, String password);
    public boolean isSessionTokenValid (String token);
}
