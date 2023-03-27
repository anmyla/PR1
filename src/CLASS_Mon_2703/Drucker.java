package CLASS_Mon_2703;

public class Drucker {
    String zeichenKette;
    int zahl;
    double fliessKommaZahl;
    boolean print = false;

    public Drucker(String zeichenKette, int zahl, double fliessKommaZahl, boolean print) {
        this.zeichenKette = zeichenKette;
        this.zahl = zahl;
        this.fliessKommaZahl = fliessKommaZahl;
        this.print = print;
    }

    public String methodPrint(String zeichenKette) {
        System.out.println("String: " + zeichenKette);
        return zeichenKette;
    }

    public int methodPrint(int zahl) {
        System.out.println("Int: " + zahl);
        return zahl;
    }

    public double methodPrint(double fliessKommaZahl) {
        System.out.println("Double: " + fliessKommaZahl);
        return fliessKommaZahl;
    }

    public boolean methodPrint(boolean print) {
        System.out.println("Boolean: " + print);
        return print;
    }


}
