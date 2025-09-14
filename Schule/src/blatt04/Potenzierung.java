package blatt04;

import java.util.Scanner;

public class Potenzierung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie lautet die Basis, Sir?");
        double basis = input.nextDouble();
        System.out.println("Und der Exponent, Sir?");
        int exponent = input.nextInt();
            //eingabe der Rechendaten

        int sooftgerechnet = 0;
        double ergebnis = basis;
        if (exponent <= 0) { //abfangen von nicht natürlichen Exponenten
            while (sooftgerechnet <= Math.abs(exponent)) { //ausrechnen von rechnungen mit 0 oder weniger als exponent
                ergebnis /= basis;
                sooftgerechnet++;
            }
        } else {
            sooftgerechnet++; //erhöhung dieses wertes zu beginn auf 1, da sonst einmal zu häufig gerechnet wird.
            while (sooftgerechnet < exponent) { //ausrechnen von rechnungen mit positivem exponent
                ergebnis *= basis;
                sooftgerechnet++;
            }
        }
            //ausgerechnet

        System.out.printf("Das Ergebnis lautet %.2f Sir. Dieses wurde zur Anschaulichkeit auf zwei Nachkommastellen gekürzt.", ergebnis);
    }
}
