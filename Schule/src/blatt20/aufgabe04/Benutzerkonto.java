package blatt20.aufgabe04;

import java.time.LocalTime;

public class Benutzerkonto {
    private int[] gutscheinCodes = blatt13.Zufall.zufallArray(1000000000, 2147483647, 50);

    private String nutzername;
    private String email;
    private int geburtsdatum;
    private LocalTime kontoerstellung;

    private String passwort;
    private float guthaben;


    public Benutzerkonto(String nutzername, String email, int geburtsdatum, String passwort) {
        this.nutzername = nutzername;
        this.email = email;
        this.geburtsdatum = geburtsdatum;
        this.passwort = passwort;
        this.guthaben = 19.99f;
        this.kontoerstellung = LocalTime.now();
    }


    public String getNutzername() {
        return this.nutzername;
    }

    public String getEmail() {
        return this.email;
    }

    public short getGeburtsdatum() {
        return this.geburtsdatum;
    }

    public String getPasswort() {
        return this.passwort;
    }

    public float getGuthaben() {
        return this.guthaben;
    }


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

    public void namenÄndern(String neuername, String passwort) {
        if (!this.passwort.equals(passwort)) {
            System.out.println("Passwort falsch");
            return;
        }

        System.out.println("Sorry, wir sind eine Arschlochfirma und erlauben keine Änderungen am Nutzernamen");
    }

    public void emailÄndern(String neueemail, String passwort) {
        if (!this.passwort.equals(passwort)) {
            System.out.println("Passwort falsch");
            return;
        }

        System.out.println("Sorry, wir sind eine Arschlochfirma und erlauben keine Änderungen an der E-Mail adresse");
    }

    public void gutscheinEinlösen(int gutscheincode, float gutscheinwert) {
        for (int i = 0; i < this.gutscheinCodes.length; i++) {
            if (gutscheincode == this.gutscheinCodes[i]) {
                this.guthaben += gutscheinwert;
            }
        }
    }
}
