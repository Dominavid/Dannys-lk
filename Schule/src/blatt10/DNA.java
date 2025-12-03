//ein byte kann genau diese Zahlen annehmen, da in einem byte (8 bits) genau 256 verschiedene werte abgebildet werden können

package blatt10;

public class DNA {

    /**
     * prüft ob sich ein als String gespeicherter DNA Code um einen korrekten DNA Code handelt
     * @param a der zu prüfende String
     * @return ob es korrekt ist (boolean)
     */
    public static boolean istDNA(String a) {
        if (a.length() % 2 != 0) {
            return false;
        }
        char[] b = a.toCharArray();
        for (int i = 0; i < b.length - 1; i += 2) {
            if (!(b[i] == 'A' && b[i + 1] == 'T' || b[i] == 'T' && b[i + 1] == 'A' || b[i] == 'G' && b[i + 1] == 'C' || b[i] == 'C' && b[i + 1] == 'G')) {
                return false;
            }
        }
        return true;
    }


    /**
     * wandelt als string gespeicherte DNA in als byte-array gespeicherte DNA um (ein byte pro genom)
     * @param a der String mit der DNA
     * @return der Byte-Array mit der DNA
     */
    public static byte[] zuDNA(String a) {
        byte[] z = new byte[a.length()]; //man könnte sich die hälfte des arrays sparen wenn man in jeden byte ein paar statt eines einzelnen genoms steckt
        char[] b = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (b[i] == 'A') {
                z[i] = 0;
            } else if (b[i] == 'T') {
                z[i] = 1;
            } else if (b[i] == 'G') {
                z[i] = 2;
            } else if (b[i] == 'C') {
                z[i] = 3;
            }
        }
        return z;
    }


    /**
     * wandelt als byte-array (ein byte pro genom) gespeicherte DNA in als string gespeicherte DNA um
     * @param a der Byte-Array mit der DNA
     * @return der String mit der DNA
     */
    public static String zuDNA(byte[] a) {
        char[] z = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '0') {
                z[i] = 'A';
            } else if (a[i] == '1') {
                z[i] = 'T';
            } else if (a[i] == '2') {
                z[i] = 'G';
            } else if (a[i] == '3') {
                z[i] = 'C';
            }
        }
        return z.toString();
    }


    /**
     * wandelt als string gespeicherte DNA in als boolean-array gespeicherte DNA um (zwei boolean pro genom)
     * @param a der String mit der DNA
     * @return der boolean-Array mit der DNA
     */
    public static boolean[] zuDNA_Bool(String a) {
        char[] b = a.toCharArray();
        boolean[] z = new boolean[b.length*2];
        for (int i = 0; i < b.length - 1; i += 2) {
            if (b[i] == 'A') {
                z[i] = false;
                z[i + 1] = false;
            } else if (b[i] == 'T') {
                z[i] = false;
                z[i + 1] = true;
            } else if (b[i] == 'G') {
                z[i] = true;
                z[i + 1] = false;
            } else if (b[i] == 'C') {
                z[i] = true;
                z[i + 1] = true;
            }
        }
        return z;
    }



    /**
     * wandelt als boolean-array gespeicherte DNA (zwei boolean pro genom) in als string gespeicherte DNA um
     * @param a der boolean-Array mit der DNA
     * @return der String mit der DNA
     */
    public static String zuDNA_Bool(boolean[] a) {
        char[] z = new char[a.length/2];
        for (int i = 0; i < a.length - 1; i += 2) {
            if (!a[i] && !a[i+1]) {
                z[i/2] = 'A';
            } else if (!a[i] && a[i+1]) {
                z[i/2] = 'T';
            } else if (a[i] && !a[i+1]) {
                z[i/2] = 'G';
            } else if (a[i] && a[i+1]) {
                z[i/2] = 'C';
            }
        }
        return z.toString();
    } //also das hier verbraucht auf jeden Fall mal nen Happen mehr Speicher als die boolean arrays, da diese eine angabe mit vier möglichen zuständen genau auf zwei bit speicherplatz speichern, was genau 4 mögliche zustände hat, wodurch die effizienz optimal ist und der Mehraufwand bei der Arbeit mit solchen arrays nur minimal höher ist.




    /**
     * wandelt als string gespeicherte DNA in als byte-array gespeicherte DNA um (ein byte pro vier genome)
     * @param a der Byte-Array mit der DNA
     * @return der String mit der DNA
     */
    public static byte[] zuDNA_effizient(String a) { //blyad bin doch zufrieden mit ein gen pro byte
        if (a.length() % 4 != 0) {
            System.out.println("Euer Gnaden, bitte gebt die Genome so an, dass wir jeweils vier Stück bündeln können.");
            return null;
        }
        char[] b = a.toCharArray();
        byte[] z = new byte[b.length/4];
        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;
        for (int i = 0; i < b.length; i++) { //byte = v0*64 + v1*16 + v2*4 + v3;


            if (b[i] == 'A') {
                g1 = 0;
            } else if (b[i] == 'T') {
                g1 = 1;
            } else if (b[i] == 'G') {
                g1 = 2;
            } else if (b[i] == 'C') {
                g1 = 3;
            }

            if (b[i+1] == 'A') {
                g2 = 0;
            } else if (b[i+1] == 'T') {
                g2 = 1;
            } else if (b[i+1] == 'G') {
                g2 = 2;
            } else if (b[i+1] == 'C') {
                g2 = 3;
            }

            if (b[i+2] == 'A') {
                g3 = 0;
            } else if (b[i+2] == 'T') {
                g3 = 1;
            } else if (b[i+2] == 'G') {
                g3 = 2;
            } else if (b[i+2] == 'C') {
                g3 = 3;
            }

            if (b[i+3] == 'A') {
                g4 = 0;
            } else if (b[i+3] == 'T') {
                g4 = 1;
            } else if (b[i+3] == 'G') {
                g4 = 2;
            } else if (b[i+3] == 'C') {
                g4 = 3;
            }

            //den scheiß vergeben

            int i1 = (g1 * 64 + g2 * 16 + g3 * 4 + g4) - 128;
            z[i/4] = (byte) i1;
        }
        return z; //suka blyad der scheiß ist wahrscheinlich gottlos falsch aber egal ich geh jetz erstmal heulen weil ich gesehen hab das ich das jetzt auch noch andersrum machen muss
    }





    /**
     * wandelt als byte-array gespeicherte DNA (ein byte pro vier genome) in als string gespeicherte DNA um
     * @param a der String mit der DNA
     * @return der Byte-Array mit der DNA
     */
    public static String zuDNA_effizient(byte[] a) {
        char[] z = new char[a.length*4];
        for (int i = 0; i < z.length - 3; i += 4) {
            byte j = a[i/4];
            int k = 0;
            int x = -64;
            int y = 0;
            for (int c = 0; c < 4; c++) {
                while (j >= x) {
                    k = 0;
                    k++;
                    j -= x;
                }
                if (k == 0) {
                    z[i+c] = 'A';
                } else if (k == 1) {
                    z[i+c] = 'T';
                } else if (k == 2) {
                    z[i+c] = 'G';
                } else if (k == 3) {
                    z[i+c] = 'C';
                }
                x /=4;
            }
        }
        return z.toString(); //wahrscheinlich noch gottlos falscher aber jetz bin ich zumindest durch
    }


    public static void main(String[] args) {
        String fickdieaufgabe = "ATCGTAATATATCGCG";
        System.out.println(istDNA(fickdieaufgabe));
        //DNA dna = new DNA(); was zum f hat java mir da vorgeschlagen gibt es das etwa??
    }
}
//es wird wie in c) bereits erwähnt mindestens einmal zu viel Speicher in den byte arrays verbraucht, da man mit leichtigkeit ein paar pro byte speichern könnte, wenn man schlau wäre (was ich nicht bin) könnte man mit Sicherheit auch noch mehr genome pro byte speichern ohne eine ewig lange liste zu brauchen