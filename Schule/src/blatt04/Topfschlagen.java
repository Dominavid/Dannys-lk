package blatt04;

import java.util.Scanner;
import java.util.Random;

public class Topfschlagen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int shots = 0;

        System.out.println("   _____       .___ ___________            _____             .__    .__                                \n  /  |  |    __| _/ \\__    ___/___ _______/ ____\\______ ____ |  |__ |  | _____     ____   ____   ____  \n /   |  |_  / __ |    |    | /  _ \\\\____ \\   __\\/  ___// ___\\|  |  \\|  | \\__  \\   / ___\\_/ __ \\ /    \\ \n/    ^   / / /_/ |    |    |(  <_> )  |_> >  |  \\___ \\\\  \\___|   Y  \\  |__/ __ \\_/ /_/  >  ___/|   |  \\\n\\____   |  \\____ |    |____| \\____/|   __/|__| /____  >\\___  >___|  /____(____  /\\___  / \\___  >___|  /\n     |__|       \\/                 |__|             \\/     \\/     \\/          \\//_____/      \\/     \\/ ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\n\n(_)     (_) | (_|_)                    \n _ _ __  _| |_ _ _  ___ _ __ ___ _ __  \n| | '_ \\| | __| | |/ _ \\ '__/ _ \\ '_ \\ \n| | | | | | |_| | |  __/ | |  __/ | | |\n|_|_| |_|_|\\__|_|_|\\___|_|  \\___|_| |_| ");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("(_) ");
        }


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

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("\n\n\nPro Fehler 1 Shot (:\n\n\n");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true) {
            System.out.println("Wohin planen Euer Exzellenz zu gehen? (W/A/S/D/Q/E/Y/X)");
            bewegung = input.next().toUpperCase().charAt(0);

//Verarbeitung eingabe
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
            } else if (bewegung == 'E') {
                spielery--;
            } else if (bewegung == 'Y') {
				spielert++;
			} else if (bewegung == 'X') {
				spielert--;
			}

            if (spielerx == topfx && spielery == topfy && spielerz == topfz &&  topft == spielert) {
                System.out.println("\n\n\n  _________   _____   ____ __________________________________________________________ _______    ._._._.\n /   _____/  /  _  \\ |    |   \\_   _____/\\_   _____/\\_   _____/\\_   _____/\\_   _____/ \\      \\   | | | |\n \\_____  \\  /  /_\\  \\|    |   /|    __)   |    __)_  |    __)_  |    __)_  |    __)_  /   |   \\  | | | |\n /        \\/    |    \\    |  / |     \\    |        \\ |        \\ |        \\ |        \\/    |    \\  \\|\\|\\|\n/_______  /\\____|__  /______/  \\___  /   /_______  //_______  //_______  //_______  /\\____|__  /  ______\n        \\/         \\/              \\/            \\/         \\/         \\/         \\/         \\/   \\/\\/\\/");
                if (shots == 0) {
                    System.out.println("Keine Shots?\nDafür darfst du deinem Nebenmann eine klatschen (;");
                } else {
                    System.out.println(shots + " Shots!");
                }
                break;
            }

            distanzneu = Math.abs(spielery - topfy) +  Math.abs(spielerx - topfx) + Math.abs(spielerz - topfz) + Math.abs(spielert - topft);
            if (distanzalt != 0) {
                if (distanzneu < distanzalt) {
                    System.out.println("Warm");
                } else if (distanzneu > distanzalt) {
                    System.out.println("Kalt");
                    shots++;
                } else {
                    System.out.println("Lauwarm");
                }
            }
            distanzalt = distanzneu;

        }
    }
}

/*
System.out.println("4D-Topfschlagen");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("initiieren");
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("initiieren.");
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("initiieren..");
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("initiieren...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 */