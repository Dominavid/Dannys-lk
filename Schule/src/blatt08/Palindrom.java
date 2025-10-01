package blatt08;

public class Palindrom {

    /**
     * funktioniert dank Timosaurius' hilfe :-D
     * @param a
     * @return
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




    public static void main(String[] args) {
        String a = "TimoisteinsüßißüsnietsiomiT";
        if (a.equals(umkehren(a))) {
            System.out.println(a + " ergibt umgekehrt das gleiche, Sir.");
        } else {
            System.out.println(a + " ergibt umgekehrt nicht das gleiche, sondern " + umkehren(a) + ", Sir.");
        }
    }
}
