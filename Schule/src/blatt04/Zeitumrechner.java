package blatt04;

import java.util.Scanner;

public class Zeitumrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ihre Zahl in Sekunden, Sir?");
        int sekunden = input.nextInt();
        int jahre = 0;
        int tage = 0;
        int stunden = 0;
        int minuten = 0;

        while (sekunden >= 31536000) { //das extrem wichtige errechnen der Jahre (nein, ich spüre kein Verlangen, jahrtausende hinzuzufügen!!1eins)
            sekunden -= 31536000;
            jahre++;
        }
        while (sekunden >= 86400) { //errechnung der tage
            sekunden -= 86400;
            tage++;
        }
        while (sekunden >= 3600) { //errechnung der Stunden
        sekunden -= 3600;
        stunden++;
        }
        while (sekunden >= 60) { //errechnung der Minuten
        sekunden -= 60;
        minuten++;
        }

        System.out.println("Jahre. " + jahre + "\nTage: " + tage + "\nStunden: " + stunden + "\nMinuten: " + minuten + "\nSekunden: " + sekunden);
    }
}

// b) Da es für jeden Tag, jede Stunde und jede Minute je einmal durch eine Schleife muss, sind es bei mir 169 Durchläufe
// c) Eventuell ist es möglich, die Anzahl zu verringern, falls man die Rechnung mit Divisionen löst, dort müsste man aber mit Resten arbeiten, wenn man es reduzieren will. Da ich aber nicht das Verlangen spüre, herauszufinden, ob Divisionen mit Resten überhaupt möglich sind, belasse ich es bei meiner Lösung.