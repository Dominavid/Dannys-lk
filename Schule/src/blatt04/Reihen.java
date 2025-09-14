package blatt04;

import java.util.Scanner;

public class Reihen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zahlenproreihe = 0;

        boolean fehler = true;
        while  (fehler) { //schleife zur Fehlervermeidung
            System.out.println("Wie viele Zahlen wünschen euer Exzellenz pro Reihe ausgegeben zu bekommen?");
            zahlenproreihe = sc.nextInt();
            if (zahlenproreihe < 0) {
                System.out.println("Bitte nur positive Zahlen, Sir.");
                fehler = true;
            } else {
                fehler = false;
            }
        }
            //anzahl der zahlen pro reihe gespeichert

            //beginn Reihenerstellung
        int anzahlreihe = 0;
        System.out.println("Reihe 1:");
        while (anzahlreihe < zahlenproreihe) { // reihe 1
            anzahlreihe++;
            System.out.print(anzahlreihe + " ");
        }
        anzahlreihe = 0;

        System.out.println("\n\nReihe 2:");
        while (anzahlreihe < zahlenproreihe) { //reihe 2
            anzahlreihe++;
            System.out.print(anzahlreihe * 2 + " ");
        }
        anzahlreihe = 0;

        System.out.println("\n\nReihe 3:");
        while (anzahlreihe < zahlenproreihe) { //reihe 3
            anzahlreihe++;
            System.out.print(anzahlreihe * anzahlreihe + " ");
        }
        anzahlreihe = 0;

        System.out.println("\n\nReihe 4:");
        while (anzahlreihe * 2 < zahlenproreihe) { //reihe 4 (* 2, da pro wiederholung zwei zahlen hinzugefügt werden)
            anzahlreihe++;
            System.out.print(anzahlreihe + " ");
            if (anzahlreihe * 2 <= zahlenproreihe) { //erneute Überprüfung, "break" nicht notwendig, da gleicher Wert in while abfrage genutzt wird
                System.out.print(anzahlreihe * -1 + " ");
            }
        }
    }
}
