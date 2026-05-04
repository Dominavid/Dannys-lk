package blatt27.aufgabe01;

import java.util.Arrays;

public class DynArray {
    private int[] lul;

    public DynArray() {
        this.lul = new int[0];
    }

    public void ausgabe() {
        blatt07.ArbeitMitArrays.printArray(this.lul);
    }

    public boolean isEmpty() {
        return this.lul == null || this.lul.length == 0;
    }

    public int size() {
        return this.lul.length;
    }

    public int get(int index) {
        if (index < 0 || index >= this.lul.length) {
            throw new IndexOutOfBoundsException("\"" + System.getProperty("user.name") + ", dödel\"\n\n\n-Tyrollosaurus rex");
        }
        return lul[index];
    }

    public boolean contains(int zahl) {
        return blatt10.LineareSuche.suchen(this.lul, zahl);
    }

    public int indexOf(int zahl) {
        for (int i = 0; i < this.lul.length; i++) {
            if (this.lul[i] == zahl) {
                return i;
            }
        }
        return -1;
    }

    public void add(int zahl) {
        this.lul = Arrays.copyOf(this.lul, this.lul.length + 1);
        this.lul[this.lul.length - 1] = zahl;
    }

    public void add(int zahl, int index) {
        if (index < 0 || index > this.lul.length) {
            throw new IndexOutOfBoundsException("\"" + System.getProperty("user.name") + ", dödel\"\n\n\n-Tyrollosaurus rex");
        }

        this.lul = Arrays.copyOf(this.lul, this.lul.length + 1);

        if (this.lul.length > index+1) {
            for (int i = this.lul.length-1; i > index; i--) {
                this.lul[i] = lul[i-1];
            }
        }

        this.lul[index] = zahl;
    }

    public void set(int zahl, int index) {
        if (index < 0 || index > this.lul.length) {
            throw new IndexOutOfBoundsException("\"" + System.getProperty("user.name") + ", dödel\"\n\n\n-Tyrollosaurus rex");
        }
        this.lul[index] = zahl;
    }

    public int remove(int index) {
        if (index < 0 || index >= this.lul.length) {
            throw new IndexOutOfBoundsException("\"" + System.getProperty("user.name") + ", dödel\"\n\n\n-Tyrollosaurus rex");
        }

        int temp = this.lul[index];
        for (int i = index; i > this.lul.length-1; i++) {
            this.lul[i] = this.lul[i+1];
        }

        this.lul =  Arrays.copyOf(this.lul, this.lul.length-1);
        return temp;
    }
}
