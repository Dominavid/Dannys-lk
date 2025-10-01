package blatt07;

public class ArbeitMitArrays {

    /**
     * int-Arrays werden gedruckt
     * @param arr
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
     * @param arr
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
     * @param arr
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
     * @param arr
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
     * @param arr
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
     * @param arr
     * @return
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
                    if (arr[i] >= arr[i + 1]) {
                        return false;
                    }
                } else  {
                    if (arr[i] <= arr[i + 1]) {
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

    /**
     * jetzt wird addiert
     * @param arr1
     * @param arr2
     * @return
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
     * @param arr
     * @return
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
     * @param arr
     * @return
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
     * @param arr
     * @return
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
     * @param arr
     * @return
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
        printArray(arr1);
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
