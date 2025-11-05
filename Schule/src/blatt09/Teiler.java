package blatt09;

public class Teiler {

    /**
     * checkt ob ein Zahl der Teiler einer anderen ist
     * @param a die Zahl die geteilt wird (int)
     * @param b die Zahl durch die geteil wird (auch int)
     * @return Rückgabe als boolean
     */
    public static boolean istTeiler(int a, int b) {
        if (((double) a / b) == (a / b)) {
            return true;
        }
        return false;
    }

    /**
     * schreibt alle Teiler auf
     * @param a die Zahl von der die Teiler geschrieben werden
     */
    public static void alleTeiler(int a) {
        for (int i = 1; i <= a; i++) {
            if (istTeiler(a, i)) {
                System.out.println(i + " ist ein Teiler von " + a + ", Sir.");
            }
        }
    }


    /**
     * berechnet die Anzahl der Teiler
     * @param a Zahl von der die Anzahl der Teiler berechnet wird
     * @return Anzahl der Teiler
     */
    public static int anzahlTeiler(int a) {
        int anzahl = 0;
        for (int i = 1; i <= a; i++) {
            if (istTeiler(a, i)) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * berechnet auch alle Teiler, aber gibt sie wieder, statt sie zu drucken
     * @param a die zahl von der alle Teiler berechnet werden
     * @return die Teiler als Array
     */
    public static int[] teiler(int a) {
        int[] teiler = new int[anzahlTeiler(a)];
        int position = 0;
        for (int i = 1; i <= a; i++) {
            if (istTeiler(a, i)) {
                teiler[position] = i;
                position++;
            }
        }
        return teiler;
    }


    public static void main(String[] args) {
        int geteilt = 15;
        int teiler = 6;
        int zahl = 47;
        if (istTeiler(geteilt, teiler)) {
            System.out.println(geteilt + " kann durch " + teiler + " geteilt werden, Sir.");
        } else {
            System.out.println(geteilt + " kann nicht durch " + teiler + " geteilt werden, Sir.");
        }
        alleTeiler(zahl);
        System.out.println("Das waren " + anzahlTeiler(zahl) + " Teiler, Sir");
    }
}
