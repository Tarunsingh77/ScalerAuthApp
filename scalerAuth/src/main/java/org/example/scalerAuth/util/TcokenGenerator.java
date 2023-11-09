package org.example.scalerAuth.util;
import java.security.SecureRandom;
import java.util.Random;

public class TcokenGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int TOKEN_LENGTH = 20;

    public static String generateToken() {
        StringBuilder token = new StringBuilder(TOKEN_LENGTH);
        Random random = new SecureRandom();  // You can use SecureRandom for better randomness

        for (int i = 0; i < TOKEN_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            token.append(randomChar);
        }

        return token.toString();
    }

}
