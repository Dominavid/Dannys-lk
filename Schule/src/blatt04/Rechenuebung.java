package blatt04;

import java.util.Scanner;

public class Rechenuebung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Die erste Zahl, Sir?");
        double zahl1 = input.nextDouble();
        System.out.println("Die zweite Zahl, Sir?");
        double zahl2 = input.nextDouble();
            //einlesen der Zahlen

        double ergebnis = zahl1 * zahl2;
        while (true) {
            System.out.println("Auf welche Lösung kommen euer Exzellenz bei " + zahl1 + " multipliziert mit " + zahl2 + "? ");
            if (input.nextDouble() == ergebnis) {
                System.out.println("Euer Gnaden haben richtig gerechnet.");
                break;
            } else {
                System.out.println("Ich befürchte euer Hoheit haben einen Fehler gemacht. Versuchet es bitte erneut.");
            }
        }
    }
}
