package blatt17;

import schisch_visualizer.SchischVisualizer;

public class GameOfLife {
    static char[][] spielfeld = new char[100][100];
    static boolean lüppt = true;



    public static void initRandom(double rate) {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (Math.random() < rate) {
                    spielfeld[i][j] = '1';
                } else {
                    spielfeld[i][j] = '0';
                }
            }
        }
    }


    public static initOszillierend


    public static void weiter() {
        char[][] spielfeldkopie = blatt14.MultiArrays.copy2DCharArray(spielfeld);

        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeldkopie[i][j] == '0') {
                    if (blatt14.Simulationen.zaehlenAcht(spielfeldkopie, i, j, '1', false) == 3) {
                        spielfeld[i][j] = '1';
                    }
                } else {
                    int nachbarn = blatt14.Simulationen.zaehlenAcht(spielfeldkopie, i, j, '1', false);
                    if (nachbarn < 2 || nachbarn > 3) {
                        spielfeld[i][j] = '0';
                    }
                }
            }
        }

        if (blatt14.MultiArrays.istIdentisch(spielfeldkopie, spielfeld)) {
            lüppt = false;
        }
    }

    public static void main(String[] args) {
        SchischVisualizer danny = new SchischVisualizer();
        initRandom(0.1);
        danny.step(spielfeld);

        for (int i = 0; i < 1000; i++) {
            weiter();
            danny.step(spielfeld);
            if (!lüppt) {
                break;
            }
        }

        /*while (lüppt) {
            weiter();
            danny.step(spielfeld);
        }*/

        danny.start();
    }
}
