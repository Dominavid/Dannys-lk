package blatt03;

import javax.print.DocFlavor;
import java.util.Scanner;

public class MitOderOhneStrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte wählt zwischen NOT, OR, AND und XOR, Sir");
        String eingabe = sc.nextLine().toUpperCase();
        if (eingabe.equals("NOT")) { //Das not gatter
            System.out.println("Das NOT-Gatter verfügt über einen Eingang und einen Ausgang, Sir. Es gibt nur dann ein Signal ab, wenn es keines erhält und umgekehrt.\nBefindet sich auf dem Eingang Strom, Sir? (true/false)");
            if (sc.nextBoolean()) { //strom an
                System.out.println("In diesem Fall würde das Gatter kein Signal senden, Sir.");
            } else { //strom aus
                System.out.println("In diesem Fall würde das Gatter ein Signal senden, Sir.");
            }

        } else if (eingabe.equals("OR")) { //Das or Gatter
            System.out.println("Das OR-Gatter verfügt über beliebig viele Eingänge und einen Ausgang, Sir. Es reicht wenn ein einziger Eingang ein Signal erhält damit es in den Ausgang weitergeleitet wird.\nBefindet sich auf einem der Eingänge Strom, Sir? (true/false)");
            if (sc.nextBoolean()) { //strom an
                System.out.println("In diesem Fall wird unabhängig von anderen Eingängen immer ein Signal ausgegeben werden, Sir.");
            } else { //strom aus
                System.out.println("Wenn keiner der Eingänge ein Signal erhält, wird auch keines ausgegeben, Sir.");
            }

        } else if (eingabe.equals("AND")) { //das and gatter
            System.out.println("Das AND-Gatter verfügt über beliebig viele Eingänge und einen Ausgang, Sir. Nur wenn alle Eingänge ein Signal erhalten, wird dieses auch weitergegeben.\nGehen wir der Einfachheit halber davon aus, dass das Gatter in diesem Fall über zwei Eingänge verfügt. Befindet sich auf dem ersten Eingang Strom, Sir? (true/false)");
            if (sc.nextBoolean()) { //strom an
                System.out.println("Und der zweite Eingang? (true/false)");
                if (sc.nextBoolean()) { //strom an,an
                    System.out.println("In diesem Fall wird das Gatter ein Signal senden, Sir.");
                }  else { //strom an,aus
                    System.out.println("In diesem Fall wird das Gatter trotz des ersten Eingangs kein Signal senden, Sir.");
                }
            } else { //strom aus
                System.out.println("In diesem Fall wird ungeachtet weiterer Eingänge kein Signal abgegeben werden, Sir.");
            }

        } else if (eingabe.equals("XOR")) { //xor gatter
            System.out.println("Das XOR-Gatter verfügt über beliebig viele Eingänge und einen Ausgang, Sir. Es darf nur exakt ein Eingang ein Signal erhalten, damit dieses weitergegeben wird.\nGehen wir der Einfachheit halber davon aus, dass das Gatter in diesem Fall über zwei Eingänge verfügt. Befindet sich auf dem ersten Eingang Strom, Sir? (true/false)");
            if (sc.nextBoolean()) { //Strom an
                System.out.println("Und der zweite Eingang? (true/false)");
                if (sc.nextBoolean()) { //Strom an,an
                    System.out.println("Bei mehreren eingehenden Signalen wird das Gatter keines abgeben, Sir.");
                } else { //strom an,aus
                    System.out.println("In diesem Fall wird das Gatter ein Signal abgeben, Sir.");
                }
            } else { //strom aus
                System.out.println("Und der zweite Eingang? (true/false)");
                if (sc.nextBoolean()) { //strom aus,an
                    System.out.println("In diesem Fall wird das Gatter ein Signal abgeben, Sir.");
                } else { //strom aus,aus
                    System.out.println("Wenn keiner der Eingänge ein Signal erhält, wird das Gatter keins abgeben, Sir.");
                }
            }
        }
    }
}
