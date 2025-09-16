package blatt05;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A?");
        int a = input.nextInt();
        System.out.println("B?");
        int b = input.nextInt();
        int h;
        while (a != b) {
            if (a <= b) {
                h = a;
                a = b;
                b = h;
            }
            a -= b;
        }
        System.out.println(a);
    }
}
