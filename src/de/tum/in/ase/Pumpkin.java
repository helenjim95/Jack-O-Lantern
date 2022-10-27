package de.tum.in.ase;

public class Pumpkin {
        private double weight;
        private String face;
        private String type;
        private boolean seeds;

    public Pumpkin(String type, double weight) {
        this.type = type;
        this.weight = weight;
        this.face = "";
        this.seeds = true;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFace() {
        return this.face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSeeds() {
        return this.seeds;
    }

    public void setSeeds(boolean seeds) {
        this.seeds = seeds;
    }

    public Pumpkin pumpkin(String type, double weight) {
        return new Pumpkin(type, weight);
    }

    public void deseed() {
        this.seeds = false;
        this.weight = this.weight * 0.3;
    }

    public void carveFace(String temper) {
        this.face = temper;
    }

}
