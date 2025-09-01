package blatt01;

public class Zinssatz {
    public static void main(String[] args) {
        double kapital_alt = 1220.00;
        double zinssatz = 2.25;
        double zinsen = kapital_alt * zinssatz / 100;
        double kapital_neu = kapital_alt + zinsen;
        System.out.println("Altes Kapital:\t" + kapital_alt + "€\nZinsatz:\t\t" + zinssatz + "%\n\nZinsen:\t\t\t" + zinsen + "€\nNeues Kapital:\t" + kapital_neu + "€");
    }
}
