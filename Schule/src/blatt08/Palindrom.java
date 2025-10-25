package blatt08;

public class Palindrom {

    /**
     * funktioniert dank Timosaurius' hilfe :-D
     * @param a String der umgedreht wird
     * @return umgedrehter String
     */
    public static String umkehren (String a) {
        char[] arr = a.toCharArray();
        char temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return new String(arr);
    }


    /**
     * prüft, ob ein String ein Palind-irgendwas ist
     * @param a der String der geprüft wird
     * @return Wahrheitswert, der sagt, ob es sich um dein Palindrom handelt
     */
    public static boolean istpalindrom (String a) {
        if (a.equals(umkehren(a))) {
            return true;
        } else  {
            return false;
        }
    }

    public static void main(String[] args) {
        String a = "TimoisteinsüßißüsnietsiomiT";
        if (istpalindrom(a)) {
            System.out.println(a + " ergibt umgekehrt das gleiche, Sir.");
        } else {
            System.out.println(a + " ergibt umgekehrt nicht das gleiche, sondern " + umkehren(a) + ", Sir.");
        }
    }
}
