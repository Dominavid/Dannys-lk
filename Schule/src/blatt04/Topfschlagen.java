package blatt04;

import java.util.Scanner;
import java.util.Random;

public class Topfschlagen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int topfx = rand.nextInt(10) + 1;
        int topfy = rand.nextInt(10) + 1;
        int spielerx = 5;
        int spielery = 5;
        int distanzalt = 0;
        int distanzneu = 0;
        char bewegung;

        while (true) {
            System.out.println("Wohin planen Euer Exzellenz zu gehen? (W/A/S/D)");
            bewegung = input.next().toUpperCase().charAt(0);
            if (bewegung == 'W') {
                spielery++;
            } else if (bewegung == 'A') {
                spielerx--;
            } else if (bewegung == 'S') {
                spielery--;
            } else if (bewegung == 'D') {
                spielerx++;
            }
            if (spielerx == topfx && spielery == topfy) {
                System.out.println("SAUFEEEEEEN!");
                break;
            }

            distanzneu = Math.abs(spielery - topfy) +  Math.abs(spielerx - topfx);
            if (distanzneu < distanzalt) {
                System.out.println("Warm");
            } else if (distanzneu > distanzalt) {
                System.out.println("Kalt");
            } else {
                System.out.println("Lauwarm");
            }
            distanzalt = distanzneu;

        }
    }
}
