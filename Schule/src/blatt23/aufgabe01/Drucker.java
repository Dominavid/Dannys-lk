package blatt23.aufgabe01;

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

    public Drucker(Abonnement abo) {
        this.abonnement = abo;

        this.papierfach = -128;
        this.gerätemodus = Gerätemodus.STANDBY;
        this.druckart = Druckart.NORMAL;
        this.druckmodus = Druckmodus.SCHWARZWEISS;
        this.verbindungsmodus = Verbindungsmodus.OFFLINE;
        this.ssI = 0;
        this.tintefarbe = 1000;
        this.tinteschwarzweiß = 1000;

        this.sdM = abonnement.ppM;
    }
}
