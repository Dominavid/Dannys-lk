package blatt08;

import java.util.Scanner;

public class Kalender {

    /**
     * dafür hätte es keine eigene Funktion gebraucht...
     * @param a Datum im TT.MM.JJJJ-Format
     * @return Tag als Integer
     */
    public static int getTag(String a) {
        char[] charArray = a.toCharArray();
        return (charArray[0] - '0') * 10 + (charArray[1] - '0');
    }


    /**
     * das ging schnell
     * @param a wieder Datum im TT.MM.JJJJ-Format
     * @return Monat als Integer
     */
    public static int getMonat(String a) {
        char[] charArray = a.toCharArray();
        return (charArray[3] - '0') * 10 + (charArray[4] - '0');
    }


    /**
     * ui, jetzt kommt abwechslung ins spiel
     * @param a immer noch Datum im TT.MM.JJJJ-Format
     * @return Jahr als Integer
     */
    public static int getJahr(String a) {
        char[] charArray = a.toCharArray();
        return (charArray[6] - '0') * 1000 + (charArray[7] - '0') * 100 + (charArray[8] - '0') * 10 + (charArray[9] - '0');
    }

    /**
     * testet, ob ein Jahr ein Schaltjahr ist
     * @param a das Jahr als Integer-Wert
     * @return Ergebnis als Wahrheitswert
     */
    public static boolean istSchaltjahr(int a) {
        if (a / 400 == (double) a / 400) {
            return true;
        } else if (a / 4 == (double) a / 4 && a / 100 != (double) a / 100) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * wandelt drei Integer zu einem String-Datum im TT.MM.JJJJ-Format um
     * @param t Der Tag als Integer
     * @param m Der Monat als Integer
     * @param j Das Jahr als Integer
     */
    public static String zuDatum(int t, int m, int j) {
        if (t < 1 || m < 1 || m > 12 || j > 9999 || j < 0) { //Fehlerkorrektur Anfang
            System.out.println("Euer Exzellenz mögen verzeihen, die Werte scheinen nicht korrekt zu sein.");
            System.exit(0);
        } else if (t == 29 && m == 2 && !istSchaltjahr(j)) {
            System.out.println("Euer Exzellenz mögen verzeihen, die Werte scheinen nicht korrekt zu sein.");
            System.exit(0);
        } else if (t == 30 && m == 2 && istSchaltjahr(j)) {
            System.out.println("Euer Exzellenz mögen verzeihen, die Werte scheinen nicht korrekt zu sein.");
            System.exit(0);
        } else if (t > 30 && m != 1 && m != 3 && m != 5 && m != 7 && m != 8 && m != 10 && m != 12) {
            System.out.println("Euer Exzellenz mögen verzeihen, die Werte scheinen nicht korrekt zu sein.");
            System.exit(0);
        }

        char[] datum = new char[10];
        datum[2] = '.';
        datum[5] = '.';


        if (t < 10) {
            datum[0] = '0';
            datum[1] = (char) (t + 48);
        } else {
            int tx = t /10;
            datum[0] = (char) (tx + 48);
            tx = t - tx * 10;
            datum[1] = (char) (tx + 48);
        }

        if (m < 10) {
            datum[3] = '0';
            datum[4] = (char) (m + 48);
        } else {
            int mx = m /10;
            datum[3] = (char) (mx + 48);
            mx = m - mx * 10;
            datum[4] = (char) (mx + 48);
        }

        if (j < 10) {
            datum[6] = '0';
            datum[7] = '0';
            datum[8] = '0';
            datum[9] = (char) (j + 48);
        } else if (j < 100) {
            int jx = j / 10;
            datum[6] = '0';
            datum[7] = '0';
            datum[8] = (char) (jx + 48);
            jx = j - jx * 10;
            datum[9] = (char) (jx + 48);
        } else if (j < 1000) {
            int jx = j / 100;
            datum[6] = '0';
            datum[7] = (char) (jx + 48);
            jx = (j - jx * 100) / 10;
            datum[8] = (char) (jx + 48);
            jx = j - jx * 10;
            datum[9] = (char) (jx + 48);
        } else {
            int jx = j / 1000;
            datum[6] = (char) (jx + 48);
            int jy = jx * 1000;
            jx = (j - jy) / 100;
            datum[7] = (char) (jx + 48);
            jy += jx * 100;
            jx = (j - jy) / 10;
            datum[8] = (char) (jx + 48);
            jy += jx * 10;
            jx = j - jy;
            datum[9] = (char) (jx + 48);
        }


        return new String(datum);
    }


    /**
     * Es wird ein Datum als String im TT.MM.JJJJ-Format empfangen und im gleichen Format, jedoch einen Tag später zurückgegeben
     * @param datum Datum als String im TT.MM.JJJJ-Format
     * @return Datum als String einen Tag später im gleichen Format.
     */
    public static String naechsterTag(String datum) {
        int t = getTag(datum);
        int m = getMonat(datum);
        int j = getJahr(datum);
        if (t < 28) {
            t++;
        } else if (t == 28 && (m != 2 || istSchaltjahr(j))) {
            t++;
        } else if (t == 29 && m != 2) {
            t++;
        } else if (t == 30 && m != 1 && m != 3 && m != 5 && m != 7 && m != 8 && m != 10 && m != 12) {
            t++;
        } else {
            t = 1;
            m++;
            if (m > 12) {
                m = 1;
                j++;
            }
        }
        return zuDatum(t, m, j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Datum im TT.MM.JJJJ-Format eingeben:");
        String datum = sc.nextLine();
        if (datum.length() != 10) {
            System.out.println("Euer Gnaden scheinen sich im Format vertan zu haben.");
            System.exit(0);
        }
        if (getTag(datum) == 11 && getMonat(datum) == 11) { //kleines easter egg (:
            System.out.println("HELAU!");
        }
        System.out.println("Der Tag ist der " + getTag(datum) + "., Sir."); //ich hoffe das Komma darf auf den Punkt folgen
        System.out.println("Der Monat ist der " + getMonat(datum) + "., Sir.");
        System.out.println("Wir schreiben das Jahr des Herrn " + getJahr(datum) + " nach der Geburt Christi, oh edler Meister der Code-Korrekturen.");
        System.out.println("Ist es ein Schaltjahr? " +  istSchaltjahr(getJahr(datum)));
        int tt = getTag(datum);
        int mm = getMonat(datum);
        int jjjj = getJahr(datum);
        System.out.println("Wenn der Tag der " + tt + ". ist, der Monat der " + mm + ". und wir das Jahr " + jjjj + " haben, ist das Datum als ganzes " + zuDatum(tt, mm, jjjj) + ", Sir.");
        System.out.println("Da heute der " + datum + " ist morgen der " + naechsterTag(datum) + ", Sir.");
    }
}
