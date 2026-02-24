package blatt14;

import schisch_visualizer.SchischVisualizer;

import java.util.Arrays;

public class Steine {

    static char[][] spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
    static SchischVisualizer danny = new SchischVisualizer();
    static int punkte = 0;


    /**
     * zeichnet das I-Bauteil aus Tetris auf einem statischen Spielfeld
     * @param pos wo auf der X-Achse das Bauteil beginnen soll
     * @param vert ob das Bauteil vertikal gebaut werden soll
     */
    public static void zeichneI(int pos, boolean vert) {
        if (pos < 0 || pos >= spielfeld.length || (pos + 3 >= spielfeld.length && !vert)) {
            System.out.println("Error: position ungültig");
        } else {
            if (vert) {
                for (int i = 0; i < 4; i++) {
                    spielfeld[pos][i] = '6';
                }
            } else {
                for (int i = pos; i < pos+4; i++) {
                    spielfeld[i][0] = '6';
                }
            }
        }
    }


    /**
     * zeichnet das O-Bauteil aus Tetris auf einem statischen Spielfeld
     * @param pos wo auf der X-Achse das Bauteil beginnen soll
     */
    public static void zeichneO(int pos) {
        if (pos < 0 || pos+1 >= spielfeld.length) {
            System.out.println("Schere: position ungültig");
        } else {
            spielfeld[pos][0] = '5';
            spielfeld[pos+1][0] = '5';
            spielfeld[pos][1] = '5';
            spielfeld[pos+1][1] = '5';
        }
    }


    /**
     * zeichnet das T-Bauteil aus Tetris auf einem statischen Spielfeld
     * @param pos wo auf der X-Achse das Bauteil beginnen soll
     * @param richt in welche richtung der Stiehl zeigen soll (N/O/S/W)
     */
    public static void zeichneT(int pos, char richt) {
        richt = Character.toUpperCase(richt);
        if (pos < 0 || pos+1 >= spielfeld.length || (pos+2 >= spielfeld.length && (richt == 'N' || richt == 'S')) || (richt != 'N' && richt != 'O' && richt != 'S' && richt != 'W')) {
            System.out.println("Schere: richtung/position ungültig");
        } else {
            if (richt == 'N') {
                spielfeld[pos+1][0] = 'C';
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][1] = 'C';
                }
            } else if (richt == 'O') {
                spielfeld[pos+1][1] = 'C';
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos][i] = 'C';
                }
            } else if (richt == 'S') {
                spielfeld[pos+1][1] = 'C';
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][0] = 'C';
                }
            } else if (richt == 'W') {
                spielfeld[pos][1] = 'C';
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos+1][i] = 'C';
                }
            }
        }
    }


    /**
     * zeichnet das S-Bauteil aus Tetris auf einem statischen Spielfeld
     * @param pos wo auf der X-Achse das Bauteil beginnen soll
     * @param vert ob es vertikal sein soll
     */
    public static void zeichneS(int pos, boolean vert) {
        if (pos < 0 || pos+1 >= spielfeld.length || (!vert && pos+2 >= spielfeld.length)) {
            System.out.println("Schere: position ungültig");
        } else {
            if (vert) {
                for (int i = 0; i < 2; i++) {
                    spielfeld[pos][i] = '9';
                    spielfeld[pos+1][i+1] = '9';
                }
            } else {
                for (int i = pos; i < pos + 2; i++) {
                    spielfeld[i+1][0] = '9';
                    spielfeld[i][1] = '9';
                }
            }
        }
    }




    /**
     * zeichnet das Z-Bauteil aus Tetris auf einem statischen Spielfeld
     * @param pos wo auf der X-Achse das Bauteil beginnen soll
     * @param vert ob es vertikal sein soll
     */
    public static void zeichneZ(int pos, boolean vert) {
        if (pos < 0 || pos+1 >= spielfeld.length || (!vert && pos+2 >= spielfeld.length)) {
            System.out.println("Schere: position ungültig");
        } else {
            if (vert) {
                for (int i = 0; i < 2; i++) {
                    spielfeld[pos+1][i] = 'F';
                    spielfeld[pos][i+1] = 'F';
                }
            } else {
                for (int i = pos; i < pos + 2; i++) {
                    spielfeld[i][0] = 'F';
                    spielfeld[i+1][1] = 'F';
                }
            }
        }
    }




    /**
     * zeichnet das J-Bauteil aus Tetris auf einem statischen Spielfeld
     * @param pos wo auf der X-Achse das Bauteil beginnen soll
     * @param richt in welche richtung der Stiehl zeigen soll (N/O/S/W)
     */
    public static void zeichneJ(int pos, char richt) {
        richt = Character.toUpperCase(richt);
        if (pos < 0 || pos+1 >= spielfeld.length || (pos+2 >= spielfeld.length && (richt == 'N' || richt == 'S')) || (richt != 'N' && richt != 'O' && richt != 'S' && richt != 'W')) {
            System.out.println("Schere: position/koordinaten ungültig");
        } else {
            if (richt == 'N') {
                spielfeld[pos][0] = '2';
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][1] = '2';
                }
            } else if (richt == 'O') {
                spielfeld[pos+1][0] = '2';
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos][i] = '2';
                }
            } else if (richt == 'S') {
                spielfeld[pos+2][1] = '2';
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][0] = '2';
                }
            } else if (richt == 'W') {
                spielfeld[pos][2] = '2';
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos+1][i] = '2';
                }
            }
        }
    }




    /**
     * würde besser laufen wenn es ein Orange gäbe...
     * @param pos wo auf der X-Achse das Bauteil beginnen soll
     * @param richt in welche richtung der Stiehl zeigen soll (N/O/S/W)
     */
    public static void zeichneL(int pos, char richt) {
        richt = Character.toUpperCase(richt);
        if (pos < 0 || pos+1 >= spielfeld.length || (pos+2 >= spielfeld.length && (richt == 'N' || richt == 'S')) || (richt != 'N' && richt != 'O' && richt != 'S' && richt != 'W')) {
            System.out.println("Schere: position/koordinaten ungültig");
        } else {
            if (richt == 'N') {
                spielfeld[pos][1] = '4';
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][0] = '4';
                }
            } else if (richt == 'O') {
                spielfeld[pos+1][2] = '4';
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos][i] = '4';
                }
            } else if (richt == 'S') {
                spielfeld[pos][1] = '4';
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][0] = '4';
                }
            } else if (richt == 'W') {
                spielfeld[pos][0] = '4';
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos+1][i] = '4';
                }
            }
        }
    }



    public static void reihenlöscher() {
        char[][] spielfelddreh = MultiArrays.arraydreher(spielfeld);
        int blinken = 3;
        int reihenzähler = 0;
        int[] reihen = new int[4];
        for (int i = spielfelddreh.length-1; i > 0; i--) {
            boolean leer = false;
            for (int j = 0; j < spielfelddreh[i].length; j++) {
                if (spielfelddreh[i][j] == ' ') {
                    leer = true;
                    break;
                }
            }
            if (!leer) {
                reihen[reihenzähler] = i;
                reihenzähler++;
                if (reihenzähler == 4) break;
            }
        } //zu löschende Reihen aufgeschrieben

        if (reihenzähler > 0) {
            char[] leer = new char[spielfeld.length];
            Arrays.fill(leer, ' ');

            char[][] reihe = new char[4][];
            for (int i = 0; i < reihenzähler; i++) {
                reihe[i] = spielfelddreh[reihen[i]].clone();
            }

            if (reihenzähler == 1) {
                punkte += 40;
                //System.out.println("+40 Punkte\nGesamtpunktzahl: " + punkte);
            } else if (reihenzähler == 2) {
                punkte += 100;
                //System.out.println("+100 Punkte\nGesamtpunktzahl: " + punkte);
            } else if (reihenzähler == 3) {
                punkte += 300;
                //System.out.println("+300 Punkte\nGesamtpunktzahl: " + punkte);
            } else if (reihenzähler == 4) {
                punkte += 1200;
                //System.out.println("+1200 Punkte\nGesamtpunktzahl: " + punkte);
            } else {
                System.out.println("Schere: mehr als 4 volle Reihen erkannt");
                return;
            }

            for (int i = 0; i <= blinken; i++) {
                for (int j = 0; j < reihenzähler; j++) {
                    spielfelddreh[reihen[j]] = reihe[j];
                }
                danny.step(MultiArrays.arraydreher(spielfelddreh));
                for (int j = 0; j < reihenzähler; j++) {
                    spielfelddreh[reihen[j]] = leer;
                }
                danny.step(MultiArrays.arraydreher(spielfelddreh));
            }

            for (int j = reihenzähler-1; j >= 0; j--) {
                for (int i = reihen[j]; i > 0; i--) {
                    spielfelddreh[i] = spielfelddreh[i-1].clone();
                }
                Arrays.fill(spielfelddreh[0], ' ');
            }
            spielfeld = MultiArrays.arraydreher(spielfelddreh);
        }
    }



    public static void main(String[] args) {


        danny.step(spielfeld);


        reihenlöscher();
        danny.step(spielfeld);


        danny.start();
    }
}
