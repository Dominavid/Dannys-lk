package blatt07;

public class Rechner {
    /**
     * Macht ziemlich hohe Mathematik
     * @param a die erste Zahl
     * @param b die zweite Zahl
     */
    public static void operation(double a, double b) {
        System.out.println("Die Summe lautet: " + add(a, b));
        System.out.println("Die Differenz lautet: " + sub(a, b));
        System.out.println("Das Produkt ist: " + mul(a, b));
        System.out.println("Der Quotient ist: " + div(a, b));
    }

    /**
     * Addieren... das konnte ich vielleicht in der *zählt angespannt mit den Fingern* ach egal
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Ergebnis
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Bei subtraktion wirds langsam eng...
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Ergebnis
     */
    public static double sub(double a, double b) {
        return a - b;
    }

    /**
     * wenn multipliziert wird ist mein limit langsam erreicht... kann ich einen Zettel haben?
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Ergebnis
     */
    public static double mul(double a, double b) {
        return a * b;
    }

    /**
     * Nope, da bin ich raus. Division ist einer zu viel
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Ergebnis
     */
    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        operation(18, 3);
    }
}
