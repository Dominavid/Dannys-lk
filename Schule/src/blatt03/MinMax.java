package blatt03;

import  java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Die erste Zahl, Sir?");
        int zahl1 = input.nextInt();
        System.out.println("Die zweite Zahl, Sir?");
        int zahl2 = input.nextInt();
        System.out.println("Die dritte Zahl, Sir?");
        int zahl3 = input.nextInt();

        if (zahl1 == zahl2 || zahl1 == zahl3 || zahl2 == zahl3) {
            System.out.println("Bitte keine gleichen Zahlen, Sir.");
        } else if (zahl1 > zahl2 && zahl1 > zahl3) { //erste Zahl die größte?
            if (zahl2 > zahl3) { //zweite Zahl größer?
                System.out.printf("%d ist die größte Zahl, danach kommen %d und %d, Sir.", zahl1, zahl2, zahl3);
            } else if (zahl2 < zahl3) { //dritte Zahl größer?
                System.out.printf("%d ist die größte Zahl, danach kommen %d und %d, Sir.", zahl1, zahl3, zahl2);
            }
        } else if (zahl2 > zahl1 && zahl2 > zahl3) { //zweite Zahl die größte?
            if (zahl1 > zahl3) { //erste Zahl größer?
                System.out.printf("%d ist die größte Zahl, danach kommen %d und %d, Sir.", zahl2, zahl1, zahl3);
            } else if (zahl1 < zahl3) { //dritte Zahl größer
                System.out.printf("%d ist die größte Zahl, danach kommen %d und %d, Sir.", zahl2, zahl3, zahl1);
            }
        } else if (zahl1 > zahl2) { //dritte Zahl per Ausschlussverfahren die größte, erste zahl größer?
            System.out.printf("%d ist die größte Zahl, danach kommen %d und %d, Sir.", zahl3, zahl1, zahl2);
        } else if (zahl1 < zahl2) { //zweite Zahl größer?
            System.out.printf("%d ist die größte Zahl, danach kommen %d und %d, Sir.", zahl3, zahl2, zahl1);
        }
    }
}
