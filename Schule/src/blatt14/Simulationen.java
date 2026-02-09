package blatt14;

import schisch_visualizer.SchischVisualizer;

import java.util.Scanner;

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
     * @param rand ob bei Überschreiten des Randes von der anderen Seite angefangen werden soll
     * @return was nördlich der gegebenen Position liegt
     */
    public static char getNorden(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[koord1].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1][koord2-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                return charr[koord1][charr[0].length-1];
            } else {
                return '§';
            }
        }
    }



    /**
     * gibt die Position östlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param koord1 x-Koordinate
     * @param koord2 y-Koordinate
     * @param rand ob bei Überschreiten des Randes von der anderen Seite angefangen werden soll
     * @return was östlich der gegebenen Position liegt
     */
    public static char getOsten(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[koord1].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1+1][koord2];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                return charr[0][koord2];
            } else {
                return '§';
            }
        }
    }




    /**
     * gibt die Position südlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param koord1 x-Koordinate
     * @param koord2 y-Koordinate
     * @param rand ob bei Überschreiten des Randes von der anderen Seite angefangen werden soll
     * @return was südlich der gegebenen Position liegt
     */
    public static char getSüden(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[koord1].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1][koord2+1];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                return charr[koord1][0];
            } else {
                return '§';
            }
        }
    }



    /**
     * gibt die Position westlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param koord1 x-Koordinate
     * @param koord2 y-Koordinate
     * @param rand ob bei Überschreiten des Randes von der anderen Seite angefangen werden soll
     * @return was westlich der gegebenen Position liegt
     */
    public static char getWesten(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[koord1].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1-1][koord2];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                return charr[charr.length-1][koord2];
            } else {
                return '§';
            }
        }
    }




    /**
     * gibt die Position nordöstlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param koord1 x-Koordinate
     * @param koord2 y-Koordinate
     * @param rand ob bei Überschreiten des Randes von der anderen Seite angefangen werden soll
     * @return was nordöstlich der gegebenen Position liegt
     */
    public static char getNordOst(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[koord1].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1+1][koord2-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                try {
                    return charr[koord1+1][charr[koord1+1].length-1];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    try {
                        return charr[0][koord2-1];
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        return charr[0][charr[0].length-1];
                    }
                }
            } else {
                return '§';
            }
        }
    }




    /**
     * gibt die Position nordwestlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param koord1 x-Koordinate
     * @param koord2 y-Koordinate
     * @param rand ob bei Überschreiten des Randes von der anderen Seite angefangen werden soll
     * @return was nordwestlich der gegebenen Position liegt
     */
    public static char getNordWest(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[koord1].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1-1][koord2-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                try {
                    return charr[koord1-1][charr[koord1+1].length-1];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    try {
                        return charr[charr.length-1][koord2-1];
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        return charr[charr.length-1][charr[charr.length-1].length-1];
                    }
                }
            } else {
                return '§';
            }
        }
    }



    /**
     * gibt die Position südöstlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param koord1 x-Koordinate
     * @param koord2 y-Koordinate
     * @param rand ob bei Überschreiten des Randes von der anderen Seite angefangen werden soll
     * @return was südöstlich der gegebenen Position liegt
     */
    public static char getSüdOst(char[][] charr, int koord1, int koord2, boolean rand) {
        if (koord1 >= charr.length || koord2 >= charr[koord1].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[koord1+1][koord2+1];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                try {
                    return charr[koord1+1][0];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    try {
                        return charr[0][koord2+1];
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        return charr[0][0];
                    }
                }
            } else {
                return '§';
            }
        }
    }





    /**
     * gibt die Position südwestlich einer gegebenen Position zurück
     * @param charr das Spielfeld
     * @param x x-Koordinate
     * @param y y-Koordinate
     * @param rand ob bei Überschreiten des Randes von der anderen Seite angefangen werden soll
     * @return was südwestlich der gegebenen Position liegt
     */
    public static char getSüdWest(char[][] charr, int x, int y, boolean rand) {
        if (x >= charr.length || y >= charr[x].length) {
            System.out.println("Koordinaten ungültig");
            return ' ';
        }
        try {
            return charr[x -1][y +1];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (rand) {
                try {
                    return charr[x -1][0];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    try {
                        return charr[charr.length-1][y +1];
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        return charr[charr.length-1][0];
                    }
                }
            } else {
                return '§';
            }
        }
    }





    public static int zaehlenVier(char[][] charr, int x, int y, char ziel, boolean rand) {
        if (ziel == '§') {
            System.out.println("Das ist mein error symbol du dödel");
            return -1;
        }
        int z = 0;
        if (x >= charr.length || y >= charr[x].length) {
            System.out.println("Koordinaten ungültig");
            return -1;
        }
        if (getNorden(charr, x, y, rand) == ziel) {
            z++;
        }
        if (getOsten(charr, x, y, rand) == ziel) {
            z++;
        }
        if (getSüden(charr, x, y, rand) == ziel) {
            z++;
        }
        if (getWesten(charr, x, y, rand) == ziel) {
            z++;
        }
        return z;
    }




    public static int zaehlenAcht(char[][] charr, int x, int y, char ziel, boolean rand) {
        if (ziel == '§') {
            System.out.println("Das ist mein error symbol du dödel");
            return -1;
        }
        int z = 0;
        if (x >= charr.length || y >= charr[x].length) {
            System.out.println("Koordinaten ungültig");
            return -1;
        }
        if (getNorden(charr, x, y, rand) == ziel) {
            z++;
        }
        if (getOsten(charr, x, y, rand) == ziel) {
            z++;
        }
        if (getSüden(charr, x, y, rand) == ziel) {
            z++;
        }
        if (getWesten(charr, x, y, rand) == ziel) {
            z++;
        }
        if (getNordOst(charr, x, y, rand) == ziel) {
            z++;
        }
        if (getNordWest(charr, x, y, rand) == ziel) {
            z++;
        }
        if (getSüdOst(charr, x, y, rand) == ziel) {
            z++;
        }
        if (getSüdWest(charr, x, y, rand) == ziel) {
            z++;
        }
        return z;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SchischVisualizer danny = new SchischVisualizer();
        char[][] spielfeld = MultiArrays.createEmpty2DCharArray(20,10);
        danny.step(spielfeld);
        fuellen(spielfeld, 0.5);
        danny.step(spielfeld);
        platzieren(spielfeld, '1');
        danny.step(spielfeld);
        danny.start();
        System.out.println(zaehlenVier(spielfeld, input.nextInt(), input.nextInt(), input.next().charAt(0), input.nextBoolean()));

        /*
        System.out.println("Norden");
        while (true) {
            System.out.println(getNorden(spielfeld, input.nextInt(), input.nextInt(), true));
            if (input.nextBoolean()) {
                break;
            }
        }


        System.out.println("Osten");
        while (true) {
            System.out.println(getOsten(spielfeld, input.nextInt(), input.nextInt(), true));
            if (input.nextBoolean()) {
                break;
            }
        }

        System.out.println("Süden");
        while (true) {
            System.out.println(getSüden(spielfeld, input.nextInt(), input.nextInt(), true));

            if (input.nextBoolean()) {
                break;
            }
        }

        System.out.println("Westen");
        while (true) {
            System.out.println(getWesten(spielfeld, input.nextInt(), input.nextInt(), true));

            if (input.nextBoolean()) {
                break;
            }
        }

        System.out.println("NordOst");
        while (true) {
            System.out.println(getNordOst(spielfeld, input.nextInt(), input.nextInt(), true));

            if (input.nextBoolean()) {
                break;
            }
        }

        System.out.println("NordWest");
        while (true) {
            System.out.println(getNordWest(spielfeld, input.nextInt(), input.nextInt(), true));

            if (input.nextBoolean()) {
                break;
            }
        }

        System.out.println("SüdOst");
        while (true) {
            System.out.println(getSüdOst(spielfeld, input.nextInt(), input.nextInt(), true));

            if (input.nextBoolean()) {
                break;
            }
        }

        System.out.println("SüdWest");
        while (true) {
            System.out.println(getSüdWest(spielfeld, input.nextInt(), input.nextInt(), true));

            if (input.nextBoolean()) {
                break;
            }
        }*/
    }
}
