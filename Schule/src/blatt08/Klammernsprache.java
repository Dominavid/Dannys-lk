package blatt08;

public class Klammernsprache {

    /**
     * Testet, ob es ein Klammerwort ist.
     * @param arr der String der auf Klammerwortheit getestet wird (Achievement "Neues Wort erfunden" unlocked)
     * @return Wahrheitswert ob es ein Klammerwort ist.
     */
    public static boolean istKlammerwort(String arr) {
        char[] a = arr.toCharArray();
        int offeneklammern = 0;
        boolean reinheit = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '[' || a[i] == '(' || a[i] == '{') {
                offeneklammern++;
            } else if (a[i] == ']' || a[i] == ')' || a[i] == '}') {
                offeneklammern--;
            } else {
                reinheit = false;
            }
            if (offeneklammern < 0) {
                return false;
            }
        }
        if (!reinheit) {
            System.out.println("Euer Hochwohlgeborenheit mögen zur Kenntnis nehmen, dass es sich hierbei nicht um ein reines Klammerwort handelt, sondern andere Zeichen enthält, die hierbei ignoriert wurden.\n\n");
        }
        if (offeneklammern == 0) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        String a = "[-3, [[-4,[-1,5], [2,6]]], [1,5]], [2,[[-1,2], [1,[[-1,6], [1,3]]]]]";
        if (istKlammerwort(a)) {
            System.out.println(a + " ist ein korrektes Klammerwort, Sir.");
        } else {
            System.out.println(a + " ist kein korrektes Klammerwort, Sir.");
        }
    }
}
