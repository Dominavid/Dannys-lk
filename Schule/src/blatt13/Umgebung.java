package blatt13;

public class Umgebung {

    /**
     * findet den kleinsten exponenten bei dem eine zahl zwischen 0-ausschließlich 1 zu einer zahl wird die näher oder gleich nah an null ist wie eine andere
     * @param a zahl bei der gestartet wird
     * @param b die zahl die erreicht wird
     * @return die zahl mit der es erreicht wird
     */
    public static int findeExponent(double a, double b) {
        if (a < 0 || a >= 1 || b <= 0) {
            System.out.println("Du scheiß dödel gibst falsche Anweisungen!");
            return -1;
        }
        int z = 0;
        while (true) {
            if (Math.pow(a, z) <= b) {
                break;
            } else if (z > 69000000) {
                System.out.println("Error");
                break;
            }
            z++;
        }
        return z;
    }


    public static void main(String[] args) {
        System.out.println(findeExponent(0.5, 0.001));
    }
}
