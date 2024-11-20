package BE.AC.UMONS;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurfaceTest {

    @Test
    public void surf() {
        System.out.println("Test surface Equals");
        assertEquals(Surface.surf(3, 2), 6);
    }

    @Test
    public void surfNotEquals() {
        System.out.println("Test surface Not Equals");
        assertNotEquals(Surface.surf(4, 3), 16);
    }
}
