package BE.AC.UMONS;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProduitTest{

    @Test
    public void multEquals() {
        System.out.println("Test Multiplication Equals");
        assertEquals(Produit.mult(10, 5), 50);
    }

    @Test
    public void multNotEquals() {
        System.out.println("Test Multiplication Not Equals");
        assertNotEquals(Produit.mult(1, 1), 9);
    }

}