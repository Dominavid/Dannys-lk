package blatt01;

public class TypKonversation {
    public static void main(String[] args) {
        int a = 14;
        double b = -21.25;

        int c = (int) b;
        double d = (double) a;

        System.out.println(c);
        System.out.println(d);

        char e = 'a';
        int f = 65;

        int g = (int) e;
        char h = (char) f;

        System.out.println(g);
        System.out.println(h);
        /*
        boolean t = true;
        h = (char) t;
         */
    }
}
/*
a) das Programm gibt Variablen aus, die Vorher durch verschiedene Datentypen gejagt wurden, wodurch teils Daten verloren gingen.
b) aus einem Dezimalbruch wurde eine glatte Zahl und umgekehrt, was in ersterem Fall die Gefahr birgt, dass Nachkommastellen verloren gehen.
c) int ist eine glatte Zahl, die effizient gespeichert wird, aber nicht die Möglichkeit hat Dezimalbrüche zu speichern, während es bei double genau andersrum ist.
d) char ist ein Buchstabe, der sich im Falle einer Umwandlung zu/von einer zahl auf die Stelle im Alphabet bezieht, was bei Zahlen höher als 26 wieder von vorne zählt, ähnlich wie beim schriftlichen erstellen von Bildern.
e) es entsteht eine Fehlermeldung, da ein Wahrheitswert nicht logisch zu einem Buchstaben werden kann.
 */