package blatt13;

public class QuadratApproximation {

    /**
     * berechnet die Fläche eines Quadrats anhand einer Seitenlänge
     * @param a gegebene Seitenlänge (double)
     * @return Flächeninhalt (double)
     */
    public static double flaecheQuadrat(double a) {
        return Math.abs(a * a);
    }


    /**
     * berechnet die ungefähre (max. Abw.: 0,00001) Seitenlänge eines Quadrats anhand des Flächeninhalts
     * @param a Flächeninhalt (double)
     * @return Seitenlänge (double)
     */
    public static double sucheSeitenlänge(double a) {
        if (a <= 0) {
            System.out.println("Quadrat existiert nicht, Schere");
        }
        double e = a;
        if (a <= 1) {
            e = 1;
        }
        for (double i = 0; i < e; i += 0.00001) {
            //System.out.println(i);
            if (Math.abs(i*i-a) <= 0.00002) {
                return i;
            }
        }

        System.out.println("Euer Exzellenz mögen verzeihen, ein Fehler scheint aufgetreten zu sein.");
        return 0;
    }


    /**
     * tut das gleiche wie sucheSeitenlänge, aber binär
     * @param a Flächeninhalt (double)
     * @return Seitenlänge (double)
     */
    public static double sucheSeitenlängebinär(double a) {
        if (a <= 0) {
            System.out.println("Quadrat existiert nicht, Schere");
        }
        double o = a;
        if (a <= 1) {
            o = 1;
        }
        double u = 0;
        double i = (o+u)/2;
        while (Math.abs(i*i-a) > 0.00002) {
            if (i*i < a) {
                u = i;
            } else {
                o = i;
            }
            i = (o+u)/2;
        }
        return i;
    }



    public static void main(String[] args) {
        System.out.printf("%.5f\n\n",sucheSeitenlänge(10000.0));
        System.out.printf("%.5f",sucheSeitenlängebinär(10000.0));
    }
}
