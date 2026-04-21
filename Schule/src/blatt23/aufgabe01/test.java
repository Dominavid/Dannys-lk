package blatt23.aufgabe01;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Versuche möglichst nah an drei Sekunden zu kommen, dann mache eine eine beliebige Eingabe hehe");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("LOS!");
        long startzeit = System.nanoTime();
        String lul = sc.nextLine();
        long endzeit = System.nanoTime();

        if (endzeit - startzeit > 2500000000L && endzeit - startzeit < 3500000000L) {
            System.out.println("Herzlichen Glückwunsch! Der Drucker ist wieder heile (:");
        } else {
            System.out.println("\"Er hat sich stets bemüht.\"\n\n-Jeder deiner Lehrer");
        }
    }
}
