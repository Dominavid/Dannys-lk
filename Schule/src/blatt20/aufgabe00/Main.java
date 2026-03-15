package blatt20.aufgabe00;

public class Main {
    public static void main(String[] args) {
        Fahrrad meinFahrrad = new Fahrrad();

        meinFahrrad.typ[0] = "Mofa";
        meinFahrrad.marke[0] = "Motobi";
        meinFahrrad.reflektoren_pedale[0] = false;
        meinFahrrad.farben[0] = new String[] {"Silber", "Schwarz", "Rot"};
        meinFahrrad.reifendurchmessermm[0] = 150;//todo: weitermachen
    }
}
