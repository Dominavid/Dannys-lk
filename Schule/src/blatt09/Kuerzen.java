package blatt09;

public class Kuerzen {

    /**
     * prüft ob man kürzen kann
     * @param a der zähler
     * @param b der nenner
     * @return ergebnis als wahrheitswert
     */
    public static boolean istKuerzbar(int a, int b) {
        int[] ateiler = Teiler.teiler(a);
        int[] bteiler = Teiler.teiler(b);
        for (int i = 1; i < ateiler.length; i++) {
            for (int j = 1; j < bteiler.length; j++) {
                if (ateiler[i] == bteiler[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * kürzt einen bruch
     * @param a zähler/nenner
     * @param b nenner/zähler
     * @return gibt den bruch als zweiteiligen integer array raus (Format: a/b)
     */
    public static int[] kuerzen(int a, int b) {
        int[] ateiler = Teiler.teiler(a);
        int[] bteiler = Teiler.teiler(b);
        for (int i = ateiler.length - 1; i >= 0; i--) {
            for (int j = bteiler.length - 1; j >= 0; j--) {
                if (ateiler[i] == bteiler[j]) {
                    a /= ateiler[i];
                    b /= ateiler[i];
                    return new int[]{a, b};
                }
            }
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int zaehler = 4;
        int nenner = 12;
        if (istKuerzbar(nenner, zaehler)) {
            System.out.println("Euer Exzellenz, unsere Berechnungen ergeben, dass sich der Bruch \"" + zaehler + "/" + nenner + "\" kürzen ließe, wenn man das denn möchte.");
            int[] bruch = kuerzen(zaehler, nenner);
            System.out.println("Euer Exzellenz, hier der gekürzte Bruch:\n" + bruch[0] + "/" + bruch[1]);
        } else {
            System.out.println("Euer Exzellenz, leider scheint sich der Bruch \"" + zaehler + "/" + nenner + "\" nicht kürzen zu lassen.");
        }

    }
}
