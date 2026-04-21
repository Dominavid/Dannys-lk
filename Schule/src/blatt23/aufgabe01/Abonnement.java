package blatt23.aufgabe01;



public enum Abonnement {
    ASIATE((short)99, (short)10),
    SMALL((short)399, (short)50),
    MEDIUM((short)599, (short)100),
    LARGE((short)1199, (short)300),
    SCHWARZER((short)24.99, (short)700);


    final short ppM; //papier pro Monat
    final short drucken;

    Abonnement(short ppM, short drucken) {
        this.ppM = ppM;
        this.drucken = drucken;
    }
}
