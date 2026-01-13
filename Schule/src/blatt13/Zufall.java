package blatt13;


public class Zufall {

    public static double zufall(double b) {
        return Math.random()*(b);
    }


    public static void main(String[] args) {
        System.out.println(zufall(5.5));
    }
}
