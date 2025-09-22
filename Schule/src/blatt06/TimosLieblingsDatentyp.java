package blatt06;

import java.util.Scanner;

public class TimosLieblingsDatentyp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Buben sind in dem Kurs?");
        int[] noten = new int[Math.abs(input.nextInt())];

        for (int i = 0; i < noten.length; i++) {
            System.out.println("Welche Note hat der " + (i + 1) + ". Bube erreicht?");
            noten[i] = input.nextInt();
            if (noten[i] < 1 || noten[i] > 6) {
                System.out.println("Böses Foul! Die Note gibt's nicht.");
                System.exit(0);
            }
            if (noten[i] > 3) {
                System.out.println("Was ein Dödel!\n\n");
            } else {
                System.out.println("So ein fähiger Mann!\n\n");
            }
        }
    }
}
