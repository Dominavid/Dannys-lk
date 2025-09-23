package blatt06;

import java.util.Random;

public class TimosLieblingsDatentypII {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] auftragsnummern = new int[]{0,19,2,3,4,5,6,7,8,9,10,11,12};
        int[] auftragswerte = new int[]{9000,23000,41000,6000,13000,22000,38000,16000,7000,14000,12000,5000,17000};
        int[] auftragskosten = new int[auftragswerte.length];
        for (int i = 0; i < auftragswerte.length; i++) {
            auftragskosten[i] = rand.nextInt(21000) + 4000;
        }
        if (auftragsnummern.length != auftragswerte.length) {
            System.out.println("ACHTUNG! ACHTUNG! KRITISCHER FEHLER! SYSTEM SHUTDOWN INITIATING");
            System.exit(0);
        }

        for (int i = 0; i < auftragsnummern.length; i++) {
            System.out.println("Auftragsnummer: " + auftragsnummern[i] + "\t\t\t Auftragswert: " + auftragswerte[i] + " \t€");
        }
        System.out.println("\n\n\n Im Folgenden sehen Sie die Aufträge, mit Werten über 15.000 €, Sir.");
        int anzahlgroßeaufträge = 0;
        for (int i = 0; i < auftragsnummern.length; i++) {
            if (auftragswerte[i] > 15000) {
                System.out.println("Auftragsnummer: " + auftragsnummern[i] + "\t\t\t Auftragswert: " + auftragswerte[i] + " \t€");
                anzahlgroßeaufträge++;
            }
        }
        System.out.println("Das sind insgesamt " + anzahlgroßeaufträge + " Aufträge, Sir.");

        System.out.println("\n\n\nFolgende Aufträge sind profitabel:");
        for (int i = 0; i < auftragsnummern.length; i++) {
            if (auftragswerte[i] > auftragskosten[i]) {
                System.out.println("Auftrag " + auftragsnummern[i] + " wird " + (auftragswerte[i] - auftragskosten[i]) + " € Profit generieren, Sir.");
            }
        }
        System.out.println("\nFolgende Aufträge werden keinen Profit generieren:");
        for (int i = 0; i < auftragsnummern.length; i++) {
            if (auftragswerte[i] < auftragskosten[i]) {
                System.out.println("Auftrag " + auftragsnummern[i] + " wird " + (auftragskosten[i] - auftragswerte[i]) + " € Verlust verursachen, Sir.");
            }
        }
    }
}
