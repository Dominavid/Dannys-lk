package blatt20.aufgabe04;

public class Kochfeld {
    byte hitzestufe;
    byte größe;


    void hitzehoch() {
        this.hitzestufe++;
        if (this.hitzestufe > 6) {
            this.hitzestufe = 6;
            System.out.println("Schere: HitzeStufeTooHeißException");
        }
        if (this.hitzestufe < 0) {
            this.hitzestufe = 0;
            System.out.println("Schere: HerdAlreadyAusException");
        }
    }
}
