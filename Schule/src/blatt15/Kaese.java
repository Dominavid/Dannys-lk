package blatt15;

import java.util.Scanner;

public class Kaese {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Gestatten euer Exzellenz das Ignorieren von Oberflächenspannung, sichtbaren Luftblasen und Teilen von Newtons Gesetzen für diese Simulation (uwu)? (true/false)");
            if (input.hasNextBoolean()) {
                System.out.println("Kuss digga"); //todo: noch gucken das alles richtig geschrieben ist (bedenke: wasser muss bergauf fließen gelassen werden um zu garantarien, das es jeden mäglichen ausweg findet, m. a. W.: fick dich <3
                break;
            } else {
                System.out.println("Dies würde dazu führen, dass bei engen Käselöchern im Vorraus gecheckt werden muss ob der Weg zu einer Öffnung führt, bei breiteren die nach oben wandernden Luftblasen angezeigt werden müssen und das Wasser erst so lange es geht nach unten und erst dann horizontal und weiter fließen müsste.");
            }
        }
    }
}
