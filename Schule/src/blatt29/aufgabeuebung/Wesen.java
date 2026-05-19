package blatt29.aufgabeuebung;

public class Wesen {
    private int hp;
    private int maxHp;
    private int angriff;
    private int verteidigung;
    private double glück;
    private int geschwindigkeit;

    public Wesen(int maxHP, int angriff, int verteidigung, double glück, int geschwindigkeit) {
        this.hp = maxHP;
        if (maxHP <= 0) throw new IllegalArgumentException("maxHP <= 0");
        this.maxHp = maxHP;
        if (angriff <= 0) throw new IllegalArgumentException("angriff <= 0");
        this.angriff = angriff;
        if (verteidigung <= 0) throw new IllegalArgumentException("verteidigung <= 0");
        this.verteidigung = verteidigung;
        if (glück >= 1) this.glück = 1; else if (glück <= 0) this.glück = 0; else this.glück = glück;
        this.geschwindigkeit = geschwindigkeit;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if (hp > this.maxHp) hp = this.maxHp; else if (hp < 0) this.hp = 0;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        if (maxHp <= 0) throw new IllegalArgumentException("maxHp <= 0");
        this.maxHp = maxHp;
    }

    public int getAngriff() {
        return angriff;
    }

    public void setAngriff(int angriff) {
        if (angriff <= 0) throw new IllegalArgumentException("angriff <= 0");
        this.angriff = angriff;
    }

    public int getVerteidigung() {
        return verteidigung;
    }

    public void setVerteidigung(int verteidigung) {
        if (verteidigung <= 0) throw new IllegalArgumentException("verteidigung <= 0");
        this.verteidigung = verteidigung;
    }

    public double getGlück() {
        return glück;
    }

    public void setGlück(double glück) {
        if (glück >= 1) this.glück = 1; else if (glück <= 0) this.glück = 0; else this.glück = glück;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        if (geschwindigkeit <= 0) throw new IllegalArgumentException("geschwindigkeit <= 0");
        this.geschwindigkeit = geschwindigkeit;
    }



    public void angreifen(Wesen ziel) {

    }
}
