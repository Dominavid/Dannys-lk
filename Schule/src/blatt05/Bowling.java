package blatt05;

import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiplikator = 1;
        int punkte = 0;
        int umgeworfen = 0;
        int umgeworfen2 = 0;
        boolean strike = false;

        while (punkte < 300) {
            System.out.println("Wie viele Kegel haben Euer Exzellenz umgeworfen?");
            umgeworfen = input.nextInt();
            if (umgeworfen == 10) {
                System.out.println("Euer Gnaden haben einen Strike geworfen. Gratulation!");
                if (umgeworfen > 10) {
                    System.out.println("Cheater detected, Wurf rejected");
                    umgeworfen = 0;
                }
                punkte += umgeworfen * multiplikator;
                multiplikator++;
                strike = true;
                if (!strike && multiplikator > 1) {
                    multiplikator--;
                }
            } else {
                System.out.println("Wie viele Kegel haben Euer Gnaden im zweiten Wurf umgeworfen");
                umgeworfen += input.nextInt();
                if (umgeworfen + umgeworfen2 == 10) {
                    System.out.println("Euer Gnaden haben einen Spare geworfen. Gratulation!");
                    multiplikator++;
                    if (umgeworfen + umgeworfen2 > 10) {
                        System.out.println("Cheater detected, Wurf rejected");
                        umgeworfen = 0;
                        umgeworfen2 = 0;
                    }
                }
                punkte += (umgeworfen + umgeworfen2) * multiplikator;
                if (!strike && multiplikator > 1) {
                    multiplikator--;
                } else {
                    strike = false;
                }
            }
        }
        System.out.println("Euer Ehren haben gewonnen!");
    }
}
