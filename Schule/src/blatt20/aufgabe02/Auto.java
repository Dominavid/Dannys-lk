package blatt20.aufgabe02;

public class Auto {
    String marke;
    String modell;
    int tank;
    int geschwindigkeit;
    int kilometerstand;





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
