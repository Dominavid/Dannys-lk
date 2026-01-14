package blatt13;


public class Zufall {

    /**
     * erstellt einen zufälligen double-Wert zwischen 0.0 und der Obergrenze B
     * @param b die Obergrenze B
     * @return der zufällige double-Wert
     */
    public static double zufall(double b) {
        return Math.random()*(b);
    }


    /**
     * erstellt einen zufälligen double-Wert zwischen zwei gegebenen Werten
     * @param a Grenzpunkt 1
     * @param b Grenzpunkt 2
     * @return der zufällige double-Wert
     */
    public static double zufall(double a, double b) {
        double z = Math.random() * Math.abs(a-b);
        if (a > b) {
            z += b;
        } else {
            z += a;
        }
        return z;
    }


    /**
     * erstellt einen zufälligen int-Wert zwischen 0 und der Obergrenze B
     * @param b die Obergrenze B
     * @return der zufällige int-Wert
     */
    public static int zufallGanz(int b) {
        return (int) (Math.random()*(b));
    }



    /**
     * erstellt einen zufälligen int-Wert zwischen zwei gegebenen Werten
     * @param a Grenzpunkt 1
     * @param b Grenzpunkt 2
     * @return der zufällige int-Wert
     */
    public static int zufallGanz(int a, int b) {
        int z = Math.toIntExact(Math.round(Math.random() * Math.abs(a-b)));
        if (a > b) {
            z += b;
        } else {
            z += a;
        }
        return z;
    }


    /**
     * erstellt einen int-Array voll mit zufälligen Zahlen zwischen zwei gegebenen Werten
     * @param a Grenzpunkt 1
     * @param b Grenzpunkt 2
     * @param l Länge des Arrays
     * @return
     */
    public static int[] zufallArray(int a, int b, int l) {
        int[] zufall = new int[l];
        for (int i = 0; i < l; i++) {
            zufall[i] = zufallGanz(a, b);
        }
        return zufall;
    }


    public static void main(String[] args) {
        System.out.println(zufall(4.7));
        System.out.println(zufallGanz(50));
        System.out.println(zufall(10.1,3.7));
        System.out.println(zufallGanz(7,9));
        blatt07.ArbeitMitArrays.printArray(zufallArray(4,17,21));
    }
}
