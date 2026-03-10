package blatt20.aufgabe00;

import java.util.Scanner;

public class Fahrrad {
      byte[] geschwindigkeit = new byte[] {0, 0, 0};
      boolean[] klingeln = new boolean[] {false, false, false};
      boolean[] fahren = new boolean[] {false, false, false};
      byte[][] gangvorne = new byte[][] {{1, 2}, {1, 3}, {1, 1}};
      byte[][] ganghinten = new byte[][] {{1, 7}, {1, 8}, {1, 1}};
      float[] bremsen = new float[] {0.0F, 0.0F, 0.0F};
      int genutztesfahrrad = 0;


    public void aufsatteln() {
        Scanner sc = new Scanner(System.in);
        this.fahren[this.genutztesfahrrad] = true;

    }


    public void fahren(Scanner sc) {
        while (true) {
            System.out.println("Aktuelle Geschwindigkeit:\t" + this.geschwindigkeit[this.genutztesfahrrad]);
            System.out.println("In die Pedale treten? (leicht/mittel/stark/gar nicht/schalten)");
            String strampel = sc.nextLine();
            if (strampel.equals("leicht")) {
                this.geschwindigkeit[this.genutztesfahrrad] += (byte)(0.2 * (((double)this.gangvorne[this.genutztesfahrrad][0]) / 2) * this.ganghinten[this.genutztesfahrrad][0]);
            } else if (strampel.equals("mittel")) {
                this.geschwindigkeit[this.genutztesfahrrad] += (byte)(0.4 * (((double)this.gangvorne[this.genutztesfahrrad][0]) / 2) * this.ganghinten[this.genutztesfahrrad][0]);
            } else if (strampel.equals("stark")) {
                this.geschwindigkeit[this.genutztesfahrrad] += (byte)(0.8 * (((double)this.gangvorne[this.genutztesfahrrad][0]) / 2) * this.ganghinten[this.genutztesfahrrad][0]);
            } else if (strampel.equals("gar nicht")) {
                break;
            }
        }

        while (true) {
            System.out.println("Aktuelle Geschwindigkeit:\t" + this.geschwindigkeit[this.genutztesfahrrad]);
            System.out.println("Bremsen? (0.0F-1.0F)");
            float bremse = sc.nextFloat();
            if (bremse < 0.0F) {}
        }
    }


    public void schalten(Scanner sc) {
        System.out.println("Gang vorne:\t" + this.gangvorne[this.genutztesfahrrad][0] + " von " + this.gangvorne[this.genutztesfahrrad][1] + "\nGewünschten Gang eingeben:");
        byte gang
    }


    public static void main(String[] args) {
        String[] typ = new String[] {"Rennrad", "Mountainbike", "BMX"};
        String[] marke = new String[] {"KS-Cycling", "Santa Cruz", "WTP"};
        boolean[] reflektoren_pedale = new boolean[] {true, true, false};
        String[][] farben = new String[][]{{"schwarz", "blau", "orange"}, {"lila", "schwarz"}, {"blau", "schwarz", "weiß"}};
        short[] reifendurchmessermm = new short[] {600, 622, 406};
        boolean[] zulassung = new boolean[] {false, true, false};
        boolean ruecklicht = true;
        boolean frontlicht = false;
    }
}
