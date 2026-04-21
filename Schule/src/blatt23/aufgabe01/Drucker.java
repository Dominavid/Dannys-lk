package blatt23.aufgabe01;

import schisch_visualizer.SchischVisualizer;

import java.util.Scanner;

public class Drucker {
    private byte papierfach;
    private Gerätemodus gerätemodus;
    private Abonnement abonnement;
    private Druckart druckart;
    private Druckmodus druckmodus;
    private Verbindungsmodus verbindungsmodus;
    private byte ssI;//seiten seit Internet
    private short sdM;//seiten diesen Monat
    private short tintefarbe;
    private short tinteschwarzweiß;
    private boolean piS; //papier in Scanner


    public Drucker(Abonnement abo) {
        this.abonnement = abo;

        this.papierfach = -128;
        this.gerätemodus = Gerätemodus.STANDBY;
        this.druckart = Druckart.NORMAL;
        this.druckmodus = Druckmodus.SCHWARZWEISS;
        this.verbindungsmodus = Verbindungsmodus.ONLINE;
        this.ssI = 0;
        this.tintefarbe = 1000;
        this.tinteschwarzweiß = 1000;
        this.piS = false;

        this.sdM = abonnement.ppM;
    }

    //getter und setter fangen an
    public byte getPapierfach() {
        return papierfach;
    }
    public void papierAuffüllen(int papier) {
        if (this.papierfach+128+papier > 250) {
            System.out.println("Schere, nicht genug Platz im Papierfach.");
            this.papierfach = 122;
        } else {
            this.papierfach += papier;
        }


    }
    public Gerätemodus getGerätemodus() {
        return gerätemodus;
    }
    public void setGerätemodus(Gerätemodus gerätemodus) {
        this.gerätemodus = gerätemodus;
    }
    public void reparieren() {
        if (this.gerätemodus != Gerätemodus.FEHLER) {
            System.out.println("Gerät ist bereits heile");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Versuche möglichst nah an drei Sekunden zu kommen, dann mache eine eine beliebige Eingabe hehe");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("LOS!");
        long zeit = System.nanoTime();
        String lul = sc.nextLine();
        long endzeit = System.nanoTime();
        if (endzeit - zeit > 2750000000L && endzeit - zeit < 3250000000L) {
            System.out.println("Herzlichen Glückwunsch! Der Drucker ist wieder heile (:");
            this.gerätemodus = Gerätemodus.WARTUNG;
        } else {
            System.out.println("\"Er hat sich stets bemüht.\"\n\n-Jeder deiner Lehrer");
        }
    }
    public void wartungsschachtZu //todo: weiter
    public Abonnement getAbonnement() {
        return abonnement;
    }
    public void aboWechseln(int abo) {
        if (abo == 1) {
            this.abonnement = Abonnement.ASIATE;
        } else if (abo == 2) {
            this.abonnement = Abonnement.SMALL;
        } else if (abo == 3) {
            this.abonnement = Abonnement.MEDIUM;
        } else if (abo == 4) {
            this.abonnement = Abonnement.LARGE;
        } else if (abo == 5) {
            this.abonnement = Abonnement.SCHWARZER;
        } else {
            System.out.println("Schere, kein passendes Abo gewählt.");
            return;
        }

        this.neuesKontingent();
        System.out.println("Neues Kontingent hinzugefügt. Aktuelles Kontingent:\t" + this.sdM + ".");
    }
    public Druckart getDruckart() {
        return druckart;
    }
    public void setDruckart(Druckart druckart) {
        this.druckart = druckart;
    }
    public Druckmodus getDruckmodus() {
        return druckmodus;
    }
    public void setDruckmodus(Druckmodus druckmodus) {
        this.druckmodus = druckmodus;
    }
    public Verbindungsmodus getVerbindungsmodus() {
        return verbindungsmodus;
    }
    public void zuOnline() {
        this.verbindungsmodus = Verbindungsmodus.ONLINE;
        this.ssI = 0;
    }
    public void zuLokal() {
        this.verbindungsmodus = Verbindungsmodus.LOKAL;
    }
    public void zuOffline() {
        this.verbindungsmodus = Verbindungsmodus.OFFLINE;
    }
    public byte getSsI() {
        return ssI;
    }
    public short getSdM() {
        return sdM;
    }
    public void neuesKontingent() {
        this.sdM += this.abonnement.ppM;
    }
    public short getTintefarbe() {
        return tintefarbe;
    }
    public short getTinteschwarzweiß() {
        return tinteschwarzweiß;
    }
    private void tinteFüllen(Patronenart tinte) {
        if (tinte == Patronenart.FARBE) {
            this.tintefarbe = 1000;
        } else {
            this.tinteschwarzweiß = 1000;
        }
    }
    public boolean getPiS() {
        return this.piS;
    }
    public void legeAufGlas() {
        if (this.piS) {
            System.out.println("Schere, da ist schon eins");
        } else {
            this.piS = true;
        }
    }
    public void entferneVonGlas() {
        this.piS = false;
    }

    //getter und setter zu ende

    public void scannen() {
        if (this.piS) {
            System.out.print("Scannen");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");

            System.out.println("\nScan abgeschlossen.");
        } else {
            System.out.println("Schere, da ist noch kein Blatt");
        }
    }

}
