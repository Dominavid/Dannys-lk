package blatt04;

import java.util.Random;
import java.util.Scanner;

public class etf {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        double sparrate = 50;
        double gesamtcash = 0;
        double zinsen;
        double anteil = 0;
        int monat = 0;
        int jahr = 1;
        boolean weitermache = true;

        System.out.println("Über wie viele Jahre planen Euer Exzellenz zu investieren?");
        int laufzeit = input.nextInt();
        System.out.println("Möchten Sie bei einer gewissen Anzahl von Anteilen den Plan abbrechen, Sir? (true/false)");
        boolean ziel = input.nextBoolean();
        double zielanteil = 0;
        if (ziel) {
            System.out.println("Bei wie vielen Anteilen soll das sein, Sir?");
            zielanteil = input.nextDouble();
        }

        while (jahr <= laufzeit) {
            System.out.println("Wie viel planen Euer Exzellenz dieses Jahr monatlich anzulegen?");
            sparrate = input.nextDouble();
            System.out.println("Jahr\tMonat\tSparrate\tZinsen\tGesamtcash\t\tAnteil");
            while (monat < 12) {
                zinsen = 6 * rnd.nextDouble() + 6;
                monat += 1;
                gesamtcash += sparrate;
                gesamtcash += gesamtcash * (anteil / 100);
                anteil = gesamtcash / 3500;
                System.out.printf("%d\t\t%d\t\t%.2f\t\t%.2f\t%.2f\t\t%.2f\n", jahr, monat, sparrate, zinsen, gesamtcash, anteil);
                if (ziel) {
                    if (anteil >= zielanteil) {
                        System.out.println("Das Anteilziel wurde erreicht, Sir");
                        weitermache = false;
                        break;
                    }
                }
            }
            jahr += 1;
            monat = 0;
            if (!weitermache) {
                break;
            }
        }


        System.out.println("Fazit!");
    }
}
