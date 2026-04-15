package blatt25.aufgabe03;

public class Sitzmöglichkeit {
    private byte psm;//personen sitzen maximal
    private byte psg;//personen sitzen gerade

    public Sitzmöglichkeit(int psm, int psg) {
        if (psm < 0 || psm > 127) {
            System.out.println("Schere: negative Anzahl an möglichen besetzern oder unrealistisch hohe Zahl verwendet");
            psm = 1;
        }
        this.psm = (byte)psm;
        this.psg = (byte)psg;
    }

    public byte getPsm() {
        return psm;
    }

    public void setPsm(int psm) {
        if (psm <= 0 || psm > 127) {
            System.out.println("Schere: zu geringe Anzahl an möglichen Besatzern oder unrealistisch hohe Zahl verwendet");
            return;
        }
        this.psm = (byte)psm;
    }

    public byte getPsg() {
        return psg;
    }

    public void hinsetzen(int pdss) {
        if (pdss < 0 || pdss +this.psg > this.psm) {
            System.out.println("Schere: negative Anzahl an hinsetzern oder kein Platz mehr.");
        } else {
            this.psg += (byte) pdss;
        }
    }

    public void aufstehen(int pda) {
        if (pda <= 0 || pda > this.psg) {
            System.out.println("Schere: eingabe ungültig");
            return;
        }
        this.psg -= (byte) pda;
    }
}
