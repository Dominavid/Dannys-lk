package blatt20.aufgabe01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kaffemaschine {
    float bohnen = 1000;
    short wasser = 1000;
    byte dreck = 0;
    short kaffeesatz = 0;

    public void bohnenAuffuellen() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Euer Exzellenz können nun die Kaffeebohnen einfüllen. (Angabe in Gramm; Nachkommastellen möglich)");

        try {
            this.bohnen += (sc.nextFloat());
        } catch (InputMismatchException e) {
            System.out.println("Schere, fehlerhafte Eingaben");
        }
    }


    public void bohnenLeeren() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Möchten Euer Gnaden die Bohen ausleeren? (true/false)");

        try {
            if (sc.nextBoolean()) {
                this.bohnen = 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Schere, fehlerhafte Eingaben");
        }
        sc.close();
    }


    public void wasserAuffuellen() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Euer Exzellenz können nun das Wasser einfüllen. (Angabe in ml; Bitte nur ganze Zahlen)");

        try {
            this.wasser += (sc.nextShort());
        } catch (InputMismatchException e) {
            System.out.println("Schere, fehlerhafte Eingaben");
        }
        sc.close();
    }


    public void wasserLeeren() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Möchten Euer Gnaden die Bohen ausleeren? (true/false)");

        try {
            if (sc.nextBoolean()) {
                this.wasser = 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Schere, fehlerhafte Eingaben");
        }
        sc.close();
    }


    public void wasserReinigen() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Möchten Euer Gnaden das Wasser reinigen? (true/false)");

        try {
            if (sc.nextBoolean()) {
                this.dreck = 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Schere, fehlerhafte Eingaben");
        }
        sc.close();
    }


    public void kaffeesatzLeeren() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Möchten Euer Gnaden den Kaffeesatz ausleeren? (true/false)");

        try {
            if (sc.nextBoolean()) {
                this.kaffeesatz = 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Schere, fehlerhafte Eingaben");
        }
        sc.close();
    }
}
