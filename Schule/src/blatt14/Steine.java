package blatt14;

import schisch_visualizer.SchischVisualizer;

public class Steine {

    static char[][] spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);


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






    public static void checkerCan() {
        int höhe = 0;
        for (int i = spielfeld[0].length; i > 0; i--) {
            boolean stop = false;
            for (int j = 0; j < spielfeld.length; j++) {
                if (spielfeld[i][j] != ' ') {
                    höhe = i;
                    stop = true;
                    break;
                }
            }
            if (stop) break;
        } //todo: die scheiße machen#
        for (int i = spielfeld[0].length; i > 0; i--) {
            fo
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



    public static void main(String[] args) {
        SchischVisualizer danny = new SchischVisualizer();
        zeichneI(3, true);
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneI(3, false);
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneO(3);
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneT(3, 'N');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneT(3, 'O');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneT(3, 'S');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneT(3, 'W');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneS(3, true);
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneS(3, false);
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneZ(3, true);
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneZ(3, false);
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneJ(3, 'N');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneJ(3, 'O');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneJ(3, 'S');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneJ(3, 'W');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneL(3, 'N');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneL(3, 'O');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneL(3, 'S');
        danny.step(spielfeld);
        spielfeld = MultiArrays.createEmpty2DCharArray(10, 40);
        zeichneL(3, 'w');
        danny.step(spielfeld);
        danny.start();
    }
}
