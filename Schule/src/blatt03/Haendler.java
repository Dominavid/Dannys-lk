package blatt03;

import java.util.Scanner;

public class Haendler {
    public static void main(String[] args) {
        Scanner anzahl = new Scanner(System.in);
        int sd = 5;
        int minisd = 8;
        int microsd = 12;

        System.out.println("Wie viele normale SD-Karten gedenken der Herr zu kaufen?");
        int mengesd = anzahl.nextInt();
        if (mengesd < 0) {
            System.out.println("Euer Exzellenz verzeihe, dass wir nicht vermögen negative Mengen zu verkaufen.");
            System.exit(0);
        } else if (mengesd > 50) {
            System.out.println("Euer Exzellenz verzeihe, dass wir nicht vermögen mehr als 50 Karten eines Typs zu verkaufen. Die Bestellmenge wurde auf 50 reduziert.");
            mengesd = 50;
        }
        System.out.println("Wie viele MiniSD-Karten gedenken der Herr zu kaufen?");
        int mengeminisd = anzahl.nextInt();
        if (mengeminisd < 0) {
            System.out.println("Euer Exzellenz verzeihe, dass wir nicht vermögen negative Mengen zu verkaufen.");
            System.exit(0);
        } else if (mengeminisd > 50) {
            System.out.println("Euer Exzellenz verzeihe, dass wir nicht vermögen mehr als 50 Karten eines Typs zu verkaufen. Die Bestellmenge wurde auf 50 reduziert.");
            mengeminisd = 50;
        }
        System.out.println("Wie viele MicroSD-Karten gedenken der Herr zu kaufen?");
        int mengemicrosd = anzahl.nextInt();
        if (mengemicrosd < 0) {
            System.out.println("Euer Exzellenz verzeihe, dass wir nicht vermögen negative Mengen zu verkaufen.");
            System.exit(0);
        } else if (mengemicrosd > 50) {
            System.out.println("Euer Exzellenz verzeihe, dass wir nicht vermögen mehr als 50 Karten eines Typs zu verkaufen. Die Bestellmenge wurde auf 50 reduziert.");
            mengemicrosd = 50;
        }
        double preisentgültig;
        String rabatt;

        int preisgesamt = sd * mengesd + minisd * mengeminisd + microsd * mengemicrosd;
        if (mengesd + mengeminisd + mengemicrosd > 15) {
            rabatt = "einen";
            preisentgültig = preisgesamt * 0.85;
        } else {
            rabatt = "keinen";
            preisentgültig = preisgesamt;
        }

        System.out.printf("Der Preis für...\n%d normale SD-Karten\n%d MiniSD-Karten\n%d MicroSD-Karten\n...lautet %d€, Sir.\nSie erhalten %s Rabatt in Höhe von 15%%, der Endpreis liegt bei %.2f€, Sir.", mengesd, mengeminisd, mengemicrosd,preisgesamt, rabatt, preisentgültig);
    }
}
