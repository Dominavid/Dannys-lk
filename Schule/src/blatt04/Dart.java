package blatt04;

import java.util.Scanner;
/*
|-----------------------------------------------------------------------------------|
Aufgabe:
Du kennst sicherlich die Sportart Dart. Falls nicht ist das gar kein Problem,
denn hier sind die nochmal die Regeln (verkürtzt):
1. Ein Dartspiel beginnt bei 501 Punkten.
2. Ein Spieler kann in jeder Runde eine Punktzahl zwischen 0-180.
3. Die geworfenen Punkte werden in jeder Runde von der Gesamtpunktzahl abgezogen.
4. Das Spiel endet, wenn man exakt 0 Punkte erreicht. Sollte man ins negative geraten,
wird man auf den Wert von der vorherigen Runde zurückgesetzt.

Implementiere nun einen automatischen Dartzähler, damit der Spieler seine Punkte nicht
selbst im Kopf rechnen muss.
 |-----------------------------------------------------------------------------------|
 */

public class Dart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Erzeuge Scanner

        int runden = 0;
        int punkte = 501; //Variable "punkte" mit 501 initialisiert -->Startwert

        while (true) {
            System.out.println("Gebt eure Punktzahl ein (0-180), Sir.");
            int wurf = scanner.nextInt(); //Setzt die Variable "wurf" auf den eingegebenen Wert (Es kann angenommen, dass nur gültige Werte eingegeben werden)
            if (wurf < 0 || wurf > 180) {
                System.out.println("Dieser Wurf ist nicht möglich, Euer Exzellenz scheinen zu mogeln. Dieser Wurf zählt nicht.");
                wurf = 0;
            }
            if (wurf <= punkte) {
                punkte -= wurf;
            } else {
                System.out.println("Euer Gnaden haben die Punktzahl überschritten. Diese Runde wird nicht zählen.");
            }
            runden++;
            if (punkte == 0) {
                System.out.println("Euer Gnaden haben in der " + runden + ". Runde gewonnen.");
                break;
            } else {
                System.out.println("Euer Gnaden haben noch " + punkte + " Punkte zu erreichen.");
            }
        }

    }
}
