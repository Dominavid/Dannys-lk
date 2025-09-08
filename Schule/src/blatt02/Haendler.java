package blatt02;

import java.util.Scanner;

public class Haendler {
    public static void main(String[] args) {
        Scanner anzahl = new Scanner(System.in);
        int sd = 5;
        int minisd = 8;
        int microsd = 12;

        System.out.println("Wie viele normale SD-Karten gedenken der Herr zu kaufen?");
        int mengesd = anzahl.nextInt();
        System.out.println("Wie viele MiniSD-Karten gedenken der Herr zu kaufen?");
        int mengeminisd = anzahl.nextInt();
        System.out.println("Wie viele MicroSD-Karten gedenken der Herr zu kaufen?");
        int mengemicrosd = anzahl.nextInt();

        int preisgesamt = sd * mengesd + minisd * mengeminisd + microsd * mengemicrosd;

        System.out.println("Der Preis für...\n" + mengesd + " normale SD-Karten\n" + mengeminisd + " MiniSD-Karten\n" + mengemicrosd + " MicroSD-Karten\n" + "...lautet " + preisgesamt + "€, Sir."); //TODO: Uffbasse das die Menge richtig angegeben wird
    }
}
