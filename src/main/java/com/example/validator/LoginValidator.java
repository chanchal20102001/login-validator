package com.example.validator;

public class LoginValidator {

    public boolean validate(String username, String password) {

        if (username == null || password == null) {
            return false;
        }

        return "admin".equals(username) && "secret".equals(password);
    }
}