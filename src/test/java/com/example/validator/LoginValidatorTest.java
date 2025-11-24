package com.example.validator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginValidatorTest {

    private final LoginValidator validator = new LoginValidator();

    @Test
    public void testValidate_nullUsernameOrPassword_returnsFalse() {
        assertFalse(validator.validate(null, "secret"));
        assertFalse(validator.validate("admin", null));
        assertFalse(validator.validate(null, null));
    }

    @Test
    public void testValidate_validCredentials_returnsTrue() {
        assertTrue(validator.validate("admin", "secret"));
    }

    @Test
    public void testValidate_invalidCredentials_returnsFalse() {
        assertFalse(validator.validate("user", "pass"));
        assertFalse(validator.validate("admin", "wrong"));
    }
}
