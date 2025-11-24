package com.example.validator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginValidatorTest {

    @Test
    public void testValidCredentials() {
        LoginValidator validator = new LoginValidator();
        assertTrue(validator.validate("admin", "secret"));
    }

    @Test
    public void testInvalidCredentials() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validate("user", "pass"));
    }

    @Test
    public void testNullUsername() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validate(null, "secret"));
    }

    @Test
    public void testNullPassword() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validate("admin", null));
    }

    @Test
    public void testEmptyCredentials() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validate("", ""));
    }
}
