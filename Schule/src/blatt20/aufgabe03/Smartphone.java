package blatt20.aufgabe03;

public class Smartphone {
    private String marke;
    private String modell;
    private String chip;
    private byte kameras;
    private byte bildschirmgröße;
    private byte akku;
    private short[] auflösung;
    private short speichergb;
    private short preis;


    public Smartphone(String marke, String modell, String chip, byte kameras, byte bildschirmgröße, byte akku, short auflösungx, short auflösungy, short speichergb, short preis) {
        this.marke = marke;
        this.modell = modell;
        this.chip = chip;
        this.kameras = kameras;
        this.bildschirmgröße = bildschirmgröße;
        this.akku = akku;
        this.auflösung = new short[] {auflösungx, auflösungy};
        this.speichergb = speichergb;
        this.preis = preis;
    }

    void setMarke(String marke) {
        this.marke = marke;
    }
}
