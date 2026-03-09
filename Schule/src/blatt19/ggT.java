package blatt19;

public class ggT {
    public static int ggT(int m, int n) {
        if (m == n) {
            return m;
        } else if (m > n) {
            return ggT(m - n, n);
        } else {
            return ggT(m, n - m);
        }
    }
}
