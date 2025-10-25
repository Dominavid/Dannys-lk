package blatt08;

public class Zahlensysteme {

    /**
     * prüft ob ein String einen Binärwert darstellt
     * @param a String der geprüft wird
     * @return Ergebnis als Wahrheitswert
     */
    public static boolean istBinär(String a) {
        char[] arr = a.toCharArray();
        if (arr[arr.length - 1] == '₂') {
            //System.out.println("ist binär");
            return true;
        } else {
            return false;
        }
    }


    /**
     * prüft ob ein String eine Dezimalzahl ist
     * @param a String der geprüft wird
     * @return Ergebnis als Wahrheitswert
     */
    public static boolean istDezimal(String a) {
        char[] arr = a.toCharArray();
        if (arr[0] != '(') {
            //System.out.println("es ist dezimal");
            return true;
        } else {
            return false;
        }
    }

    /**
     * prüft ob ein String eine Hexadezimalzahl ist
     * @param a String der geprüft wird
     * @return Ergebnis als Wahrheitswert
     */
    public static boolean istHexadezimal(String a) {
        char[] arr = a.toCharArray();
        if (arr[arr.length - 1] == '₆') {
            //System.out.println("es ist hexa");
            return true;
        } else {
            return false;
        }
    }


    /**
     * Wandelt eine als String gespeicherte Binär-, Dezimal- oder Hexadezimalzahl zu einem Integer um.
     * @param a die als String gespeicherte Zahl
     * @return das Ergebnis
     */
    public static int zuDezimal(String a) {
        int ergebnis = 0;
        int stellenwert = 1;
        if (istBinär(a)) {
            char[] arr = a.toCharArray();
            for (int i = arr.length - 3; i >= 1; i--) {
                if (arr[i] == '1') {
                    ergebnis += stellenwert;
                }
                stellenwert *= 2;
            }
        } else if (istDezimal(a)) {
            //System.out.println("ich rechne mit dezimal");
            //ergebnis = (int) a; dann wohl altmodisch...
            char[] arr = a.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                ergebnis += (arr[i] - '0') * stellenwert;
                stellenwert *= 10;
            }
        } else if (istHexadezimal(a)) { //jetzt wirds ne gaudi (schnief)
            char[] arr = a.toCharArray();
            for (int i = arr.length - 4; i >= 1; i--) {
                if (arr[i] == '1' || arr[i] == '2' || arr[i] == '3' || arr[i] == '4' || arr[i] == '5' || arr[i] == '6' || arr[i] == '7' || arr[i] == '8' || arr[i] == '9') {
                    ergebnis += (arr[i] - '0') * stellenwert;
                } else if (Character.toUpperCase(arr[i]) == 'A') {
                    ergebnis += 10 * stellenwert;
                } else if (Character.toUpperCase(arr[i]) == 'B') {
                    ergebnis += 11 * stellenwert;
                } else if (Character.toUpperCase(arr[i]) == 'C') {
                    ergebnis += 12 * stellenwert;
                } else if (Character.toUpperCase(arr[i]) == 'D') {
                    ergebnis += 13 * stellenwert;
                } else if (Character.toUpperCase(arr[i]) == 'E') {
                    ergebnis += 14 * stellenwert;
                } else if (Character.toUpperCase(arr[i]) == 'F') {
                    ergebnis += 15 * stellenwert;
                } else {
                    System.out.println("Euer Gnaden mögen verzeihen, es scheint sich ein Fehler eingeschlichen zu haben.");
                    System.exit(0);
                }
                stellenwert *= 16;
            }
        } else {
            System.out.println("Euer Gnaden mögen verzeihen, hier wird keines der bekannten Zahlensysteme erkannt.");
            System.exit(0);
        }
        return ergebnis;
    }




    public static void main(String[] args) {
        String zahl = "51622";
        //zahl = "(C9A6)₁₆";
        //zahl = "(1100100110100110)₂";
        System.out.println("Sir, unsere Systeme besagen, dass die Zahl \"" + zahl + "\" als Integer \"" + zuDezimal(zahl) + "\" ergibt.");
    }
}
