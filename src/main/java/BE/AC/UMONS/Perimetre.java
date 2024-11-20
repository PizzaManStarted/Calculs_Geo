package BE.AC.UMONS;

public class Perimetre {
    public static int perim(int a, int b) {
        return Produit.mult(Addition.add(a, b), 2);
    }
}
