package blatt14;

import schisch_visualizer.SchischVisualizer;

public class OasenSuche {


    /**
     * eine ziemlich unnötige Funktion, deren Funktion es lediglich ist auf eine Funktion zu verweisen
     * @param höhe wie hoch das spielfeld sein soll
     * @param breite wie breit es sein soll
     * @return fertiges spielfeld
     */
    public static char[][] initialisiereSpielfeld(int höhe, int breite) {
        return MultiArrays.createEmpty2DCharArray(breite, höhe);
    }


    /**
     * setzt einen spieler auf einer zufälligen Position in einem Spielfeld
     * @param charr das Spielfeld
     */
    public static void zufallsPositionSpieler(char[][] charr) {
        int x = (int)Math.round(Math.random()*(charr.length-1));
        int y = (int)Math.round(Math.random()*(charr[x].length-1));
        charr[x][y] = 'P';

    }

    /**
     * füllt ein spielfeld mit gegebener Rate teilweise mit wasser auf (Spieler wird nicht versinken)
     * @param charr das spielfeld
     * @param wahrscheinlichkeit die Wahrscheinlichkeit 0/kleiner = keine Wahrscheinlichkeit; 1/größer = volle Wahrscheinlichkeit
     */
    public static void wasserZufall(char[][] charr, double wahrscheinlichkeit) {
        for (int i = 0; i < charr.length; i++) {
            for (int j = 0; j < charr[0].length; j++) {
                if (Math.random() <= wahrscheinlichkeit && wahrscheinlichkeit != 0 && charr[i][j] != 'P') {
                    charr[i][j] = '2';
                }
            }
        }
    }



    /**
     * füllt ein spielfeld mit gegebener Rate teilweise mit wasser auf (Spieler und Wasser werden nicht versinken)
     * @param charr das spielfeld
     * @param wahrscheinlichkeit die Wahrscheinlichkeit 0/kleiner = keine Wahrscheinlichkeit; 1/größer = volle Wahrscheinlichkeit
     */
    public static void steinZufall(char[][] charr, double wahrscheinlichkeit) {
        for (int i = 0; i < charr.length; i++) {
            for (int j = 0; j < charr[0].length; j++) {
                if (Math.random() <= wahrscheinlichkeit && wahrscheinlichkeit != 0 && charr[i][j] != 'P') {
                    charr[i][j] = '8';
                }
            }
        }
    }



    public static void findeWasser(char[][] charr, int energie) {
        int[] position = new int[2];
        while (energie > 0) {
            if (Simulationen.zaehlenVier(charr, ))
        }
    }




    public static void main(String[] args) {
        SchischVisualizer danny = new SchischVisualizer();
        char[][] spielfeld = initialisiereSpielfeld(25, 20);
        zufallsPositionSpieler(spielfeld);
        wasserZufall(spielfeld, 0.333);
        steinZufall(spielfeld, 0.333);

        danny.step(spielfeld);

        danny.start();
    }
}
