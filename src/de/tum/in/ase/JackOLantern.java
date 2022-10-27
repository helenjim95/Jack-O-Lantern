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

    public JackOLantern jackOLantern(String name, Pumpkin pumpkin, Candle candle, Ghost ghost) {
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
        int pumpkin_weight = 10;
        double candle_radius = 5.0;
        double candle_height = 40.0;
        int ghost_age = 25;
        double pumpkin_weight_deseed = pumpkin_weight * 0.3;
        double candle_weight = candle_radius * candle_radius * candle_height * 3.14 * 0.95;
        Pumpkin pumpkin = new Pumpkin("type1", pumpkin_weight);
        Candle candle = new Candle(candle_radius, candle_height);
        Ghost ghost = new Ghost("scary", ghost_age);
        JackOLantern jackOLantern = new JackOLantern("Jack", pumpkin, candle, ghost);
        pumpkin.deseed();
        candle.light();
        pumpkin.carveFace(ghost.getTemper());
        jackOLantern.getLanternWeight();
        double lantern_weight = pumpkin_weight_deseed + candle_weight;
//        System.out.printf("expected pumpkin weight: %d, pumpkin deseed weight: %.2f, actual pumpkin weight: %.2f%n", pumpkin_weight, pumpkin_weight_deseed, pumpkin.getWeight());
//        System.out.printf("expected candle radius: %.2f, actual candle radius: %.2f%n", candle_radius, candle.getRadius());
//        System.out.printf("expected candle height: %.2f, actual candle height: %.2f%n", candle_height, candle.getHeight());
//        System.out.printf("expected candle weight: %.2f, actual candle weight: %.2f%n", candle_weight, candle.calculateWeight());
//        System.out.printf("expected lantern weight: %.2f, actual lantern weight: %.2f%n",lantern_weight, jackOLantern.getLanternWeight());
    }
}
