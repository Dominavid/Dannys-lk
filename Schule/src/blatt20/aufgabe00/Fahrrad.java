package blatt20.aufgabe00;

import java.util.Scanner;

public class Fahrrad {
    byte[] geschwindigkeit = new byte[] {0, 0, 0};
    boolean[] klingeln = new boolean[] {false, false, false};
    boolean[] fahren = new boolean[] {false, false, false};
    byte[][] gangvorne = new byte[][] {{1, 2}, {1, 3}, {1, 1}};
    byte[][] ganghinten = new byte[][] {{1, 7}, {1, 8}, {1, 1}};
    int genutztesfahrrad = 0;

    String[] typ = new String[] {"Rennrad", "Mountainbike", "BMX"};
    String[] marke = new String[] {"KS-Cycling", "Santa Cruz", "WTP"};
    boolean[] reflektoren_pedale = new boolean[] {true, true, false};
    String[][] farben = new String[][]{{"schwarz", "blau", "orange"}, {"lila", "schwarz"}, {"blau", "schwarz", "weiß"}};
    short[] reifendurchmessermm = new short[] {600, 622, 406};
    boolean[] zulassung = new boolean[] {false, true, false};
    boolean[] ruecklicht = new boolean[] {true, true, false};
    boolean[] frontlicht = new boolean[] {false, true, false};
    byte[] bremskraft = new byte[] {50, 100, 80};

    public void aufsatteln() {
        Scanner sc = new Scanner(System.in);
        this.fahren[this.genutztesfahrrad] = true;

    }


    public void fahren(Scanner sc) {
        while (true) {
            System.out.println("Aktuelle Geschwindigkeit:\t" + this.geschwindigkeit[this.genutztesfahrrad]);
            System.out.println("Was tun? (in die Pedale treten/gar nichts/schalten/bremsen)");
            String aktion = sc.nextLine();

            if (aktion.equals("in die Pedale treten")) {
                System.out.println("Wie stark? (leicht/mittel/stark)");
                String strampel = sc.nextLine();

                if (strampel.equals("leicht")) {
                    this.geschwindigkeit[this.genutztesfahrrad] += (byte)(0.2F * ((((float)this.gangvorne[this.genutztesfahrrad][0]) / 2) * (float)this.ganghinten[this.genutztesfahrrad][0] * (float)this.reifendurchmessermm[this.genutztesfahrrad]/500));
                } else if (strampel.equals("mittel")) {
                    this.geschwindigkeit[this.genutztesfahrrad] += (byte)(0.4F * ((((float)this.gangvorne[this.genutztesfahrrad][0]) / 2) * (float)this.ganghinten[this.genutztesfahrrad][0] * (float)this.reifendurchmessermm[this.genutztesfahrrad]/500));
                } else if (strampel.equals("stark")) {
                    this.geschwindigkeit[this.genutztesfahrrad] += (byte)(0.8F * ((((float)this.gangvorne[this.genutztesfahrrad][0]) / 2) * (float)this.ganghinten[this.genutztesfahrrad][0] * (float)this.reifendurchmessermm[this.genutztesfahrrad]/500));
                }
            } else if (aktion.equals("gar nichts")) {
                break;
            } else if (aktion.equals("schalten")) {
                schalten(sc);
            } else if (aktion.equals("bremsen")) {
                bremsen(sc);
            }
        }
    }


    public void bremsen(Scanner sc) {
        System.out.println("Wie stark bremsen? (1-100)");
        byte bremse = sc.nextByte();
        if (bremse < 0 || bremse > 100) {
            System.out.println("Eingabe ungültig");
        } else {
            bremse *= this.bremskraft[this.genutztesfahrrad];
            if (bremse < 100) {
                System.out.println("Bremskraft zu schwach; kein gespürter Effekt");
            } else {
                bremse /= 100;
                this.geschwindigkeit[this.genutztesfahrrad] -= bremse;
                if (this.geschwindigkeit[this.genutztesfahrrad] < 0) {
                    this.geschwindigkeit[this.genutztesfahrrad] = 0;
                }
            }
        }
    }


    public void schalten(Scanner sc) {
        System.out.println("Gang vorne:\t" + this.gangvorne[this.genutztesfahrrad][0] + " von " + this.gangvorne[this.genutztesfahrrad][1] + "\nGewünschten Gang eingeben:");
        byte gang = sc.nextByte();
        if (gang > this.gangvorne[this.genutztesfahrrad][1] || gang < 0.0F) {
            System.out.println("Fehlerhafte Angaben");
        } else {
            this.gangvorne[this.genutztesfahrrad][0] = gang;
        }

        System.out.println("Gang hinten:\t" + this.ganghinten[this.genutztesfahrrad][0] + " von " + this.ganghinten[this.genutztesfahrrad][1] + "\nGewünschten Gang eingeben:");
        gang = sc.nextByte();
        if (gang > this.ganghinten[this.genutztesfahrrad][1] || gang < 0.0F) {
            System.out.println("Fehlerhafte Angaben");
        } else {
            this.ganghinten[this.genutztesfahrrad][0] = gang;
        }
    }
}
