package blatt06;

import java.util.Scanner;

public class DartMehrspieler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Spieler werden in dieser Runde teilnehmen, Sir?");
        int[] punkte = new int[Math.abs(input.nextInt())];
        for (int i = 0; i < punkte.length; i++) {
            punkte[i] = 501;
        }
        System.out.println("Einstellungen wurden gespeichert.\n");


        int spielerdran = 1;
        int wurf1;
        int wurf2;
        int wurf3;
        int wurf;
        while (true) {
            System.out.println("Spieler " + spielerdran + ", wie viele Punkte haben Euer Gnaden beim ersten Wurf erreicht?");
            wurf1 = Math.abs(input.nextInt());
            System.out.println("Wie viele Punkte haben Euer Gnaden beim zweiten Wurf erreicht?");
            wurf2 = Math.abs(input.nextInt());
            System.out.println("Wie viele Punkte haben Euer Gnaden beim dritten Wurf erreicht?");
            wurf3 = Math.abs(input.nextInt());

            wurf = wurf1 + wurf2 + wurf3;
            System.out.println("Euer Gnaden haben in dieser Runde " + (wurf) + " Punkte erreicht.");
            if (wurf1 > 60 || wurf2 > 60 || wurf3 > 60) {
                System.out.println("Diese Menge an Punkten ist ungültig. Diese Runde wird nicht in die Wertung einfließen.");
                wurf = 0;
            } else if (wurf > punkte[spielerdran - 1]) {
                System.out.println("Euer Hoheit haben zu viele Punkte erreicht. Diese Runde wird nicht in die Wertung einfließen.");
            } else {
                punkte[spielerdran - 1] -= wurf;
                System.out.println("Euer Gnaden haben nunmehr " + punkte[spielerdran - 1] + " Punkte zu erreichen.");
                if (punkte[spielerdran - 1] == 0) {
                    System.out.println("Damit haben Euer Exzellenz gewonnen. Herzlichen Glückwunsch, Spieler " + spielerdran + "!");
                    break;
                }
            }

            spielerdran++;
            if (spielerdran > punkte.length) {
                spielerdran = 1;
            }
        }
    }
}
