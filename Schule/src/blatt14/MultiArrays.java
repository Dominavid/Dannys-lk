package blatt14;

public class MultiArrays {

    /**
     * printet einen zweidimensionalen int-Array
     * @param arr der zu printende 2d-array (optional: max. 3-stellig, für cleane anzeige)
     */
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for  (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


    /**
     * printet einen zweidimensionalen double-Array
     * @param arr der zu printende 2d-array (optional: max. 4-stellig, für cleane anzeige)
     */
    public static void print2DArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for  (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%.6f\t", arr[i][j]);
            }
            System.out.println();
        }
    }


    /**
     * printet einen zweidimensionalen char-Array
     * @param arr der zu printende 2d-array
     */
    public static void print2DArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for  (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


    /**
     * erstellt einen zweidimensionalen Int-Array und füllt diesen mit Zufallswerten innerhalb einer gegebenen Reichweite
     * @param a Länge des äußeren Arrays
     * @param b Länge der inneren Arrays
     * @param p Grenzpunkt 1
     * @param q Grenzpunkt 2
     * @return der erstellte und gefüllte Array
     */
    public static int[][] createRandom2DIntArray(int a, int b, int p, int q) {
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            arr[i] = blatt13.Zufall.zufallArray(p, q, b);
        }
        return arr;
    }



    /**
     * erstellt einen zweidimensionalen double-Array und füllt diesen mit Zufallswerten innerhalb einer gegebenen Reichweite (Schere, hab die aufgabe nicht gelesen)
     * @param a Länge des äußeren Arrays
     * @param b Länge der inneren Arrays
     * @param p Grenzpunkt 1
     * @param q Grenzpunkt 2
     * @return der erstellte und gefüllte Array
     */
    public static double[][] createRandom2DDoubleArray(int a, int b, double p, double q) {
        double[][] arr = new double[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = blatt13.Zufall.zufall(p,q);
            }
        }
        return arr;
    }



    public static int[][] createCountingArray(int a, int b) {
        int[][] arr = new int[a][b];
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = count++;
            }
        }
    return arr;
    }


    /**
     * erstellt einen mit Leerzeichen gefüllten 2D Char-Array
     * @param a die Länge des äußeren Arrays
     * @param b die Länge der inneren Arrays
     * @return der Array
     */
    public static char[][] createEmpty2DCharArray(int a, int b) {
        char[][] arr = new char[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = ' ';
            }
        }
        return arr;
    }



    public static boolean istIdentisch(char[][] arr, char[][] brr) {
        if (arr.length != brr.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != brr[i].length) {
                return false;
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != brr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] arr = {{1,2,5,3,2,1,6},{3,4,6,34,3,7,3},{5,6,6,433,5,3},{1,3,6,43,5,5},{9,6,4,63,25,4}};
        print2DArray(createRandom2DIntArray(8,8,13,2));
        print2DArray(createRandom2DDoubleArray(8,8,1.6,2744.5));
        print2DArray(createCountingArray(5,5));
        print2DArray(createEmpty2DCharArray(15,15));
    }
}
