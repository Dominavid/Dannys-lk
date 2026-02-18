package blatt14;

import schisch_visualizer.SchischVisualizer;

import java.util.Scanner;

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



    public static void findeWasser(char[][] spielfeld, int energie) {
        Scanner sc = new Scanner(System.in);
        SchischVisualizer danny = new SchischVisualizer();
        int respect = 0;
        char[] laufen = new char[] {'N', 'O', 'S', 'W'};
        boolean durst = true;
        danny.step(spielfeld);

        while (energie > 0) {
            int[] position = Simulationen.findeIrgendwas(spielfeld, 'P');

            if (Simulationen.zaehlenVier(spielfeld, position[0], position[1], '2', true) == 0) {
                if (Simulationen.zaehlenVier(spielfeld, position[0], position[1], '8', true) == 4) {
                    System.out.println("Achievent aquired: eingegrabener Osama");
                    break;
                }
            } else {
                System.out.println("gluck gluck");
                durst = false;
                break;
            }

            if (Simulationen.getNorden(spielfeld, position[0], position[1], true) != '8' && Simulationen.getNorden(spielfeld, position[0], position[1], true) != '7') {
                int x = position[0];
                int y = position[1];
                Simulationen.bewegung(spielfeld, position, 'N', true);
                spielfeld[x][y] = '7';
            } else if (Simulationen.getOsten(spielfeld, position[0], position[1], true) != '8' && Simulationen.getOsten(spielfeld, position[0], position[1], true) != '7') {
                int x = position[0];
                int y = position[1];
                Simulationen.bewegung(spielfeld, position, 'O', true);
                spielfeld[x][y] = '7';
            } else if (Simulationen.getSüden(spielfeld, position[0], position[1], true) != '8' && Simulationen.getSüden(spielfeld, position[0], position[1], true) != '7') {
                int x = position[0];
                int y = position[1];
                Simulationen.bewegung(spielfeld, position, 'S', true);
                spielfeld[x][y] = '7';
            } else if (Simulationen.getWesten(spielfeld, position[0], position[1], true) != '8' && Simulationen.getWesten(spielfeld, position[0], position[1], true) != '7') {
                int x = position[0];
                int y = position[1];
                Simulationen.bewegung(spielfeld, position, 'W', true);
                spielfeld[x][y] = '7';
            } else if (Simulationen.zaehlenVier(spielfeld, position[0], position[1], '8', true) + Simulationen.zaehlenVier(spielfeld, position[0], position[1], '7', true) == 4) {
                softlock(spielfeld, energie, position, true, danny);


            }

            danny.step(spielfeld);
            energie--;
        }

        danny.start();

        if (durst) {
            System.out.println("Achievent aquired: Afrika");
            //danny.start();
            if (sc.next().toUpperCase().charAt(0)=='F') {
                respect++;
            }
        }

    }



    public static void softlock(char[][] spielfeld, int energie, int[] position, boolean rand, SchischVisualizer danny) { //todo prüfen
        char richtung = 'W';
        while (energie > 0) {
            if (Simulationen.getWesten(spielfeld, position[0], position[1], rand) != '8' && richtung == 'W') {
                int x = position[0];
                int y = position[1];
                Simulationen.bewegung(spielfeld, position, 'W', rand);
                spielfeld[x][y] = '7';
                richtung = 'W';
            } else if (Simulationen.getSüden(spielfeld, position[0], position[1], rand) != '8' && richtung == 'S') {
                int x = position[0];
                int y = position[1];
                Simulationen.bewegung(spielfeld, position, 'S', rand);
                spielfeld[x][y] = '7';
                richtung = 'S';
            } else if (Simulationen.getOsten(spielfeld, position[0], position[1], rand) != '8' && richtung == 'O') {
                int x = position[0];
                int y = position[1];
                Simulationen.bewegung(spielfeld, position, 'O', true);
                spielfeld[x][y] = '7';
                richtung = 'O';
            } else if (Simulationen.getNorden(spielfeld, position[0], position[1], rand) != '8' && richtung == 'N') {
                int x = position[0];
                int y = position[1];
                Simulationen.bewegung(spielfeld, position, 'N', rand);
                spielfeld[x][y] = '7';
                richtung = 'N';
            } else {
                if (Simulationen.getNorden(spielfeld, position[0], position[1], rand) != '8') {
                    int x = position[0];
                    int y = position[1];
                    Simulationen.bewegung(spielfeld, position, 'W', rand);
                    spielfeld[x][y] = '7';
                    richtung = 'N';
                } else if (Simulationen.getOsten(spielfeld, position[0], position[1], rand) != '8') {
                    int x = position[0];
                    int y = position[1];
                    Simulationen.bewegung(spielfeld, position, 'S', rand);
                    spielfeld[x][y] = '7';
                    richtung = 'S';
                } else if (Simulationen.getSüden(spielfeld, position[0], position[1], rand) != '8') {
                    int x = position[0];
                    int y = position[1];
                    Simulationen.bewegung(spielfeld, position, 'O', rand);
                    spielfeld[x][y] = '7';
                    richtung = 'O';
                } else if (Simulationen.getWesten(spielfeld, position[0], position[1], rand) != '8') {
                    int x = position[0];
                    int y = position[1];
                    Simulationen.bewegung(spielfeld, position, 'N', rand);
                    spielfeld[x][y] = '7';
                    richtung = 'N';
                }
            }
            danny.step(spielfeld);
            if (Simulationen.zaehlenVier(spielfeld, position[0], position[1], '8', true) + Simulationen.zaehlenVier(spielfeld, position[0], position[1], '7', true) != 4) {
                break;
            }
            //System.out.println(energie);
            energie--;
        }
    }




    public static void main(String[] args) {
        SchischVisualizer danny = new SchischVisualizer();
        char[][] spielfeld = initialisiereSpielfeld(60, 60);
        zufallsPositionSpieler(spielfeld);
        wasserZufall(spielfeld, 0.00);
        steinZufall(spielfeld, 0.15);

        //danny.step(spielfeld);

        for (int i = 0; i < 1; i++) {
            findeWasser(spielfeld, 5000);
        }

        //danny.start();
    }
}
