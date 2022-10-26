package de.tum.in.ase;

import static java.security.SecureRandom.getSeed;

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
        if (isSeeds()) {
            this.weight = weight;
        } else {
            this.weight = weight * 0.3;
        }
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

    public Pumpkin Pumpkin(String type, double weight) {
        return Pumpkin(type, weight);
    }

    public void deseed() {
        this.seeds = false;
    }

    public void carveFace(String temper) {
        this.face = temper;
    }

}
