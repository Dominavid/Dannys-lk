package blatt20.aufgabe03;

public class Smartphone {
    private String marke;
    private String modell;
    private String chip;
    private byte kameras;
    private byte bildschirmgröße;
    private short[] auflösung;
    private short speichergb;
    private short preis;
    private String betriebsystem;

    private byte helligkeit;
    private byte lautstärke;
    private byte akku;


    public Smartphone(String marke, String modell, String chip, byte kameras, byte bildschirmgröße, byte akku, short auflösungx, short auflösungy, short speichergb, short preis, byte helligkeit, byte lautstärke, String betriebsystem) {
        if (kameras < 0) {
            System.out.println("Wie soll ein Handy " + kameras + " Kameras haben du kek?");
            kameras = 0;
        }
        if (bildschirmgröße < 0) {
            System.out.println("Wie soll ein Display " + bildschirmgröße + " Zoll groß sein du dödel?");
            bildschirmgröße *= -1;
        }
        if (akku < 0 || akku > 100) {
            System.out.println("Wie soll ein Handy " + akku + "% Akku haben du trottel?");
            akku = 50;
        }
        if (auflösungx < 0 || auflösungy < 0) {
            System.out.println("Wie soll ein Display " + auflösungx + "x" + auflösungy + " Pixel groß sein du horst?");
            if (auflösungx < 0) auflösungx *= -1;
            if (auflösungy < 0) auflösungy *= -1;
        }
        if (speichergb < 0) {
            System.out.println("Wie soll ein Handy " + speichergb + " GB Speicher haben du otto?");
            speichergb = 0;
        }
        if (preis <= 0) {
            System.out.println("Also den Preis zahl ich gerne!");
        }
        if (helligkeit < 0) {
            System.out.println("Wie soll ein Handy " + helligkeit + "% Helligkeit haben du lappen?");
            helligkeit = 0;
        }
        if (lautstärke < 0) {
            System.out.println("Wie soll ein Handy auf " + lautstärke + "% Lautstärke sein du unfähiger Mann?");
            lautstärke = 0;
        }


        this.marke = marke;
        this.modell = modell;
        this.chip = chip;
        this.kameras = kameras;
        this.bildschirmgröße = bildschirmgröße;
        this.akku = akku;
        this.auflösung = new short[] {auflösungx, auflösungy};
        this.speichergb = speichergb;
        this.preis = preis;
        this.helligkeit = helligkeit;
        this.lautstärke = lautstärke;
        this.betriebsystem = betriebsystem;
    }


    public void speicherLeeren(byte gb) {
        this.speichergb -= gb;
        if (this.speichergb < 0) this.speichergb = 0;
    }

    void setMarke(String marke) {
        this.marke = marke;
    }
}
