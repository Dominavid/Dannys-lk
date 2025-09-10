package blatt04;

import java.util.Scanner;
import java.util.Random;

public class Topfschlagen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int topfx = rand.nextInt(10) + 1;
        int topfy = rand.nextInt(10) + 1;
        int topfz = rand.nextInt(10) + 1;
		int topft = rand.nextInt(10) + 1;
        int spielerx = 5;
        int spielery = 5;
        int spielerz = 5;
		int spielert = 5;
        int distanzalt = Math.abs(spielerx - topfx) + Math.abs(spielery - topfy) + Math.abs(spielerz - topfz) + Math.abs(spielert - topft);
        int distanzneu = 0;
        char bewegung;

        while (true) {
            System.out.println("Wohin planen Euer Exzellenz zu gehen? (W/A/S/D/Q/E)");
            bewegung = input.next().toUpperCase().charAt(0);
            if (bewegung == 'W') {
                spielerz++;
            } else if (bewegung == 'A') {
                spielerx--;
            } else if (bewegung == 'S') {
                spielerz--;
            } else if (bewegung == 'D') {
                spielerx++;
            } else if (bewegung == 'Q') {
                spielery++;
            } else if (bewegung == 'E' {
                spielery--;
            }
            if (spielerx == topfx && spielery == topfy && spielerz == topft && spielert) {
                System.out.println("SAUFEEEEEEN!");
                break;
            }

            distanzneu = Math.abs(spielery - topfy) +  Math.abs(spielerx - topfx) + Math.abs(spielerz - topfz) + Math.abs(spielert - topft);
            if (distanzalt != 0) {
                if (distanzneu < distanzalt) {
                    System.out.println("Warm");
                } else if (distanzneu > distanzalt) {
                    System.out.println("Kalt");
                } else {
                    System.out.println("Lauwarm");
                }
            }
            distanzalt = distanzneu;

        }
    }
}
