package blatt06;

import java.util.Arrays;
import java.util.Collections;
import  java.util.Random;

public class DasErsteArray {
    public static void  main(String[] args){
        Random random = new Random();
        Integer[] langesarray = new Integer[990];
        for (int i = 0; i < langesarray.length; i++) {
            langesarray[i] = random.nextInt(989) + 10;
        }

        System.out.println("Hier kommen die Werte, sortiert vom niedrigsten zum höchsten, Sir:");
        Arrays.sort(langesarray);
        for (int i = 0; i < langesarray.length; i++) {
            System.out.println(langesarray[i]);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Und nun vom höchsten zum niedrigsten, Sir:");
        for (int i = 0; i < langesarray.length / 2; i++) {
            int temp = langesarray[i];
            langesarray[i] = langesarray[langesarray.length - 1 - i];
            langesarray[langesarray.length - 1 - i] = temp;
        }
        for (int i = 0; i < langesarray.length; i++) {
            System.out.println(langesarray[i]);
        }
    }
}
