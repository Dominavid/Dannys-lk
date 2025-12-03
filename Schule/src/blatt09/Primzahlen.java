package blatt09;

public class Primzahlen {

    /**
     * Eine unnötige Funktion, da die einzige Funktion dieser Funktion ist, auf eine Funktion zu verweisen
     * @param a Zahl die eventuell eine Primzahl ist
     * @return ob die Zahl eine Primzahl ist
     */
    public static boolean istPrim(int a) {
        if (Teiler.anzahlTeiler(a) == 2) {
            return true;
        }
        return false;
    }

    /**
     * druckt sämtliche Primzahlen die kleiner/gleich einer gegebenen Zahl sind
     * @param a die gegebene Zahl
     */
    public static void printPrim(int a) {
        System.out.print("[ ");
        for (int i = 0; i <= a; i++) {
            if (istPrim(i)) {
                if (i != 2) {
                    System.out.print(" | ");
                }
                System.out.print(i);
            }
        }
        System.out.print(" ]");
    }


    /**
     * errechnet die Anzahl aller Primzahlen bis zu einer Zahl
     * @param a die zahl bis zu der gerechnet wird
     * @return die Anzahl der Primzahlen
     */
    public static int anzahlPrimzahlen(int a) {
        int b = 0;
        for (int i = 0; i <= a; i++) {
            if (istPrim(i)) {
                b++;
            }
        }
        return b;
    }


    /**
     * macht einen Array mit allen Primzahlen bis zur Zahl a
     * @param a die Zahl a
     * @return der Array
     */
    public static int[] generierePrimzahlen(int a) {
        int[] pz = new int[anzahlPrimzahlen(a)];
        int p = 0;
        for (int i = 0; i <= a; i++) {
            if (istPrim(i)) {
                pz[p++] = i;
            }
        }
        return pz;
    }


    /**
     * zerlegt eine Zahl (hoffentlich korrekt) per Primzahlzerlegung
     * @param a zahl für die Primfaktorzerlegung gesucht wird
     */
    public static void primfaktorzerlegung(int a) {
        int[] pz = generierePrimzahlen(a);
        System.out.print("\n" + a + " = ");
        boolean e = true;
        boolean s = false;
        for (int i = 0; i < pz.length; i++) {
            //System.out.println("\n" + ((double) a / pz[i]));
            if (((double)a / pz[i]) == (a / pz[i])) {
                a /= pz[i];
                if (e) {
                    e = false;
                    System.out.print(pz[i]);
                    //System.out.print("\t" + a);
                } else {
                    System.out.print(" * " + pz[i]);
                    //System.out.print("\t" + a);
                }
                i = -1;
                if (istPrim(a)) {
                    System.out.print(" * " + a);
                    s = true;
                    //System.out.println("t");
                    break;
                }
            }

        }
        if (!s) {
            System.out.println("\nEuer Gnaden mögen verzeihen, es scheint ein Fehler aufgetreten zu sein.");
        }
        /*
        Aufgabe 4:
            Auführbarkeit:
                erfüllt, da falls eine Zerlegung nicht klappt eine geplante Fehlermeldung aufpoppt.
            Allgemeinheit:
                erfüllt, da es mit jeder Zahl entweder funktioniert oder ein Fehler abgefangen wird.
            Eindeutigkeit:
                laut Herr Schisch seinem Arbeitsbla- ähh ich meine natürlich laut des Arbeitsblattes des Herrn Schischs sowieso gegeben
            Endlichkeit:
                um hier durchzufallen bin ich nicht fleißig genug
            Determiniertheit:
                gegeben, da sich der Code einmal hochgeladen nicht verändert
            Terminierung:
                gegeben, da keine endlos laufenden schleifen da sind
         */
    }


    public static void main(String[] args) {
        int zahl = -183;
        if  (istPrim(zahl)) {
            System.out.println("Die Zahl \"" + zahl + "\" ist eine Primzahl, Sir.");
        } else {
            System.out.println("Die Zahl \"" + zahl + "\" ist keine Primzahl, Sir.");
        }
        System.out.println("Euer Exzellenz, hier ist die angeforderte Liste sämtlicher Primzahlen die nicht größer als " + zahl + " sind. Diese werden nun wie gewünscht als Array mit dem namen \"primzahlen\" gespeichert.");
        int[] primzahlen = generierePrimzahlen(zahl);
        printPrim(zahl);
        //System.out.println(primzahlen.length);
        System.out.println("\n\n\nHier die Primfaktorzerlegung von \"" + zahl + "\" die Euer Gnaden anforderte:");
        primfaktorzerlegung(zahl);
    }
}
