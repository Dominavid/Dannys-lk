package blatt08;

public class Klammernsprache {

    public static boolean istKlammerwort(String arr) {
        char[] a = arr.toCharArray();
        int offeneklammern = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '(') {
                offeneklammern++;
            } else if (a[i] == ')') {
                offeneklammern--;
            } else {
                System.out.println("Euer Exzellenz mögen verzeihen, dies ist kein Klammerwort.");
                return false;
            }
            if (offeneklammern < 0) {
                return false;
            }
        }
        if (offeneklammern == 0) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        String a = "(()(()))";
        if (istKlammerwort(a)) {
            System.out.println(a + " ist korrekt, Sir.");
        } else {
            System.out.println(a + " ist nicht korrekt, Sir.");
        }
    }
}
