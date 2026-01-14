package blatt13;

public class PenAndPaper {
    public static int wuerfel(int n, int x) {
        int z = 0;
        int[] e = Zufall.zufallArray(1, x, n);
        for (int i = 0; i < n; i++) {
            z += e[i];
        }
        return z;
    }



    public static boolean check(int a, boolean v, boolean n) {
        int b = wuerfel(1, 20);
        int c;
        if (v||n) {
            c = wuerfel(1, 20);
            if (c > b) {
                if (v) {
                    b = c;
                }
            } else if (n) {
                b = c;
            }
        }
        if (b == 1) {
            return false;
        } else if (b == 20) {
            return true;
        }
        return b >= a;
    }


    /**
     *
     * @param a Anzahl der Angriffswürfel
     * @param b Summe der Angriffswürfel
     * @param c Angriffsbonus
     * @param d Rüstungsklasse
     * @param v Vorteil?
     * @param n Nachteil?
     * @return
     */
    public static int angriff(int a, int b, int c, int d, boolean v, boolean n) {
        int z = wuerfel(a, b);
    }


    public static void main(String[] args) {}
}
