package blatt03;

import java.util.Scanner;

public class PQ {
    public static void main(String[] args) { //diverse Mathematische Formeln die meinen Intellekt überschreiten und deswegen nicht von mir angewand werden können
        Scanner input = new Scanner(System.in);
        System.out.println("Der Wert für P, Sir?");
        double p = input.nextDouble();
        System.out.println("Der Wert für Q, Sir?");
        double q = input.nextDouble();
        if (p < 0 || q < 0) {
            System.out.println("Bitte keine negativen Zahlen, Sir.");
            System.exit(0);
        }
        double x1nervt = (p/2) * (p/2) - q;
        double x1 = -p/q + Math.sqrt(x1nervt);
        double x2 = -p/q - Math.sqrt((p/2) * (p/2) - q);

        System.out.printf("x1 beträgt %f und x2 beträgt %f, Sir.", x1, x2);
    }
}
