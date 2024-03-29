package practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(6, 3);
    }

    @Test
    void testDecimal() {
        assertEquals(2, this.fraction.decimal());
    }

    @Test
    void testGetNumerator() {
        assertEquals(6, this.fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(3, this.fraction.getDenominator());
    }

    @Test
    void testIsOwn() {
        assertFalse(this.fraction.isOwn());
    }

    @Test
    void testIsNotOwn() {
        assertTrue(this.fraction.isNotOWn());
    }

    @Test
    void testFullFraction() {
        assertEquals("6/3=2.0", this.fraction.fullFraction());
    }
}