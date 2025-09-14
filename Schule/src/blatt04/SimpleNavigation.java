package blatt04;

import java.util.Scanner;

public class SimpleNavigation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Die X-Koordinate des ersten Punktes, Sir?");
        int x1 = input.nextInt();
        System.out.println("Die Y-Koordinate des ersten Punktes, Sir?");
        int y1 = input.nextInt();
        System.out.println("Die X-Koordinate des zweiten Punktes, Sir?");
        int x2 = input.nextInt();
        System.out.println("Die Y-Koordinate des zweiten Punktes, Sir?");
        int y2 = input.nextInt();
            //Punkte eingelesen

        while (x1 < x2) { //Bewegung nach rechts
            System.out.println("Rechts\nneue Koordinaten:\t" + x1 + "\t" + y1);
            x1++;
        }
        while (y1 < y2) { //Bewegung nach oben
            System.out.println("Hoch\nneue Koordinaten:\t" + x1 + "\t" + y1);
            y1++;
        }
        while (x1 > x2) { //nach links
            System.out.println("Links\nneue Koordinaten:\t" + x1 + "\t" + y1);
            x1--;
        }
        while (y1 > y2) { //nach unten
            System.out.println("Runter\nneue Koordinaten:\t" + x1 + "\t" + y1);
            y1--;
        }
            //Punkte sind jetzt an der gleichen Stelle

        if (x1 == x2 && y1 == y2) {
            System.out.println("\n\nDie Punkte trafen sich bei den Koordinaten\t" + x1 + "\t" + y1 + ", Sir.");
        } else { //falls mein Code nicht funktioniert (unrealistisches, gar utopisches Szenario, ich weiß)
            System.out.println("error");
            System.exit(0);
        }
    }
}

//obwohl ich schlafen müsste hat mein Arsch ein unstillbares Verlangen noch eine dritte und vierte Dimension hinzuzufügen