package blatt02;

import java.util.Scanner;

public class AmiiboKostenRechner {
    public static void main(String[] args) {
        System.out.println("Wie viele Amiibos möchten der Herr erwerben?");
        Scanner anzahlamiibos = new Scanner(System.in);
        System.out.println("Das wären dann " + anzahlamiibos.nextInt() * 15 + "€ plus Trinkgeld, Sir."); //TODO: Preis erhöhen
    }
}
