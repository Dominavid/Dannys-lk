package blatt02;

import java.util.Scanner;

public class Zinssatz {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Welches Kapital möchten Euer Exzellenz anlegen?");
        double kapital_alt = eingabe.nextDouble();
        System.out.println("Welchen Zinssatz streben Euer Exzellenz an?");
        double zinssatz = eingabe.nextDouble();
        double zinsen = kapital_alt * zinssatz / 100;
        double kapital_neu = kapital_alt + zinsen;
        System.out.printf("Hier Ihre Papiere, Sir\n\n\nAltes Kapital:\t%.2f€\nZinsatz:\t\t%.2f%%\n\nZinsen:\t\t\t%.2f€\nNeues Kapital:\t%.2f€", kapital_alt, zinssatz, zinsen, kapital_neu); //TODO: Hier etwas reinschreiben, da es in der Aufgabenstellung steht
    }
}
