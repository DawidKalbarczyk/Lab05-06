package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KalkulatorTest {

    @Test
    void testDodaj() {
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(5, kalkulator.dodaj(2,3));
    }
}
