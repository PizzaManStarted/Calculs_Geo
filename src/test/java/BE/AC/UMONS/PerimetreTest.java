package BE.AC.UMONS;

import org.junit.Test;

import static org.junit.Assert.*;

public class PerimetreTest {

    @Test
    public void perim() {
        System.out.println("Test Périmètre  Equals");
        assertEquals(Perimetre.perim(3, 2), 10);
    }

    @Test
    public void perimNotEquals() {
        System.out.println("Test périmètre Not Equals");
        assertNotEquals(Perimetre.perim(7, 3), 15);
    }
}

