package practica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User(25, "melany", "simbaña");
    }

    @Test
    void initials() {
        assertEquals("M.", user.initials());
    }

    @Test
    void getNumber() {
        assertEquals(25, user.getNumber());
    }

    @Test
    void getName() {
        assertEquals("Melany", user.getName());
    }

    @Test
    void getFamilyName() {
        assertEquals("Simbaña", user.getFamilyName());
    }

    @Test
    void fullName() {
        assertEquals("Melany Simbaña", user.fullName());
    }
}