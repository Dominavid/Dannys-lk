package blatt01;

public class Haendler {
    public static void main(String[] args) {
        int sdpreisnormal = 5;
        int sdpreismini = 8;
        int sdpreismicro = 12;

        int bestellmengenormal = 9;
        int bestellmengemini = 5;
        int bestellmengemicro = 0;

        int preisgesamt = sdpreisnormal * bestellmengenormal + sdpreismini * bestellmengemini + sdpreismicro * bestellmengemicro;

        System.out.println("Der Preis für...");
        System.out.println(bestellmengenormal + "normale SD-Karten\n" + bestellmengemini + "MiniSD-Karten\n" + bestellmengemicro + "MicroSD-Karten");
        System.out.println("...lautet " + preisgesamt + "€");
    }
}
//Zus. Frage 1: theoretisch nur 6, man könnte die rechnung des gesamtpreises in die printlinie schreiben, wäre aber unübersichtlich
//Zus. Frage 2: solange die Preise glatt sind int, sollten sie dies nicht sein, double
//Zus. Frage 3: den Kunden könnten zu hohe Preise berechnet werden, oder viel schlimmer zu niedrige