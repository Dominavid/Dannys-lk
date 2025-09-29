package blatt06;

import java.util.Scanner;

public class GesuchtGefunden {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[]{3.45, 7, 14, -66, 5.4, 33.33, 99.1, 42.3, 3.14, -3.14, 13.56, 7.8031, -54.35, 6.120, 6.435, -2.30001, 0.00005, -65.78, -29.57, 92, -83, 3174.56, -1469.349, -5.086, 27.135, 348.5, 52.3568, -47.320051, 8372.579, -593.2, 0.25874, -7.1952, 3587.6, -201.3, -65.92, 12, 5, 13.7, -30, 16.5, 10071, 1700.34, -50.05, 81.3576, -42};
        double höchstes = arr[0]; //erste Zahl des Arrays als Startwert, damit es auf sämtliche Arrays anwendbar ist
        for (int i = 0; i < arr.length; i++) {
            if (höchstes < arr[i]) {
                höchstes = arr[i];
            }
        } //Hurra! Auf wahrscheinlich gottlos ineffizente Weise den höchsten Wert gefunden :-D

        double niedrigstes = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (niedrigstes > arr[i]) {
                niedrigstes = arr[i];
            }
        } //Hurra! Auf genauso ineffizente Weise den niedrigsten Wert gefunden :-D

        double summe = 0; //da hier addiert wird kann getrost ein universeller Startwert genutzt werden:)
        for (int i = 0; i < arr.length; i++) {
            summe += arr[i];
        } //Wie nett! Ich musste nur Tab-Enter-Tab machen :-D (wenn Summe etwas anderes als das Ergebnis einer Addition ist bin ich gekocht)

        double paardifferenz = Math.abs(arr[0] - arr[1]); //ach leck mich doch am zückerli gar kein bock auf mathe D-:
        double temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = Math.abs(arr[i] - arr[i + 1]);
            if (temp < paardifferenz) {
                paardifferenz = temp;
            }
        } //yay, kleinste Paardifferenz gefunden :-D

        System.out.println("Möchten Euer Gnaden auf zwei Nachkommastellen gekürzte Werte erhalten? (true/false)"); //nicht ich, wie ich extra einen Scanner einbaue, weil Herr Schisch mir sonst entweder 5 Punkte wegen ungebetener Kürzung oder wegen fehlender Kürzung abziehen wird
        if (input.nextBoolean()) {
            System.out.printf("Euer Exzellenz, hier sind die Ergebnisse:\nHöchster Wert:\n\t\t\t%.2f\nNiedrigster Wert:\n\t\t\t%.2f\nSumme aller Werte:\n\t\t\t%.2f\nGeringste Paardifferenz:\n\t\t\t%.2f");

        } else {
            System.out.println("Euer Exzellenz, hier sind die Ergebnisse:\nHöchster Wert:\n\t\t\t" + höchstes + "\nNiedrigster Wert:\n\t\t\t" + niedrigstes + "\nSumme aller Werte:\n\t\t\t" + summe + "\nGeringste Paardifferenz:\n\t\t\t" + paardifferenz);
        }
    }
}