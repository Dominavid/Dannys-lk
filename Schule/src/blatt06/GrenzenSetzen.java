package blatt06;

import java.util.Scanner;

public class GrenzenSetzen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte gebt die Untergrenze an, Euer Exzellenz.");
        int u = input.nextInt();
        System.out.println("Und die Obergrenze, Sir?");
        int o = input.nextInt();
        if (o <= u) {
            System.out.println("Die Untergrenze sollte geringer als die Obergrenze sein, Sir.");
            System.exit(0);
        }   //Daten eingespeichert

        int[] zahlendazwischen = new int[o - u + 1];
        for (int i = u; i <= o; i++) {
            zahlendazwischen[i - u] = i;
        }
        System.out.println("Hier sind die Zahlen, Sir:");
        for (int i = 0; i < zahlendazwischen.length; i++) {
            System.out.println(zahlendazwischen[i]);
        }
    }
}