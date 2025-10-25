package blatt08;

public class SuchenUndErsetzen {


    /**
     * Findet ein Zeichen und ersetzt es durch ein anderes
     * @param a Der String in dem das ganze passiert
     * @param b Das Symbol was am Ende im String ist
     * @param bb Das Symbol was ersetzt wird.
     * @return
     */
    public static String ersetzen (String a, char b, char bb) {
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == bb) {
                arr[i] = b;
            }
        }
        System.out.println("Es wurden sämtliche \"" + bb + "\"'s im String gefunden und durch \"" + b + "'s ersetzt, Sir. Sollte das Zeichen \"" + bb + "\" im String nicht vorgekommen sein, wurde dieser nicht verändert.\n\n");
        return new String(arr);
    }

    public static void main(String[] args) {
        String a = "Sir, ich werde Euch nun ein Symbol zeigen das auf gar amüsante Weise einer Figur aus dem Spiel \"Among Us\" ähnelt: \"x\"";
        char b = 'ඞ';
        char bFinden = 'x';
        System.out.println("Der fertige String lautet \"\n" + ersetzen(a, b, bFinden) + "\n\", Sir.");
    }
}
