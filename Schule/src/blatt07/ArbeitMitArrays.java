package blatt07;

public class ArbeitMitArrays {

    /**
     * int-Arrays werden gedruckt
     * @param arr Array der geprintet (oder geprinted?) wird
     */
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(" ]\n");
            } else {
                System.out.print(" | ");
            }
        }
    }

    /**
     * double-Arrays werden gedruckt
     * @param arr Array der geprintet (oder geprinted?) wird
     */
    public static void printArray(double[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(" ]\n");
            } else {
                System.out.print(" | ");
            }
        }
    }

    /**
     * die kommentare werden langsam repetetiv...
     * @param arr Array der geprintet (oder geprinted?) wird
     */
    public static void printArray(boolean[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(" ]\n");
            } else {
                System.out.print(" | ");
            }
        }
    }

    /**
     * richtig sinnvoll hier überall einen kommentar zu zu schreiben
     * @param arr Array der geprintet (oder geprinted?) wird
     */
    public static void printArray(char[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(" ]\n");
            } else {
                System.out.print(" | ");
            }
        }
    }

    /**
     * mir kommt eine idee zu einem java update...
     * @param arr Array der geprintet (oder geprinted?) wird
     */
    public static void printArray(String[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(" ]\n");
            } else {
                System.out.print(" | ");
            }
        }
    }

    /**
     * jetzt wird gecheckt ob der mist sortiert ist
     * @param arr Array der geprüft wird
     * @return Wahrheitswert der sagt ob der Array sortiert ist
     */
    public static boolean istSortiert(int[] arr) {
        Boolean aufsteigend = null;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                aufsteigend = false;
                break;
            } else if (arr[i] < arr[i + 1]) {
                aufsteigend = true;
                break;
            }
        }
            if (aufsteigend == null) {
                System.out.println("Error. Sämtliche Zahlen sind exakt gleich.");
            } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (aufsteigend) {
                    if (arr[i] >/*=*/ arr[i + 1]) {
                        return false;
                    } //auf das mich diese gleichzeichen auf immer an meine torheit erinnern
                } else  {
                    if (arr[i] </*=*/ arr[i + 1]) {
                        return false;
                    }
                }
            }
            return true;
        }
        System.out.println("Error");
        System.exit(0);
        return false;
    }

    public static Integer[] stalinSort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                arr[i - 1] = null;
            }
        }
        return arr;
    }

    /**
     * jetzt wird addiert
     * @param arr1 erster Array
     * @param arr2 zweiter Array
     * @return Ergebnis der Addition
     */
    public static int[] add(int[] arr1, int[] arr2) {
        int länge = 0;
        boolean einslänger;
        if (arr1.length > arr2.length) {
            länge = arr1.length;
            einslänger = true;
        } else {
            länge = arr2.length;
            einslänger = false;
        }
        int[] ergebnis = new int[länge];
        for (int i = 0; i < ergebnis.length; i++) {
            if (einslänger) {
                if (i < arr2.length) {
                    ergebnis[i] = arr1[i] + arr2[i];
                } else {
                    ergebnis[i] = arr1[i];
                }
            } else {
                if (i < arr1.length) {
                    ergebnis[i] = arr1[i] + arr2[i];
                } else {
                    ergebnis[i] = arr2[i];
                }
            }
        }
        return ergebnis;
    }


    /**
     * das war schwieriger als es hätte sein sollen
     * @param arr wird verschoben
     * @return verschobener Array
     */
    public static int[] shiftLeft(int[] arr) {
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 2] = temp;
        return arr;
    }

    /**
     * das hab ich unnötigerweise gemacht glaub ich
     * @param arr wird verschoben
     * @return verschobener Array
     */
    public static int[] shiftRight(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[1] = temp;
        return arr;
    }


    /**
     * immerhin eine Sache die heute schön schnell geht
     * @param arr wird verschoben
     * @return verschobener Array
     */
    public static int[] shiftLeftAbsolute(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return arr;
    }


    /**
     * auch ganz nett...
     * @param arr wird verschoben
     * @return verschobener Array
     */
    public static int[] shiftRightAbsolute(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 0;
        return arr;
    }






    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,8,11,21,46};
        boolean[] arr3 = {true, true, false, true, false, false, true};
        double[] arr4 = {1.4, 2.9, 7.8, 2.8, 1.3, 4.1};
        char[] arr5 = {'H','i','e','r',' ','s','t','e','h','t',' ','n','i','c','h','t','s',' ','w','i','c','h','t','i','g','e','s',',',' ','a','l','s','o',' ','e','n','t','s','p','a','n','n','e','n',' ','S','i','e',' ','s','i','c','h',',',' ','o','k','a','y',' ','o','d','e','r',' ','h','a','t',' ','d','a',' ','e','i','n','e','r',' ','r','e','i','n','g','e','s','c','h','i','f','f','t','?'};
        String[] arr6 = {"lul", "amogus", "ඞsusඞ", "wer das liest kann lesen"};
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);
        printArray(arr5);
        printArray(arr6);
        printArray(shiftLeft(arr1));
        //printArray(shiftLeftAbsolute(arr1));
        printArray(arr2);
        printArray(shiftRight(arr2));
        //printArray(shiftRightAbsolute(arr2));
        boolean sortiert1 = istSortiert(arr1);
        boolean sortiert2 = istSortiert(arr2);
        System.out.println("\n\n1 ist sortiert? " + sortiert1 + "\n2 ist sortiert? " + sortiert2 + "\n\n\n\n\nHier kommt das addierte:");
        int[] err = add(arr1, arr2);
        printArray(err);
    }
}