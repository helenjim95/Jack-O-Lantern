package de.tum.in.ase;

public class JackOLantern {
    //TODO construct correct attributes
    private String name;
    Pumpkin pumpkin;
    Candle candle;
    Ghost ghost;

    //TODO write constructor with parameters
    public JackOLantern(String name, Pumpkin pumpkin, Candle candle, Ghost ghost) {
        this.name = name;
        this.pumpkin = pumpkin;
        this.candle = candle;
        this.ghost = ghost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pumpkin getPumpkin() {
        return pumpkin;
    }

    public void setPumpkin(Pumpkin pumpkin) {
        this.pumpkin = pumpkin;
    }

    public Candle getCandle() {
        return candle;
    }

    public void setCandle(Candle candle) {
        this.candle = candle;
    }

    public Ghost getGhost() {
        return ghost;
    }

    public void setGhost(Ghost ghost) {
        this.ghost = ghost;
    }

    public JackOLantern JackOLantern(String name, Pumpkin pumpkin, Candle candle, Ghost ghost) {
        return new JackOLantern(name, pumpkin, candle, ghost);
    }

    public double getLanternWeight() {
        //TODO calculate the total weight of your Jack O'Lantern
        return this.pumpkin.getWeight() + this.candle.calculateWeight();
    }

    public static void main(String[] args) {
       /*
       You can test your code here by constructing objects. Have fun :)
       */
        Pumpkin pumpkin = new Pumpkin("type1", 10);
        pumpkin.deseed();
        pumpkin.setWeight(pumpkin.getWeight());
        Candle candle = new Candle(5, 40);
        candle.light();
        Ghost ghost = new Ghost("scary", 25);
        JackOLantern jackOLantern = new JackOLantern("Jack", pumpkin, candle, ghost);
        pumpkin.carveFace(ghost.getTemper());
        jackOLantern.getLanternWeight();
    }
}
