package blatt02;

import java.util.Scanner;

public class Multiplikation {
    public static void main(String[] args) {
        Scanner Zahl = new Scanner(System.in);
        System.out.println("Die erste Zahl, Sir?");
        int zahl1 = Zahl.nextInt();
        System.out.println("Die zweite Zahl, Sir?");
        int zahl2 = Zahl.nextInt();
        System.out.println("Die Rechnung lautet " + zahl1 + " * " + zahl2 + " = " + zahl1 * zahl2 +  ", Sir.");
    }
}
