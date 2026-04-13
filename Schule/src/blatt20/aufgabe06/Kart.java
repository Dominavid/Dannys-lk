package blatt20.aufgabe06;

import java.util.Scanner;

public class Kart {
    private String modellName;
    private double maxGeschwindigkeit;
    private double beschleunigung;


    public Kart(String modellName, double maxGeschwindigkeit) {
        this.modellName = modellName;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.beschleunigung = 0;
    }


    public String getModellName() {
        return modellName;
    }

    public double getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }
    public void setMaxGeschwindigkeit(double maxGeschwindigkeit) {
        if (maxGeschwindigkeit < 0) {
            maxGeschwindigkeit = 0;
        }
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public double getBeschleunigung() {
        return beschleunigung;
    }
    public void setBeschleunigung(double beschleunigung) {
        if (beschleunigung < 0) {
            beschleunigung = 0;
        }
        this.beschleunigung = beschleunigung;
    }


    public void beschleunige() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie schnell willste beschleunigern? (faktor)");
        beschleunigung = sc.nextDouble();
    }
}
