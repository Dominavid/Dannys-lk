package blatt14;

public class Simulationen {

    /**
     * geht einen 2d char array durch und ersetzt jedes element mit gegebener Wahrscheinlichkeit entweder durch 1 oder lässt es gleich
     * @param charr der array
     * @param w die Wahrscheinlichkeit 0/kleiner = keine Wahrscheinlichkeit; 1/größer = volle Wahrscheinlichkeit
     * @return der array
     */
    public static char[][] fuellen(char[][] charr, double w) {
        for (int i = 0; i < charr.length; i++) {
            for (int j = 0; j < charr[0].length; j++) {
                if (Math.random() <= w && w != 0) {
                    charr[i][j] = '1';
                }
            }
        }
        return charr;
    }



    /**
     * geht einen 2d char array durch und ersetzt gewählte mit gegebener Wahrscheinlichkeit entweder durch 1 oder lässt es gleich
     * @param charr der array
     * @param w die Wahrscheinlichkeit 0/kleiner = keine Wahrscheinlichkeit; 1/größer = volle Wahrscheinlichkeit
     * @param a die Zeichen die ersetzt werden
     * @return der array
     */
    public static char[][] fuellen(char[][] charr, double w, char a) {
        for (int i = 0; i < charr.length; i++) {
            for (int j = 0; j < charr[0].length; j++) {
                if (Math.random() <= w && w != 0 && charr[i][j] == a) {
                    charr[i][j] = '1';
                }
            }
        }
        return charr;
    }



    public static char[][] platzieren(char[][] charr, char a) {
        int r = (int) Math.round(Math.random()*charr.length);
        int r2 = (int) Math.round(Math.random()*charr[r].length);

        charr[r][r2] = a;
        return charr;
    }


    public static void main(String[] args) {
        double y = Math.random();
        int x = (int) Math.round(y);
        System.out.println(y);
        System.out.println(x);
    }
}
