package blatt03;

import java.util.Scanner;

public class MitOderOhneStrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte wählt zwischen NOT, OR, AND und XOR, Sir");
        if (sc.next() == "NOT") {
            System.out.println("Das NOT-Gatter verfügt über einen Eingang und einen Ausgang, Sir. Es gibt nur dann ein Signal ab, wenn es keines erhält und umgekehrt.\nBefindet sich auf dem Eingang Strom, Sir? (true/false)");
            if (sc.next() == "true") {}
        } else if (sc.next() == "OR") {
            System.out.println("Das OR-Gatter verfügt über beliebig viele Eingänge und einen Ausgang, Sir. Es reicht wenn ein einziger Eingang ein Signal erhält damit es in den Ausgang weitergeleitet wird.");
        } else if (sc.next() == "AND") {
            System.out.println("Das AND-Gatter verfügt über beliebig viele Eingänge und einen Ausgang, Sir. Nur wenn alle Eingänge ein Signal erhalten, wird dieses auch weitergegeben.");
        } else if (sc.next() == "XOR") {
            System.out.println("Das XOR-Gatter verfügt über beliebig viele Eingänge und einen Ausgang, Sir. Es darf nur exakt ein Eingang ein Signal erhalten, damit dieses weitergegeben wird.");
        }
    }
}
