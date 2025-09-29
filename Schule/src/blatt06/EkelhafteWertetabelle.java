package blatt06;

import java.util.Scanner;
//bitti bitti verzeihen Sie meine mangelnden Mathematik-Kenntnisse uwu
public class EkelhafteWertetabelle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie lange soll das Polynom gehen, wo auf der x-Achse liegt der Startpunkt und in wie großen Schritten soll das Ergebnis angegeben werden, Sir? Bitte gebt jeder Eingabe ihre eigene Zeile.");
        int länge = scanner.nextInt(), z = 1;
        double x = scanner.nextInt(), steigung = scanner.nextDouble();
        for (int n = länge; n > 0; n--) {
            System.out.println("Wie lautet a beim " + z + ". Wert, Sir?");
            System.out.println("Die Koordinaten lauten x = " + x + "; y = " + (scanner.nextDouble() * Math.pow(x, n)));
            x += steigung;
            z++;
        }
        //(hiermit ergebe ich mich und nehme die -ꝏ Punkte auf meine Kappe)
    }
}