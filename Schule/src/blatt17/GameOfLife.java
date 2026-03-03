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
                    spielfeld[i][j] = ' ';
                }
            }
        }
    }


    public static void initOszillierend(byte i) {
        if (i < 1 || i > 8) {
            System.out.println("Bitte nur Zahlen zwischen 1 und 8");
            return; //todo: in else am ende kopieren
        }

        try {
            if (i == 1) {
                for (int j = 0; j < 3; j++) {
                    spielfeld[j + spielfeld.length/2 - 1][spielfeld[j].length/2] = '1';
                }
            } else if (i == 2) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        spielfeld[k+(j*2) + spielfeld.length/2 - 2][spielfeld[k+(j*2) + spielfeld.length/2 - 2].length/2 - 1 + j] = '1';
                    }
                }
                spielfeld[spielfeld.length/2][spielfeld[spielfeld.length/2].length/2-2] = '1';
                spielfeld[spielfeld.length/2 - 1][spielfeld[spielfeld.length/2].length/2 + 1] = '1';
            } else if (i == 3) {
                for (int j = 0; j < 3; j++) {
                    spielfeld[spielfeld[j].length/2 - 1][j + spielfeld.length/2 - 2] = '1';
                    spielfeld[spielfeld[j].length/2][j + spielfeld.length/2 - 1] = '1';
                }
            } else if (i == 4) {
                //todo: weitermachen

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Schere: Spielfeld zu klein für Oszillierend " + i);
        }

    }


    public static void weiter() {
        char[][] spielfeldkopie = blatt14.MultiArrays.copy2DCharArray(spielfeld);

        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeldkopie[i][j] == ' ') {
                    if (blatt14.Simulationen.zaehlenAcht(spielfeldkopie, i, j, '1', false) == 3) {
                        spielfeld[i][j] = '1';
                    }
                } else {
                    byte nachbarn = blatt14.Simulationen.zaehlenAcht(spielfeldkopie, i, j, '1', false);
                    if (nachbarn < 2 || nachbarn > 3) {
                        spielfeld[i][j] = ' ';
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
        initRandom(0.15);
        spielfeld = blatt14.MultiArrays.createEmpty2DCharArray(10, 10);

        initOszillierend((byte)3);
        danny.step(spielfeld);


        for (int i = 0; i < 15; i++) {
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
