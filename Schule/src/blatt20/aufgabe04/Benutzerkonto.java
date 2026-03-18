package blatt20.aufgabe04;

import java.time.LocalTime;
import java.util.Scanner;

public class Benutzerkonto {
    //TODO: Vielleicht sinnvoll 2D Array zu nutzen? Also Code, Guthaben, benutzt alle zusammen
    private int[] gutscheinCodes = blatt13.Zufall.zufallArray(1000000000, 2147483647, 50);
    private int[] gutscheinWert = blatt13.Zufall.zufallArray(-50, 1000000000, 50);
    //private boolean[] gutscheinBenutzt =

    private String nutzername;
    private String email;
    private int geburtsdatum;
    private LocalTime kontoerstellung;

    private String passwort;
    private double guthaben;


    public Benutzerkonto(String nutzername, String email, int geburtsdatum, String passwort) {
        this.nutzername = nutzername;
        this.email = email;
        this.geburtsdatum = geburtsdatum;
        this.passwort = passwort;
        this.guthaben = 19.99; //TODO: Warum Startguhaben von 19,99?
        this.kontoerstellung = LocalTime.now(); //TODO: ungenau, we geht um datum, nicht um die Uhrzeit auf die Millisekunde
    }


    public String getNutzername() {
        return this.nutzername;
    }

    public String getEmail() {
        return this.email;
    }

    public int getGeburtsdatum() {
        return this.geburtsdatum;
    }

    public double getGuthaben() {
        return this.guthaben;
    }

    //TODO: PasswortAendern (rename)
    public void passwortÄndern(String altespasswort, String neuespasswort, String passwortkontrolle) {
        if (!this.passwort.equals(altespasswort)) {
            System.out.println("Passwort falsch");
            return;
        }

        if (!neuespasswort.equals(passwortkontrolle)) {
            System.out.println("Passwörter stimmen nicht überein");
            return;
        }

        if (this.passwort.equals(altespasswort)) {
            System.out.println("Neues Passwort darf nicht identisch mit altem Passwort sein");
            return;
        }


        this.passwort = neuespasswort;
    }

    //TODO: WOZU?
    public String passwortAnzeigen() {
        Scanner input = new Scanner(System.in);
        short code = (short)(Math.random()*32000);
        System.out.println("Passwort zurücksetzungscode: " + code);
        System.out.println("Bitte Code eingeben:");
        if (input.nextShort() == code) {
            return this.passwort;
        }
        return "Code falsch.";
    }

    //TODO: Geiles Easteregg, könnte aber zu Problemen in 1/2 Jahr führen, wenn du nicht mehr weißt was das machen soll
    public void namenÄndern(String neuername, String passwort) {
        if (!this.passwort.equals(passwort)) {
            System.out.println("Passwort falsch");
            return;
        }

        System.out.println("Sorry, wir sind eine Arschlochfirma und erlauben keine Änderungen am Nutzernamen");
    }

    //TODO: siehe oben
    public void emailÄndern(String neueemail, String passwort) {
        if (!this.passwort.equals(passwort)) {
            System.out.println("Passwort falsch");
            return;
        }

        System.out.println("Sorry, wir sind eine Arschlochfirma und erlauben keine Änderungen an der E-Mail adresse");
    }

    //TODO: Unlogik., da der User den Wert selbst festlegen darf & keine Abbruchbedingung
    public void gutscheinEinlösen(int gutscheincode, float gutscheinwert) {
        for (int i = 0; i < this.gutscheinCodes.length; i++) {
            if (gutscheincode == this.gutscheinCodes[i]) {
                this.guthaben += gutscheinwert;
                break;
            }
        }
    }
}
