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

    public Candle candle(double radius, double height) {
        return new Candle(radius, height);
    }

    public void light() {
        burning = true;
    }

    public double calculateWeight() {
        double PI = 3.14;
        double WAX_DENSITY = 0.95;
        return PI * this.radius * this.radius * this.height * WAX_DENSITY;
    }

}
