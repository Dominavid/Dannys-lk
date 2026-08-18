package blatt32.aufgabe03;

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
        if (i >=)//todo
        this.dino[i][j] = weight;
        if (!directed) {
            this.dino[j][i] = weight;
        }
    }
    public void addEdge(int i, int j, int weight) {
        this.addEdge(i, j, weight, false);
    }
    public void addEdge(int i, int j, boolean directed) {
        this.addEdge(i, j, 1, directed);
    }
    public void addEdge(int i, int j) {
        this.addEdge(i, j, 1, false);
    }

    public int size() {
        return this.dino.length;
    }
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
    public int[][] getDinoMatrix() {
        return this.dino;
    }
}
