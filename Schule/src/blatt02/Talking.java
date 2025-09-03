package blatt02;

import java.util.Scanner; //gebe die Möglichkeit, nach eingaben zu fragen

public class Talking
{
	public static void main(String[] args) {
        System.out.println("Shalom, wie heißen Sie?"); //Frage den Nutzer nach seinem Namen
        Scanner name = new Scanner(System.in); //bereite abspeichern des Namens vor
        String nutzername = name.nextLine(); //erstelle unnötigerweise eine Variable des Namens
        System.out.println("Shalom, " + nutzername + "!"); //nutze die Variable, obwohl das "name.nextLine()" genausogut hier stehen könnte.
    }
}
