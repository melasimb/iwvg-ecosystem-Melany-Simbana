package practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void setUp() {
        fraction = new Fraction(6, 3);
    }

    @Test
    void decimal() {
        assertEquals(2, fraction.decimal());
    }

    @Test
    void getNumerator() {
        assertEquals(6, fraction.getNumerator());
    }

    @Test
    void getDenominator() {
        assertEquals(3, fraction.getDenominator());
    }
}