package blatt03;

import java.util.Scanner;

public class Notenrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Punkten haben eure Exzellenz erreicht?");
        double punkte = input.nextDouble(); //erreichte Punkte
        System.out.println("Wie viele Punkte hätten eure Exzellenz erreichen können?");
        double punktemax = input.nextDouble(); //maximal mögliche Punkte
        int note; //erstellen einer Variable, die in der folgenden if abfrage aufgegriffen werden kann
        double anteil = punkte / punktemax; //berechnen des anteils der Punkte

        if (anteil > 1) { //Fehlervermeidung: mehr Punkte als maximal möglich
            System.out.println("Euer Exzellenz möge verzeihen, es scheint als wäre die Eingabe fehlerhaft.");
            System.exit(0);
        } else if (punktemax < 0 || punkte < 0) { //Fehlervermeidung: negativer Wert
            System.out.println("Euer Exzellenz möge verzeihen, es scheint als wäre die Eingabe fehlerhaft.");
            System.exit(0);
        }

        if (anteil >= 0.85) { //auswertung des Anteils um Note zu finden
            note = 1;
        } else if (anteil >= 0.7) {
            note = 2;
        } else if (anteil >= 0.55) {
            note = 3;
        } else if (anteil >= 0.39) {
            note = 4;
        } else if (anteil >= 0.17) {
            note = 5;
        } else {
            note = 6;
        }
        if (anteil == 1) { //Prüfung auf volle Punktzahl
            System.out.printf("Gratulation! Euer Exzellenz haben mit maximaler Wertung bestanden und die Note %d erreicht.", note);
        } else if (note <= 3) { //Prüfung auf gratulationswerte Note
            System.out.printf("Gratulation! Euer Exzellenz haben die Note %d erreicht.", note);
        } else {
            System.out.printf("Euer Exzellenz haben die Note %d erreicht.", note);
        }
    }
}
