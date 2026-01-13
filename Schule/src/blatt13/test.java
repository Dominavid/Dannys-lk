package blatt13;

public class test {
    public static void main(String[] args) {
        for (double i = 0; i < 1; i += 0.00001) {
            System.out.printf("%.5f\n", i*i);
        }
    }
}
