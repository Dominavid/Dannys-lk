package blatt13;

public class Risiko {
    /**
     * berechnet eine Runde im Angreifer-Verteidiger-Spiel
     * @return noch stehende figuren (Angreifer, Angreifer, Verteidiger, Verteidiger)
     */
    public static boolean[] runde() {
        int[] würfelverteidiger = blatt11.BubbleSort.bubbleSortAbsteigent(Zufall.zufallArray(1,6,2));

        int[] würfelangreifer = blatt11.BubbleSort.bubbleSortAbsteigent(Zufall.zufallArray(1,6,3));


        boolean[] angreiferverteidigerfigueren = new boolean[]{true, true, true, true};

        if (würfelangreifer[0] > würfelverteidiger[0]) {
            angreiferverteidigerfigueren[2] = false;
        } else {
            angreiferverteidigerfigueren[0] = false;
        }

        if (würfelangreifer[1] > würfelverteidiger[1]) {
            angreiferverteidigerfigueren[3] = false;
        } else {
            angreiferverteidigerfigueren[1] = false;
        }

        return angreiferverteidigerfigueren;
    }




    public static void main(String[] args) {
        int angrifferfolgreich = 0;
        int angrifffehlgeschlagen = 0;
        int angriffteilweiseerfolgreich = 0;
        for (int i = 0; i < 25000000; i++) {
            boolean[] ergebnis = runde();
            //blatt07.ArbeitMitArrays.printArray(runde());
            if (ergebnis[0] && ergebnis[1]) {
                angrifferfolgreich++;
            } else if (ergebnis[0] || ergebnis[1]) {
                angriffteilweiseerfolgreich++;
            } else {
                angrifffehlgeschlagen++;
            }
        }
        System.out.println("Der Angriff war " + angrifferfolgreich + " Mal vollständig erfolgreich, " + angriffteilweiseerfolgreich + " Mal teilweise erfolgreich und ist " + angrifffehlgeschlagen + " Mal vollständig fehlgeschlagen, Sir.");
    }
}
