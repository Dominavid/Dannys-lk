package blatt13;

public class PenAndPaper {
    /**
     * Würfelt einen oder mehrere Würfel
     * @param n Anzahl der Würfel
     * @param x Anzahl der Seiten
     * @return gewürfelte Zahl
     */
    public static int wuerfel(int n, int x) {
        int z = 0;
        int[] e = Zufall.zufallArray(1, x, n);
        for (int i = 0; i < n; i++) {
            z += e[i];
        }
        return z;
    }


    /**
     * Macht einen Check mit zwanzigseitigem Würfel
     * @param a Mindestwert zu übertreffen
     * @param v vorteil?
     * @param n nachteil?
     * @return ob der Check gelungen ist (boolean)
     */
    public static boolean check(int a, boolean v, boolean n) {
        int b = wuerfel(1, 20);
        int c;
        if (v||n) {
            c = wuerfel(1, 20);
            if (c > b) {
                if (v) {
                    b = c;
                }
            } else if (n) {
                b = c;
            }
        }
        if (b == 1) {
            return false;
        } else if (b == 20) {
            return true;
        }
        return b >= a;
    }


    /**
     *
     * @param a Anzahl der Angriffswürfel
     * @param b Summe der Angriffswürfel
     * @param c Angriffsbonus
     * @param d Rüstungsklasse
     * @param v Vorteil?
     * @param n Nachteil?
     * @return
     */
    public static int angriff(int a, int b, int c, int d, boolean v, boolean n) {
        if (!check(d,v,n)) {
            return -1;
        }
        int z = wuerfel(a, b);
        z += c;
        //z -= d;
        if (z <= 0) {
            return 0;
        }
        return z;
    }


    public static void main(String[] args) {
        int hpbarbarx = 70;
        int nachteilbarbarx = 3;

        int hpbardex = 42;
        int vorteilbardex = 3;


        int hpbarbar = hpbarbarx;
        int nachteilbarbar = nachteilbarbarx;
        int siegebarbar = 0;
        boolean nachteil = true;


        int hpbarde = hpbardex;
        int vorteilbarde = vorteilbardex;
        int siegebarde = 0;
        boolean vorteil = true;


        for (int i = 0; i < 100000; i++) {
            while (hpbarbar > 0 && hpbarde > 0) {
                if (vorteilbarde == 0) {
                    vorteil = false;
                } else {
                    vorteilbarde -= 1;
                }
                if (nachteilbarbar == 0) {
                    nachteil = false;
                } else {
                    nachteilbarbar -= 1;
                }

                int schadenbarde = angriff(1, 6, 2, 14, vorteil, false);
                if  (schadenbarde < 0) {
                    schadenbarde = 0;
                }
                int schadenbarbar = angriff(1, 8, 1, 10, false, nachteil);
                if (schadenbarbar < 0) {
                    schadenbarbar = 0;
                }


                hpbarbar -= schadenbarde;
                hpbarde -= schadenbarbar;
                //System.out.println(hpbarbar);
                //System.out.println(hpbarde);
            }
            if (hpbarbar <= 0) {
                siegebarde++;
            } else {
                siegebarbar++;
            }
            hpbarbar = hpbarbarx;
            hpbarde = hpbardex;
            nachteilbarbar = nachteilbarbarx;
            vorteilbarde = vorteilbardex;
            nachteil = true;
            vorteil = true;
        }

        System.out.println("Der Barde siegte in " + siegebarde + " Fällen, während er in " + siegebarbar + " Fällen unterlag, Sir.");
        /*  Siegeschancen Barde:
        normale Einstellungen:                                  1.12%   (sehr präzise)
        Barde hat stets Vorteil:                            ca. 13%     (Ergebnisse ungenauer ---> Höherer Glückaspekt)
        Barbar hat stets Nachteil:                              21.4%   (deutlich präziser als Barde mit Vorteil, wenig unpräziser als normal)
        Barde hat stets Vorteil + Barbar hat stets Nachteil:    63-64%  (wenig unpräziser als Barbar mit Nachteil)
        Barde hat 2 Würfel:                                     24%
        Barde hat d20 Würfel:                                   56%
        Barde hat 2d20 Würfel:                                  91%
        */
    }
}
