package blatt14;

import schisch_visualizer.SchischVisualizer;

public class ErsteUebungenCharacter {
    public static void main(String[] args) {
        SchischVisualizer danny = new SchischVisualizer();
        char[][] charr = MultiArrays.createEmpty2DCharArray(11,14);



        for (int i = 0; i < charr[0].length; i++) { //Rechts und links von oben bis unten
            charr[0][i] = '1';
            charr[charr.length - 1][i] = '1';
        }

        for (int i = 0; i < charr[2].length - 2; i++) { //Rechts-mitte und links-mitte von oben bis fast unten
            charr[2][i] = '1';
            charr[charr.length - 3][i] = '1';
        }


        for (int i = 0; i < charr.length; i++) { //oben und unten von links nach rechts
            charr[i][0] = '1';
            charr[i][charr[0].length - 1] = '1';
        }

        for (int i = 4; i < 7; i++) { //die beiden striche
            charr[i][3] = '1';
            charr[i][5] = '1';
        }

        for (int i = 3; i < 8; i++) { //der zumacher
            charr[i][11] = '1';
        }

        charr[5][11] = '0';
        charr[5][12] = 'P';



        danny.step(charr);
        danny.start();
    }
}
