package blatt32.aufgabe03;

//import java.util.Arrays;

import java.io.File;
import java.io.FileWriter;

public class Graph {
    private int[][] dino;

    public Graph() {
        this.dino = new int[0][0];
    }
    public Graph(int knoten) {
        this.dino = new int[knoten][knoten];
    }


    /**
     * fügt einen knoten hinzu (ohne verbindungen)
     */
    public void addVertex() {
        int [][] tempdino = new int[this.dino.length+1][this.dino[0].length+1];
        for (int i = 0; i < this.dino.length-1; i++) {
            for (int j = 0; j < this.dino[0].length-1; j++){
                tempdino[i][j] = this.dino[i][j];
            }
            tempdino[i][tempdino[i].length-1] = 0;
        }
        for (int i = 0; i < this.dino[tempdino.length-1].length; i++) {
            tempdino[tempdino.length-1][i] = 0;
        }
        this.dino = tempdino;
    }

    /**
     * fügt eine kante hinzu
     * @param i Startindex
     * @param j endindex
     * @param weight gewichtung
     * @param directed ob die kante gerichtet ist
     */
    public void addEdge(int i, int j, int weight, boolean directed) {
        if (weight <= 0) {
            System.out.println("Gewicht darf nicht weniger als 1 sein");
            weight = 1;
        }
        if (i >= this.dino.length || j >= this.dino.length || i <= 0 || j <= 0) {
            throw new ArrayIndexOutOfBoundsException("ungültige indexe");
        }
        this.dino[i][j] = weight;
        if (!directed) {
            this.dino[j][i] = weight;
        }
    }

    /**
     * fügt eine ungerichtete kante hinzu
     * @param i startindex
     * @param j endindex
     * @param weight gewichtung
     */
    public void addEdge(int i, int j, int weight) {
        this.addEdge(i, j, weight, false);
    }

    /**
     * fügt eine kante hinzu und setzt das gewicht automatisch auf 1
     * @param i startindex
     * @param j endindex
     * @param directed ob die kante gerichtet ist
     */
    public void addEdge(int i, int j, boolean directed) {
        this.addEdge(i, j, 1, directed);
    }

    /**
     * fügt eine ungewichtete und ungerichtete kante hinzu
     * @param i startindex
     * @param j endindex
     */
    public void addEdge(int i, int j) {
        this.addEdge(i, j, 1, false);
    }

    /**
     * ruft die anzahl der knoten ab
     * @return die anzahl der knoten als int
     */
    public int size() {
        return this.dino.length;
    }

    /**
     * durchsucht den graph nach gewichtung
     * @return ob der graph gewichtet ist
     */
    public boolean isWeighted() {
        for (int i = 0; i < this.dino.length; i++) {
            for (int j = 0; j < this.dino[i].length; j++) {
                if (this.dino[i][j] > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * durchsucht den graph nach gerichtetheit
     * @return ob der graph (oder teile davon) gerichtet ist
     */
    public boolean isDirected() {
        for (int i = 0; i < this.dino.length; i++) {
            for (int j = i; j < this.dino[i].length; j++) {
                if (this.dino[i][j] != this.dino[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * gibt die dinomatrix aus
     * @return dinomatrix als 2D int array
     */
    public int[][] getDinoMatrix() {
        return this.dino;
    }

    /**
     * findet alle erreichbaren Nachbarn eines Knotens
     * @param i welcher Knoten
     * @return sortierte Liste der erreichbaren nachbarn als int array
     */
    public int[] getNeighbors(int i) {
        int m = 0;
        for (int j = 0; j < this.dino[i].length; j++) {
            if (this.dino[i][j] >= 1) {
                m++;
            }
        }
        if (m == 0) {
            System.out.println("Keine Nachbarn gefunden");
            return new int[0];
        }
        int[] arr = new int[m];
        m = 0;
        for (int j = 0; j < this.dino[i].length; j++) {
            if (this.dino[i][j] >= 1) {
                arr[m] = j;
                m++;
            }
        }
        //Arrays.sort(arr);
        return arr;
    }

    public File exportHTML() {
        File dinofile = new File("dinomatrix.html");

        StringBuilder dinocode = new StringBuilder();

        dinocode.append("<tr>\n\t<th></th>");
        for (int i = 0; i < this.dino.length; i++) {
           dinocode.append("\n<th>" + (i+1) + "</th>\n");//todo: in dinonuggets testen
        } //überschrift müsste fertig sein
         dinocode.append("\n</tr>\n");

        for (int i = 0; i < this.dino.length; i++) {
            dinocode.append("<tr>\n<th>" + (i+1) + "</th>\n");
            for (int j = 0; j < this.dino[i].length; j++) {
                dinocode.append("<td>" + this.dino[i][j] + "</td>\n");
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
        return dinofile;
    }
}
