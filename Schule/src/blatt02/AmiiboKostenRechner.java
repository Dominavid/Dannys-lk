package blatt02;

import java.util.Scanner;

public class AmiiboKostenRechner {
    public static void main(String[] args) {
        System.out.println("Wieviele Amiibos möchten der Herr käuflich erwerben?");
        Scanner anzahlamiibos = new Scanner(System.in);
        System.out.println("Das wären dann " + anzahlamiibos.nextInt() * 15 + "€ sir."); //TODO: Preis erhöhen
    }
}
