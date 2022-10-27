package de.tum.in.ase;

public class Ghost {
    private String temper;
    private int age;

    public Ghost(String temper, int age) {
        this.temper = temper;
        this.age = age;
    }

    public String getTemper() {
        return this.temper;
    }

    public int getAge() {
        return this.age;
    }

    public void setTemper(String temper) {
        this.temper = temper;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ghost ghost(String temper, int age) {
        return new Ghost(temper, age);
    }

}
