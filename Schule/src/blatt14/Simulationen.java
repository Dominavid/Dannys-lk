package blatt14;

import schisch_visualizer.SchischVisualizer;

public class Simulationen {

    /**
     * geht einen 2d char array durch und ersetzt jedes element mit gegebener Wahrscheinlichkeit entweder durch 1 oder lässt es gleich
     * @param charr der array
     * @param rate die Wahrscheinlichkeit 0/kleiner = keine Wahrscheinlichkeit; 1/größer = volle Wahrscheinlichkeit
     * @return der array
     */
    public static char[][] fuellen(char[][] charr, double rate) {
        for (int i = 0; i < charr.length; i++) {
            for (int j = 0; j < charr[0].length; j++) {
                if (Math.random() <= rate && rate != 0) {
                    charr[i][j] = '1';
                }
            }
        }
        return charr;
    }



    /**
     * geht einen 2d char array durch und ersetzt gewählte Zeichen mit gegebener Wahrscheinlichkeit entweder durch 1 oder lässt es gleich
     * @param charr der array
     * @param rate die Wahrscheinlichkeit 0/kleiner = keine Wahrscheinlichkeit; 1/größer = volle Wahrscheinlichkeit
     * @param a die Zeichen die ersetzt werden
     * @return der array
     */
    public static char[][] fuellen(char[][] charr, double rate, char a) {
        for (int i = 0; i < charr.length; i++) {
            for (int j = 0; j < charr[0].length; j++) {
                if (Math.random() <= rate && rate != 0 && charr[i][j] == a) {
                    charr[i][j] = '1';
                }
            }
        }
        return charr;
    }


    /**
     * Ersetzt ein zufälliges Zeichen in einem 2D Char-Array durch ein
     * @param charr
     * @param a
     * @return
     */
    public static char[][] platzieren(char[][] charr, char a) {
        boolean dopplung = true;
        int counter = 0;
        while (dopplung) {
            int r = (int) Math.round(Math.random()*(charr.length-1));
            int r2 = (int) Math.round(Math.random()*(charr[r].length-1));
            if (charr[r][r2] != a) {
                charr[r][r2] = a;
                dopplung = false;
            }
            counter++;
            if (counter >= charr.length*charr[0].length) {
                //System.out.println("Euer Gnaden mögen verzeihen, der Array scheint bereits vollständig gefüllt zu sein.");
                break;
            }
        }
        //System.out.println(counter);
        return charr;
    }


    /**
     * gibt die Position nördlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param koord1 x-Koordinate
     * @param koord2 y-Koordinate
     * @param rand ob bei Überschreiten des Randes von vorne angefangen werden soll
     * @return was nördlich der gegebenen Position liegt
     */
    public static char getNorden(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[0].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1][koord2+1];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                return charr[koord1][0];
            } else {
                return ' ';
            }
        }
    }



    /**
     * gibt die Position östlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param koord1 x-Koordinate
     * @param koord2 y-Koordinate
     * @param rand ob bei Überschreiten des Randes von vorne angefangen werden soll
     * @return was östlich der gegebenen Position liegt
     */
    public static char getOsten(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[0].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1+1][koord2];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                return charr[0][koord2];
            } else {
                return ' ';
            }
        }
    }




    /**
     * gibt die Position südlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param koord1 x-Koordinate
     * @param koord2 y-Koordinate
     * @param rand ob bei Überschreiten des Randes von vorne angefangen werden soll
     * @return was südlich der gegebenen Position liegt
     */
    public static char getSueden(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[0].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1][koord2-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                return charr[koord1][charr[0].length-1];
            } else {
                return ' ';
            }
        }
    }



    /**
     * gibt die Position westlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param koord1 x-Koordinate
     * @param koord2 y-Koordinate
     * @param rand ob bei Überschreiten des Randes von vorne angefangen werden soll
     * @return was westlich der gegebenen Position liegt
     */
    public static char getWesten(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[0].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1-1][koord2];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                return charr[charr.length-1][koord2];
            } else {
                return ' ';
            }
        }
    }


    public static void main(String[] args) {
        SchischVisualizer danny = new SchischVisualizer();
        char[][] spielfeld = MultiArrays.createEmpty2DCharArray(20,10);
        danny.step(spielfeld);
        fuellen(spielfeld, 0.3);
        danny.step(spielfeld);
        platzieren(spielfeld, '1');
        danny.step(spielfeld);
        danny.start();
    }
}
