package blatt01;

public class Zinssatz {
    public static void main(String[] args) {
        double kapital_alt = 1220.00;
        double zinssatz = 2.25;
        double zinsen = kapital_alt * zinssatz / 100;
        double kapital_neu = kapital_alt + zinsen;
        System.out.printf("Altes Kapital:\t%.2f€\nZinsatz:\t\t%.2f%%\n\nZinsen:\t\t\t%.2f€\nNeues Kapital:\t%.2f€", kapital_alt, zinssatz, zinsen, kapital_neu);
    }
}
