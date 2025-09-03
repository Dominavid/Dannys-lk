package blatt01;

public class Haendler {
    public static void main(String[] args) {
        int sd = 5;
        int minisd = 8;
        int microsd = 12;

        int mengesd = 9;
        int mengeminisd = 5;
        int mengemicrosd = 0;

        int preisgesamt = sd * mengesd + minisd * mengeminisd + microsd * mengemicrosd;

        System.out.println("Der Preis für...\n" + mengesd + " normale SD-Karten\n" + mengeminisd + " MiniSD-Karten\n" + mengemicrosd + " MicroSD-Karten\n" + "...lautet " + preisgesamt + "€");
    }
}
/*
1. Man benötigt eigentlich nur 6, da man die Rechnung auch direkt in der Print-Ausgabe verbauen könnte, dies wurde hier aus übersichtsgründen nicht angewendet.
2. Wenn es bei glatten Preisen bleibt, ist wie in diesem Fall der Int-Datentyp aufgrund der effizenteren Speicherung der praktischste, bei unglatten Zahlen wäre double der beste.
3. Es könnte durch einen Fehler im Code ein zu hoher oder - gott bewahre, ein zu niedriger Preis berechnet werden.
 */