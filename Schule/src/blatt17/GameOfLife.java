package blatt17;

import schisch_visualizer.SchischVisualizer;

public class GameOfLife {
    static char[][] spielfeld = new char[100][100];



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


    public static void weiter() {
        char[][] spielfeldkopie = new char[spielfeld.length][spielfeld[0].length];
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == '0') {
                    if (blatt14.Simulationen.zaehlenAcht(spielfeld, i, j, '0', false) == 3) {
                        spielfeldkopie[i][j] = '1';
                    }
                } else if (blatt14.Simulationen.zaehlenAcht(spielfeld, i, j, '1', false) < 2) {
                    spielfeldkopie[i][j] = '0';
                }
            }
        }
    }

    public static void main(String[] args) {
        SchischVisualizer danny = new SchischVisualizer();
        initRandom(0.05);
        danny.step(spielfeld);
        danny.start();
    }
}
