package blatt05;

import java.util.Scanner;

public class Übungdiagramme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Was ist die Anzahl Eurer Noten, Sir?");
        int anzahl = input.nextInt();
        int a = anzahl;
        int noten = 0;
        int note = 0;
        double schnitt;

        while (a > 0) {
            System.out.println("Welche Note haben Euer Exzellenz erreicht?");
            note = input.nextInt();
            if (note > 6 || note < 1) {
                System.out.println("Die Note muss zwischen 1 und 6 liegen, ich fürchte Euer Exzellenz haben einen Tippfehler gemacht.");
                note = 0;
                a++;
            }
            noten += note;
            a--;
        }
        schnitt = noten / anzahl;
        System.out.printf("Euer Exzellenz haben einen Notendurchschnitt von %.2f erreicht. \nDieser Wert wurde zur Veranschaulichung auf zwei Nachkommastellen gerundet.\n", schnitt);
    }
}
