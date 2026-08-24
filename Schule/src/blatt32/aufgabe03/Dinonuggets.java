package blatt32.aufgabe03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Dinonuggets {
    public static void main(String args[]) {
        int[][] dino = new int[][]{
                {3, 7, 1, 9, 4, 2, 8, 5, 6, 1},
                {8, 2, 6, 4, 9, 7, 3, 1, 5, 8},
                {1, 5, 9, 2, 6, 8, 4, 7, 3, 9},
                {6, 4, 2, 8, 1, 5, 9, 3, 7, 6},
                {9, 1, 7, 3, 5, 4, 2, 8, 6, 1},
                {4, 8, 3, 6, 7, 9, 1, 5, 2, 4},
                {7, 6, 5, 1, 3, 2, 8, 9, 4, 7},
                {2, 9, 4, 7, 8, 6, 5, 1, 3, 2},
                {5, 3, 8, 9, 2, 1, 7, 4, 6, 5},
                {1, 7, 6, 5, 4, 3, 9, 2, 8, 6}
        };


        File dinofile = new File("dinomatrix.html");

        StringBuilder dinocode = new StringBuilder();

        dinocode.append("<tr>\n\t<th></th>");
        for (int i = 0; i < dino.length; i++) {
            dinocode.append("\n<th>" + (i+1) + "</th>\n");//todo: beten das ich es einiggermaßen wieder aufgreifen kann
        } //überschrift müsste fertig sein
        dinocode.append("\n</tr>\n");

        for (int i = 0; i < dino.length; i++) {
            dinocode.append("<tr>\n<th>" + (i+1) + "</th>\n");
            for (int j = 0; j < dino[i].length; j++) {
                dinocode.append("<td>" + dino[i][j] + "</td>\n");
            }
            dinocode.append("\n</tr>\n");
        }


        try {
            FileWriter fr = new FileWriter(dinofile);
            fr.write(dinocode.toString());
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        dinofile.//todo: testen
    }
}
