package com.jwt.ecommerce.config;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthRequest { //Class used for authentication requests to the API
    private String username;
    private String password;

    public AuthRequest() {
    }

    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
