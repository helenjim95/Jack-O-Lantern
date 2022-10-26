package de.tum.in.ase;

public class Candle {
    private double height;
    private double radius;
    private boolean burning;

    public Candle(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.burning = false;
    }

    public double getHeight() {
        return this.height;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean isBurning() {
        return this.burning;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setBurning(boolean burning) {
        this.burning = burning;
    }

    public Candle Candle(double radius, double height) {
        return Candle(radius, height);
    }

    public void light() {
        burning = true;
    }

    public double calculateWeight() {
        return getRadius() * getRadius() * getHeight() * 3.14 * 0.95;
    }

}
