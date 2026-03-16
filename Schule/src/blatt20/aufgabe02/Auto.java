package blatt20.aufgabe02;

public class Auto {
    private String marke;
    private String modell;
    private int tank;
    private int geschwindigkeit;
    private int kilometerstand;

    /**
     * Konstruktor
     * @param marke die Marke vom brummbrumm
     * @param modell das Modell vom brummbrumm
     * @param tank die Tankfüllung vom- ok du checkst es oder?
     * @param geschwindigkeit
     * @param kilometerstand
     */
    public Auto(String marke, String modell, int tank, int geschwindigkeit, int kilometerstand) {
        this.marke = marke;
        this.modell = modell;
        this.tank = tank;
        this.geschwindigkeit = geschwindigkeit;
        this.kilometerstand = kilometerstand;
    }


    void setMarke(String marke) {
        this.marke = marke;
    }

    void setModell(String modell) {
        this.modell = modell;
    }

    void setTank(int tank) {
        if (tank < 0) {
            tank = 0;
        }
        this.tank = tank;
    }

    void setGeschwindigkeit(int geschwindigkeit) {
        if (geschwindigkeit < 0) {
            geschwindigkeit = 0;
        } else if (geschwindigkeit > 600) {
            String ort = "Autobahn";
        }
        this.geschwindigkeit = geschwindigkeit;
    }

    void setKilometerstand(int kilometerstand) {
        if (kilometerstand < 0) {
            kilometerstand = 0;
        }
        this.kilometerstand = kilometerstand;
    }

    void beschleunigung(int v) {
        this.geschwindigkeit += v;
    }

    void bremsen(int v) {
        this.geschwindigkeit -= v;
        if (geschwindigkeit < 0) {
            this.geschwindigkeit = 0;
        }
    }

    void fahren(int km) {
        this.kilometerstand += km;
    }
}
