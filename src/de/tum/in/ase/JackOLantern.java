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
        pumpkin.deseed();
        this.candle = candle;
        this.ghost = ghost;
    }
    public JackOLantern JackOLantern(String name, Pumpkin pumpkin, Candle candle, Ghost ghost) {
        return new JackOLantern(name, pumpkin, candle, ghost);
    }

    public double getLanternWeight() {
        //TODO calculate the total weight of your Jack O'Lantern
        return this.pumpkin.getWeight() * 0.3 + this.candle.calculateWeight();
    }


    public static void main(String[] args) {
       /*
       You can test your code here by constructing objects. Have fun :)
       */
        Pumpkin pumpkin = new Pumpkin("type1", 10);
        Candle candle = new Candle(5, 40);
        Ghost ghost = new Ghost("scary", 25);
        JackOLantern jackolantern = new JackOLantern("Jack", pumpkin, candle, ghost);
    }
}
