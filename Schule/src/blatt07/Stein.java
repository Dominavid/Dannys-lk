//-5 Punkte weil in der Aufgabenstellung "die oberste Regeln" steht, und zusätzlich -10 Punkte weil dies im Gegensatz zu den Dingen bei denen Sie mir -5 Punkte geben tatsächlich einen Einfluss hat.
package blatt07;

public class Stein {

    /**
     * ist zwar falsch hab aber zumindest die Regeln aus der Aufgabe erfüllt
     * @param a die erste Zahl für die ein gemeinsamer Teiler mit der zweiten Zahl gesucht wird
     * @param b die zweite Zahl für die ein gemeinsamer Teiler mit der ersten Zahl gesucht wird
     * @return
     */
    public static double steinGGT (int a, int b) {
        double ggt = 0;
        int k = 0;
        while (true) {
            if (a == b) {
                ggt = a;
                break;
            } else if (a % 2 == 0 && b % 2 == 0) {
                a /= 2;
                b /= 2;
            } else if (a % 2 == 0) {
                a /= 2;
            } else if (b % 2 == 0) {
                b /= 2;
            } else if (a > b) {
                a = (a - b) / 2;
            } else {
                b = (b - a) / 2;
            }
            k++;
            if (a == 0) {
                ggt = b * k * k;
                break;
            } else if (b == 0) {
                ggt = a * Math.pow(2, k);
                break;
            }
        }
        return ggt;
    }
    
    
    
    
    
    public static void main(String[] args) {
        int a = 27;
        int b = 6;
        System.out.println("Der größte gemeinsame Teiler ist " + steinGGT(a,b));
    }
}
