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
    void testInitials() {
        assertEquals("M.", this.user.initials());
    }

    @Test
    void testGetNumber() {
        assertEquals(25, this.user.getNumber());
    }

    @Test
    void testGetName() {
        assertEquals("Melany", this.user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Simbaña", this.user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Melany Simbaña", this.user.fullName());
    }

    @Test
    void testFullNameAndNumber() {
        assertEquals("Melany Simbaña 25", this.user.fullNameAndNumber());
    }

    @Test
    void testSetNumber() {
        this.user.setNumber(48);
        assertEquals(48, this.user.getNumber());
    }

    @Test
    void testSetName() {
        this.user.setName("Aida");
        assertEquals("Aida", this.user.getName());
    }

    @Test
    void testSetFamilyName() {
        this.user.setFamilyName("Sangucho");
        assertEquals("Sangucho", this.user.getFamilyName());
    }
}