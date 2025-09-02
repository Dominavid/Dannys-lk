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

        /*boolean t = true;
        h = (char) t;*/
    }
}
/*
a) es sind einige zusammenhangslose werte die vorher durch verschiedene arten von variablen gejagt wurden, und dadurch teilweise daten verloren ingen
b) der wert in int wurde zu double, und der wert in double zu int
c) int verbraucht weniger speicher, wodurch es immer dann genutzt werden sollte wenn es um ganze zahlen geht, aber double kann auch dezimalbrüche speichern. Bei double zu int gehen nachkommastellen verloren.
d) char beschreibt buchstaben und int zahlen, bei umwandlungen wird die stelle im alphabeth genutzt
e) es funktioniert nicht, da man eine wahrheitsangabe unmöglich zu einem buchstaben machen kann.
*/