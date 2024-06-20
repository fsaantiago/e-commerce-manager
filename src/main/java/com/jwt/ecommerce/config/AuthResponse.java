package com.jwt.ecommerce.config;

import java.util.Objects;
import java.util.StringJoiner;
import java.util.UUID;

public class AuthResponse { //Class used for response after authentication

    private final String jwt;
    private UUID userId;

    public AuthResponse(String jwt) {
        this.jwt = jwt;
        this.userId = userId;
    }

    public String getJwt() {
        return jwt;
    }

    public UUID getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AuthResponse)) {
            return false;
        }
        AuthResponse authResponse = (AuthResponse) o;
        return Objects.equals(jwt, authResponse.jwt) && Objects.equals(userId, authResponse.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jwt, userId);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AuthResponse.class.getSimpleName() + "[", "]")
                .add("jwt='" + jwt + "'")
                .add("userId=" + userId)
                .toString();
    }
}
