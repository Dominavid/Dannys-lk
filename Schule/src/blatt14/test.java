package blatt14;

public class test {


    public static void test(int x, int y) {
        x *= 2;
        y /= 2;
    }


    public static void main(String[] args) {
        int x = 100;
        int y = 100;
        System.out.println(x);
        System.out.println(y);

        test(x, y);

        System.out.println(x);
        System.out.println(y);
    }
}
