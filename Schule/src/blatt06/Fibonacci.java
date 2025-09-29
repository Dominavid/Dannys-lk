package blatt06;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Fibonacci-Zahlen möchten Euer Exzellenz haben?");
        int n = input.nextInt(); //nicht ich wie ich einen unnötigen Schritt einbaue, um keine 5 Punkte Abzug zu bekommen, weil die Länge nicht als n definiert ist
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
        double quotient = (double) fibonacci[n - 1] / fibonacci[n - 2];
        System.out.println("Die Werte wurden berechnet. Möchten Euer Exzellenz diese ausgegeben haben? (true/false)");
        if (input.nextBoolean()) {
            System.out.println("Hier sind die Fibonacci-Zahlen:");
            for (int i = 1; i < fibonacci.length; i++) {
                System.out.println(fibonacci[i]);
            }
            System.out.printf("\n\nNun kommt der Quotient aus den beiden höchsten Fibonacci-Zahlen:\t%.2f\nIch habe mir erlaubt, diesen auf zwei Nachkommastellen zu runden.", quotient);
        }
        //Sollte n = unendlich sein, würden auch die Fibonacci-Zahlen ins unendliche wachsen, wodurch eine Division unendlich / unendlich wäre, was praktisch nicht zu erreichen ist, in der Theorie 1 ergeben würde, und unendlich viel Rechenzeit benötigen würde.
    }
}