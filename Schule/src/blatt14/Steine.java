package blatt14;

import schisch_visualizer.SchischVisualizer;

import java.util.Arrays;

public class Steine {

    static char[][] spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
    static SchischVisualizer danny = new SchischVisualizer();
    static int punkte = 0;
    static int[][] koord = new int[4][2];
    static boolean lebt = true;



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
                    koord[i] = new int[] {pos, i};
                }
            } else {
                for (int i = pos; i < pos+4; i++) {
                    spielfeld[i][0] = '6';
                    koord[i-pos] = new int[] {i, 0};
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
            koord = new int[][] {{pos, 0}, {pos+1, 0}, {pos, 1}, {pos+1, 1}};
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
            System.out.println(pos);
        } else {
            if (richt == 'N') {
                spielfeld[pos+1][0] = 'C';
                koord[0] = new int[] {pos+1, 0};
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][1] = 'C';
                    koord[i+1-pos] = new int[] {i, 1};
                }
            } else if (richt == 'O') {
                spielfeld[pos+1][1] = 'C';
                koord[0] = new int[] {pos+1, 1};
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos][i] = 'C';
                    koord[i+1] = new int[] {pos, i};
                }
            } else if (richt == 'S') {
                spielfeld[pos+1][1] = 'C';
                koord[0] = new int[] {pos+1, 1};
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][0] = 'C';
                    koord[i+1-pos] = new int[] {i, 0};
                }
            } else if (richt == 'W') {
                spielfeld[pos][1] = 'C';
                koord[0] = new int[] {pos, 1};
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos+1][i] = 'C';
                    koord[i+1] = new int[] {pos+1, i};
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
                    koord[i*2] = new int[] {pos, i};
                    koord[i*2+1] = new int[] {pos+1, i+1};
                }
            } else {
                for (int i = pos; i < pos + 2; i++) {
                    spielfeld[i+1][0] = '9';
                    spielfeld[i][1] = '9';
                    koord[(i-pos)*2] = new int[] {i+1, 0};
                    koord[(i-pos)*2+1] = new int[] {i, 1};
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
                    koord[i*2] = new int[] {pos+1, i};
                    koord[i*2+1] = new int[] {pos, i+1};
                }
            } else {
                for (int i = pos; i < pos + 2; i++) {
                    spielfeld[i][0] = 'F';
                    spielfeld[i+1][1] = 'F';
                    koord[(i-pos)*2] = new int[] {i, 0};
                    koord[(i-pos)*2+1] = new int[] {i+1, 1};
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
                koord[0] = new int[] {pos, 0};
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][1] = '2';
                    koord[i+1-pos] = new int[] {i, 1};
                }
            } else if (richt == 'O') {
                spielfeld[pos+1][0] = '2';
                koord[0] = new int[] {pos+1, 0};
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos][i] = '2';
                    koord[i+1] = new int[] {pos, i+1};
                }
            } else if (richt == 'S') {
                spielfeld[pos+2][1] = '2';
                koord[0] = new int[] {pos+2, 1};
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][0] = '2';
                    koord[i+1-pos] = new int[] {i, 0};
                }
            } else if (richt == 'W') {
                spielfeld[pos][2] = '2';
                koord[0] = new int[] {pos, 2};
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos+1][i] = '2';
                    koord[i+1] = new int[] {pos+1, i};
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
                koord[0] = new int[] {pos, 1};
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][0] = '4';
                    koord[i+1-pos] = new int[] {i, 0};
                }
            } else if (richt == 'O') {
                spielfeld[pos+1][2] = '4';
                koord[0] = new int[] {pos+1, 2};
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos][i] = '4';
                    koord[i+1] = new int[] {pos, i};
                }
            } else if (richt == 'S') {
                spielfeld[pos][1] = '4';
                koord[0] = new int[] {pos, 1};
                for (int i = pos; i < pos+3; i++) {
                    spielfeld[i][0] = '4';
                    koord[i+1-pos] = new int[] {i, 0};
                }
            } else if (richt == 'W') {
                spielfeld[pos][0] = '4';
                koord[0] = new int[] {pos, 0};
                for (int i = 0; i < 3; i++) {
                    spielfeld[pos+1][i] = '4';
                    koord[i+1] = new int[] {pos+1, i};
                }
            }
        }
    }



    /**
     * sucht und entfernt (optional blinkend) leere Reihen, weist Punkte zu und lässt das Spielfeld aufrücken
     * Spielfeld, Punkte und Visualizer statisch
     * @param blinken wie oft eine Reihe vor Löschung blinken soll
     */
    public static void reihenlöscher(int blinken) {
        char[][] spielfelddreh = MultiArrays.arraydreher(spielfeld);
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
                if (i != 0) danny.step(MultiArrays.arraydreher(spielfelddreh));
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
            danny.step(spielfeld);
        }
    }


    public static void platzierer(char objekt, int pos, boolean vert) {

        char[][] spielfeldkopie = MultiArrays.copy2DCharArray(spielfeld);

        if (objekt == 'I') {
            zeichneI(pos, vert);
        } else if (objekt == 'S') {
            zeichneS(pos, vert);
        } else if (objekt == 'Z') {
            zeichneZ(pos, vert);
        } else {
            System.out.println("Schere: Eingabe fehlerhaft");
        }

        for (int j = 0; j < koord.length; j++) {
            if (spielfeldkopie[koord[j][0]][koord[j][1]] != ' ') lebt = false;
        }

        danny.step(spielfeld);
    }


    public static void platzierer(char objekt, int pos, char richt) {

        char[][] spielfeldkopie = MultiArrays.copy2DCharArray(spielfeld);

        if (objekt == 'T') {
            zeichneT(pos, richt);
        } else if (objekt == 'J') {
            zeichneJ(pos, richt);
        } else if (objekt == 'L') {
            zeichneL(pos, richt);
        } else {
            System.out.println("Schere: Eingabe fehlerhaft");
        }

        for (int j = 0; j < koord.length; j++) {
            if (spielfeldkopie[koord[j][0]][koord[j][1]] != ' ') lebt = false;
        }
        danny.step(spielfeld);
    }


    public static void platzierer(char objekt, int pos) {

        char[][] spielfeldkopie = MultiArrays.copy2DCharArray(spielfeld);

        if (objekt == 'O') {
            zeichneO(pos);
        } else {
            System.out.println("Schere: Eingabe fehlerhaft");
        }

        for (int j = 0; j < koord.length; j++) {
            if (spielfeldkopie[koord[j][0]][koord[j][1]] != ' ') lebt = false;
        }
        danny.step(spielfeld);
    }


    public static void absturz() {
        int[][] koordkopie = new int[koord.length][];

        char objekt = spielfeld[koord[0][0]][koord[0][1]];


        for (int m = 0; m < spielfeld[0].length; m++) {
            for (int i = 0; i < koord.length; i++) {
                koordkopie[i] = new int[] {koord[i][0], koord[i][1]+1};
                if (koordkopie[i][1] >= spielfeld[koordkopie[i][0]].length) {
                    //System.out.println("1. Stop");
                    return;
                }
            }

            for (int i = 0; i < koord.length; i++) {
                for (int j = 0; j < koord.length; j++) {
                    spielfeld[koord[j][0]][koord[j][1]] = ' ';
                }
            }

            for (int j = 0; j < koordkopie.length; j++) {
                if (spielfeld[koordkopie[j][0]][koordkopie[j][1]] != ' ') {
                    for (int i = 0; i < koord.length; i++) {
                        for (int n = 0; n < koord.length; n++) {
                            spielfeld[koord[n][0]][koord[n][1]] = objekt;
                        }
                    }
                    return;
                }
            }

            for (int i = 0; i < koordkopie.length; i++) {
                for (int n = 0; n < koordkopie.length; n++) {
                    spielfeld[koordkopie[n][0]][koordkopie[n][1]] = objekt;
                }
            }

            koord = koordkopie.clone();
            danny.step(spielfeld);
        }
    }



    public static void prüfer() {
        for (int j = 0; j < koord.length; j++) {
            if (spielfeld[j][0] != ' ') {
                lebt = false;
                break;
            }
        }
    }



    public static void main(String[] args) {



        long startzeit = System.nanoTime();

        int durchläufe = 0;


        int mindestpunkte = 20;


        while (true) {
            while (lebt) {
                double rand = Math.random();
                if (rand < (double) 1 / 7) {
                    boolean vert = Math.random() > 0.5;
                    int pos;
                    if (vert) {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 1);
                    } else {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 4);
                    }
                    platzierer('I', pos, vert);
                } else if (rand < (double) 2 / 7) {
                    platzierer('O', blatt13.Zufall.zufallGanz(spielfeld.length - 2));
                } else if (rand < (double) 3 / 7) {
                    double rando = Math.random();
                    char richt;

                    if (rando < 1 / 4) {
                        richt = 'N';
                    } else if (rando < 2 / 4) {
                        richt = 'O';
                    } else if (rando < 3 / 4) {
                        richt = 'S';
                    } else {
                        richt = 'W';
                    }

                    int pos;
                    if (richt == 'N' || richt == 'S') {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 3);
                    } else {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 2);
                    }

                    platzierer('T', pos, richt);
                } else if (rand < (double) 4 / 7) {
                    boolean vert = Math.random() > 0.5;
                    int pos;
                    if (vert) {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 2);
                    } else {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 3);
                    }
                    platzierer('S', pos, vert);
                } else if (rand < (double) 5 / 7) {
                    boolean vert = Math.random() > 0.5;
                    int pos;
                    if (vert) {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 2);
                    } else {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 3);
                    }
                    platzierer('Z', pos, vert);
                } else if (rand < (double) 6 / 7) {
                    double rando = Math.random();
                    char richt;

                    if (rando < 1 / 4) {
                        richt = 'N';
                    } else if (rando < 2 / 4) {
                        richt = 'O';
                    } else if (rando < 3 / 4) {
                        richt = 'S';
                    } else {
                        richt = 'W';
                    }

                    int pos;

                    if (richt == 'N' || richt == 'S') {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 3);
                    } else {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 2);
                    }

                    platzierer('J', pos, richt);
                } else {
                    double rando = Math.random();
                    char richt;

                    if (rando < 1 / 4) {
                        richt = 'N';
                    } else if (rando < 2 / 4) {
                        richt = 'O';
                    } else if (rando < 3 / 4) {
                        richt = 'S';
                    } else {
                        richt = 'W';
                    }

                    int pos;

                    if (richt == 'N' || richt == 'S') {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 3);
                    } else {
                        pos = blatt13.Zufall.zufallGanz(spielfeld.length - 2);
                    }

                    platzierer('L', pos, richt);
                }

                absturz();
                reihenlöscher(3);
                prüfer();
            }
            durchläufe++;
            if (punkte < mindestpunkte) {
                lebt = true;
                spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
                danny = new SchischVisualizer();
                punkte = 0;
            } else break;
        }


        for (int i = spielfeld[0].length-1; i >= 0; i--) {
            for (int j = 0; j < spielfeld.length; j++) {
                if (spielfeld[j][i] == ' ') {
                    spielfeld[j][i] = '1';
                }
            }
            danny.step(spielfeld);
        }


        for (int i = spielfeld[0].length-1; i >= 0; i--) {
            for (int j = 0; j < spielfeld.length; j++) {
                spielfeld[j][i] = '1';
            }
            danny.step(spielfeld);
        }



        danny.start();

        long endzeit = System.nanoTime();
        long gesamtzeit = endzeit - startzeit;


        long stunden = gesamtzeit / 3_600_000_000_000L;
        gesamtzeit %= 3_600_000_000_000L;

        long minuten = gesamtzeit / 60_000_000_000L;
        gesamtzeit %= 60_000_000_000L;

        long sekunden = gesamtzeit / 1_000_000_000L;
        gesamtzeit %= 1_000_000_000L;

        long millis = gesamtzeit / 1_000_000L;
        gesamtzeit %= 1_000_000L;

        long mikros = gesamtzeit / 1_000L;
        long nanos = gesamtzeit % 1_000L;



        System.out.println("Euer Exzellenz haben nach " + durchläufe + " Durchläufen " + punkte + " Punkte erreicht.\n\n\nGesamtzeit:\n\n" + stunden + "\t\tStunden\n" + minuten + "\t\tMinuten\n" + sekunden + "\t\tSekunden\n" + millis + "\t\tMillisekunden\n" + mikros + "\t\tMikrosekunden\n" + nanos + "\t\tNanosekunden");
    }
}
