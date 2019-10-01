package practica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        this.user = new User(25, "melany", "simbaña");
    }

    @Test
    void initials() {
        assertEquals("M.", this.user.initials());
    }

    @Test
    void getNumber() {
        assertEquals(25, this.user.getNumber());
    }

    @Test
    void getName() {
        assertEquals("Melany", this.user.getName());
    }

    @Test
    void getFamilyName() {
        assertEquals("Simbaña", this.user.getFamilyName());
    }

    @Test
    void fullName() {
        assertEquals("Melany Simbaña", this.user.fullName());
    }

    @Test
    void setNumber() {
        this.user.setNumber(48);
        assertEquals(48, this.user.getNumber());
    }

    @Test
    void setName() {
        this.user.setName("Aida");
        assertEquals("Aida", this.user.getName());
    }

    @Test
    void setFamilyName() {
        this.user.setFamilyName("Sangucho");
        assertEquals("Sangucho", this.user.getFamilyName());
    }
}