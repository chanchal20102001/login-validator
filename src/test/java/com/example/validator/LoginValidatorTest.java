package com.example.validator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginValidatorTest {

    @Test
    public void testValidLogin() {
        LoginValidator validator = new LoginValidator();
        assertTrue(validator.validate("admin", "secret"));
    }

    @Test
    public void testInvalidLogin() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validate("user", "wrong"));
    }

    @Test
    public void testNullInputs() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validate(null, null));
    }
}

