package blatt02;

import java.util.Scanner;

public class Talking {
    public static void main(String[] args) {
        System.out.println("Shalom, wie heißen Sie?"); //hier wird dem Nutzer*in erklärt, was er/sie/es einzugeben hat
        Scanner namenfragen = new Scanner(System.in); //hier wird die Möglichkeit einer Eingabe geschaffen
        System.out.println("Shalom, " + namenfragen.next() + "!"); //hier wird die eingabe genutzt um den Nutzer mit Namen zu grüßen
    }
}
