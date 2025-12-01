//ein byte kann genau diese Zahlen annehmen, da in einem byte (8 bits) genau 256 verschiedene werte abgebildet werden können

package blatt10;

public class DNA {

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



    public static byte[] zuDNA_effizient(String a) { //DANKEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEee :DDDDDDDDD
        if (a.length() % 4 != 0) {
            System.out.println("Euer Gnaden, bitte gebt die Genome so an, dass wir jeweils vier Stück bündeln können.");
            return null;
        }
        char[] b = a.toCharArray();
        byte[] z = new byte[b.length/2];
        int k;
        int l;
        int m;
        int n;
        for (int i = 0; i < b.length; i++) { //byte = v0*64 + v1*16 + v2*4 + v3;

            z[i/4] =
        }
        return z;
    }


    public static void main(String[] args) {
        String fickdieaufgabe = "ATCGTAATATATCGCG";
        System.out.println(istDNA(fickdieaufgabe));
        //DNA dna = new DNA(); was zum f hat java mir da vorgeschlagen gibt es das etwa??
    }
}
//es wird wie in c) bereits erwähnt mindestens einmal zu viel Speicher in den byte arrays verbraucht, da man mit leichtigkeit ein paar pro byte speichern könnte, wenn man schlau wäre (was ich nicht bin) könnte man mit Sicherheit auch noch mehr genome pro byte speichern ohne eine ewig lange liste zu brauchen