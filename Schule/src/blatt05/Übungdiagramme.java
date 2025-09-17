package blatt05;

import java.util.Scanner;

public class Übungdiagramme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Was ist die Anzahl Eurer Noten, Sir?");
        int anzahl = input.nextInt();
        int noten = 0;
        int note = 0;

        while (anzahl > 0) {
            while (note < 1 && note > 6) {
                System.out.println("Welche Note haben Euer Exzellenz erreicht?");
                note = input.nextInt();
            }

        }
    }
}
