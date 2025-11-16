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
        /*
        Aufgabe 4:
            Auführbarkeit:
                erfüllt, da im Falle eines Fehlers lediglich ein ungekürzter Bruch zurückgegeben wird, statt das das Programm abstürzt.
            Allgemeinheit:
                erfüllt, da es mit jedem Zähler und jedem Nenner funktioniert
            Eindeutigkeit:
                laut Herr Schisch seinem Arbeitsbla- ähh ich meine natürlich laut dem Arbeitsblatt des Herrn Schischs sowieso gegeben
            Endlichkeit:
                um hier durchzufallen bin ich nicht fleißig genug
            Determiniertheit:
                gegeben, da sich der Code einmal hochgeladen nicht verändert
            Terminierung:

         */
        //todo: hier und auf den anderen Blättern den scheiß  fertifg machen
    }

    public static void main(String[] args) {
        int zaehler = 4;
        int nenner = 0;
        int[] bruch = kuerzen(zaehler, nenner);
        for (int i = 0; i < bruch.length; i++) {
            System.out.println(bruch[i]);
        }
        if (istKuerzbar(nenner, zaehler)) {
            System.out.println("Euer Exzellenz, unsere Berechnungen ergeben, dass sich der Bruch \"" + zaehler + "/" + nenner + "\" kürzen ließe, wenn man das denn möchte.");
            int[] bruch1 = kuerzen(zaehler, nenner);
            System.out.println("Euer Exzellenz, hier der gekürzte Bruch:\n" + bruch[0] + "/" + bruch[1]);
        } else {
            System.out.println("Euer Exzellenz, leider scheint sich der Bruch \"" + zaehler + "/" + nenner + "\" nicht kürzen zu lassen.");
        }

    }
}
